import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;

/**
 * Created by ajay on 9/6/21.
 */
public class Skill {

    String id;
    String name;
    HashMap<String, Intent> intents;

    public Skill(){
        intents=new HashMap<String, Intent>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void register(Intent intent){
        intents.put(intent.getId(), intent);
    }

    public void dump(){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(this));
    }

    public HashMap<String, Intent> getIntents() {
        return intents;
    }
}
