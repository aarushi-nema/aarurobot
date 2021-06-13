/**
 *
 * Created by aarushi on 9/6/21.
 */
public class Intent implements Cloneable{
    String id;
    String name;
    String skill;

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
        System.out.println("\t\tid:"+id);
        System.out.println("\t\tname:"+name);
        System.out.println("\t\tskill:"+skill);
    }

    public String getKey(){
        return getSkill()+"--"+getId();
    }
}
