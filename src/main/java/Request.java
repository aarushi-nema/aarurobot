/**
 * Created by ajay on 9/6/21.
 */
public class Request {

    private Intent intent;

    public Intent getIntent() {
        return intent;
    }

    public void setIntent(Intent intent) {
        this.intent = intent;
    }

    public void dump(){
        intent.dump();
    }
}
