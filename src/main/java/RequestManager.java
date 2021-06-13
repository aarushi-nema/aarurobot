import com.google.gson.Gson;

/**
 * RequestManager provides all the functions to process the request
 * Created by ajay on 9/6/21.
 */
public class RequestManager {

    private static RequestManager instance;

    public static RequestManager getInstance(){
        if(instance==null)
            instance = new RequestManager();
        return instance;
    }

    public Request getFromText(String jsonText){
        //GSON is a JSON String to Java Class object converter
        Request request= new Gson().fromJson(jsonText, Request.class);
        return request;
    }

    public Request process(String jsonText) {
        //JSON String to Request object conversion
        Request request= getFromText(jsonText);
        //process the request using the Request object
        return process(request);
    }

    public Request process(Request request){
        if(request.getIntent()==null){
            //throw exception if request has no intent
            request.getResponse().setErrorMessage("Intent is Null");
            return request;
        }
        Intent tsiIntent = SkillManager.getInstance().getIntent(request.getIntent());
        if (tsiIntent == null) {
            //throw exception if request has invalid intent
            request.getResponse().setErrorMessage("Invalid Intent ");
            return request;
        }
        request.setTsiIntent(tsiIntent);
        request.dump();
        return request;
    }

}
