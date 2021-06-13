package framework;

import java.util.ArrayList;

/** c4t
 * Created by ajay on 13/6/21.
 */
public class Provider {
    private  String name;
    private  ArrayList<String> skills;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }
}
