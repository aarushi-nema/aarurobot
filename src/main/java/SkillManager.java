import com.google.gson.Gson;

import java.util.HashMap;

/**
 * SkillManager contains the collections of skills and intents and also validates if the request intent is valid or not (returns null if invalid intent)
 * Created by ajay on 9/6/21.
 */
public class SkillManager {

    //collection of all supported skills
    HashMap<String, Skill> skills;
    //collection of all supported intents of skills
    HashMap<String, Intent> intents;
    private static SkillManager instance;


    SkillManager() {
        skills = new HashMap<String, Skill>();
        intents= new HashMap<String, Intent>();
        registerFromFile("prepaid.json");
        registerFromFile("radhakripa.json");

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

    public void registerFromFile(String jsonSFileName) {
        try {
            String fileContent = Util.getFileContent(jsonSFileName);
            register(fileContent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void register(String jsonSkill){
        Skill skill = loadFromJsonText(jsonSkill);
        skills.put(skill.getId(), skill);
        for(Intent intent: skill.getIntents().values()){
            intent.setSkill(skill.getId());
            intents.put(intent.getKey(), intent);
        }
    }

    public void dump(){
        for(Skill skill: skills.values()){
            skill.dump();
        }
    }

    public Intent getIntent(Intent intent){
        if(intent==null){
            return null;
        }
        intent = intents.get(intent.getKey());
        if (intent != null) {
            try {
                return (Intent) intent.clone();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
       return null;
    }

}
