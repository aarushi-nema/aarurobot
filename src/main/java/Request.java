import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by ajay on 9/6/21.
 */
public class Request {

    private Intent intent;
    private Intent tsiIntent;
    private Response response;

    public Request(){
        response= new Response();
    }


    public Intent getIntent() {
        return intent;
    }

    public void setIntent(Intent intent) {
        this.intent = intent;
    }

    public void dump(){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(this));
    }

    public Intent getTsiIntent() {
        return tsiIntent;
    }

    public void setTsiIntent(Intent tsiIntent) {
        this.tsiIntent = tsiIntent;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}
