/**
 * Created by ajay on 9/6/21.
 */
public class Request {

    private Intent intent;
    private Intent tsiIntent;

    public Intent getIntent() {
        return intent;
    }

    public void setIntent(Intent intent) {
        this.intent = intent;
    }

    public void dump(){
        if (intent != null) {
            System.out.println("Requested Intent");
            intent.dump();
        }
        if (tsiIntent != null) {
            System.out.println("Identified Intent");
            tsiIntent.dump();
        }
    }

    public Intent getTsiIntent() {
        return tsiIntent;
    }

    public void setTsiIntent(Intent tsiIntent) {
        this.tsiIntent = tsiIntent;
    }
}
