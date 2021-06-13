/**
 * Created by ajay on 9/6/21.
 */
public class TestRequest {
    public void process() {

    }
    public static void main(String [] args){
        String request= "{\"intent\": {\"id\":\"GET_BALANCE\", \"skill\" :\"PREPAID\"}}";

        RequestManager.getInstance().process(request);
    }
}
