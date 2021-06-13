import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by ajay on 13/6/21.
 */
public class Slot {
    String name;
    Object value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void dump(){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(this));
    }

}
