import com.google.gson.Gson;

/**
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
        Request request= new Gson().fromJson(jsonText, Request.class);
        return request;
    }

    public void process(String jsonText){
        Request request= getFromText(jsonText);
        request.dump();
    }
}
