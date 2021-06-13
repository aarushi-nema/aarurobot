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

    public void process(String jsonText) throws Exception{
        //JSON String to Request object conversion
        Request request= getFromText(jsonText);
        //process the request using the Request object
        process(request);
    }

    public void process(Request request) throws Exception{
        if(request.getIntent()==null){
            //throw exception if request has no intent
            throw new Exception("Intent is null");
        }


        Intent tsiIntent = SkillManager.getInstance().getIntent(request);
        if (tsiIntent == null) {
            //throw exception if request has invalid intent
            throw new Exception("Invalid Intent");
        }
        request.setTsiIntent(tsiIntent);
        request.dump();
    }

}
