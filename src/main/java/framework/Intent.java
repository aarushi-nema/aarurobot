package framework;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;

/**
 *
 * Created by aarushi on 9/6/21.
 */
public class Intent implements Cloneable{
    String id;
    String name;
    String skill;
    HashMap<String, Slot> slots;

    public Intent(){
        slots= new HashMap<String, Slot>();
    }

    public void addSlot(Slot slot){
        slots.put(slot.getName(), slot);
    }

    public HashMap<String, Slot> getSlots() {
        return slots;
    }

    public void setSlots(HashMap<String, Slot> slots) {
        this.slots = slots;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    public void dump(){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(this));
    }

    public String getKey(){
        return getSkill()+"--"+getId();
    }
}
