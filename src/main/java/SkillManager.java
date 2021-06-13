import com.google.gson.Gson;

import java.util.HashMap;

/**
 * SkillManager contains the collections of skills and intents and also validates if the request intent is valid or not (returns null if invalid intent)
 * Skill Manager loads valid skills and intent from json files.
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
        //convert Json string to skill object
        skill = new Gson().fromJson(jsonSkill,Skill.class);
        return skill;

    }

    public void registerFromFile(String jsonSFileName) {
        try {
            //get content from file
            String fileContent = Util.getFileContent(jsonSFileName);
            register(fileContent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void register(String jsonSkill){
        //convert json string to skill object
        Skill skill = loadFromJsonText(jsonSkill);
        if(skill==null){
            return;
        }
        //add skill to skills collection
        skills.put(skill.getId(), skill);
        //tell intents which skill they belong to and add to intent collection
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
