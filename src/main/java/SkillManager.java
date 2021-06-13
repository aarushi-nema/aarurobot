import com.google.gson.Gson;

import java.util.HashMap;

/**
 * Created by ajay on 9/6/21.
 */
public class SkillManager {

    HashMap<String, Skill> skills;
    private static SkillManager instance;

    SkillManager() {
        skills = new HashMap<String, Skill>();
    }

    public static SkillManager getInstance() {
        if (instance == null)
            instance = new SkillManager();
        return instance;
    }

    private Skill loadFromJsonText(String jsonSkill){
        Skill skill= null;
        skill = new Gson().fromJson(jsonSkill,Skill.class);
        return skill;

    }

    private Skill loadFromJsonFile(String jsonSFileName){

        return skill;

    }


    public void register(String jsonSkill){
        Skill skill = loadFromJsonText(jsonSkill);
        skills.put(skill.getId(), skill);
        for(Intent intent: skill.getIntents().values()){
            intent.setSkill(skill.getId());
        }
    }

    public void dump(){
        for(Skill skill: skills.values()){
            skill.dump();
        }
    }

}
