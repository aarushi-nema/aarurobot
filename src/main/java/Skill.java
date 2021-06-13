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
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("intents:");
        for(Intent intent: intents.values()){
            System.out.println("\t"+intent.getId()+":");
            intent.dump();
        }
    }

    public HashMap<String, Intent> getIntents() {
        return intents;
    }
}
