/**
 * Created by ajay on 9/6/21.
 */
public class Intent {
    String id;
    String name;

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    String skill;

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

    public void dump(){
        System.out.println("\t\tid:"+id);
        System.out.println("\t\tname:"+name);
        System.out.println("\t\tskill:"+skill);
    }

}
