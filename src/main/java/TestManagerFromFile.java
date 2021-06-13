import framework.SkillManager;

/**
 * Created by ajay on 9/6/21.
 */
public class TestManagerFromFile {
    public static void main(String[] args){

        SkillManager.getInstance().registerFromFile("prepaid.json");
        SkillManager.getInstance().registerFromFile("radhakripa.json");
        SkillManager.getInstance().dump();

    }
}
