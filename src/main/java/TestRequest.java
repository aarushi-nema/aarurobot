/**
 * Request is coming in a json text format and we will process(validate, process, and make a response)
 * Created by ajay on 9/6/21.
 */
public class TestRequest {

    public static void main(String [] args){
        //JSON string format Request
        String request_text= "{\"intent\": {\"id\":\"GET_BALANCE\", \"skill\" :\"PREPAID\"}}";
        //Exception handling for processing of request
        try {
            //We are giving request manager the request for processing
            RequestManager.getInstance().process(request_text);
            System.out.println("Processed successfully");

        }catch (Exception e) {
            System.out.println("Failed : " + e.getMessage());
        }
    }
}
