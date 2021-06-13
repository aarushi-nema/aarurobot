import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;

/**
 * Created by ajay on 13/6/21.
 */
public class Response {
    int code;
    String message;
    HashMap<String, Slot> slots;
    String text;
    String html;

    public Response(){
        code=0;
        message="success";
        slots= new HashMap<String, Slot>();
    }

    public HashMap<String, Slot> getSlots() {
        return slots;
    }

    public void setSlots(HashMap<String, Slot> slots) {
        this.slots = slots;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public void addSlot(Slot slot){
        slots.put(slot.getName(), slot);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void dump(){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(this));
    }

    public void setError(int code,String message) {
        this.code = code;
        this.message = message;
    }
    public void setErrorMessage(String message) {
        this.code = -1;
        this.message = message;
    }
}
