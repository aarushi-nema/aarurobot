import framework.SkillManager;

/**
 * Created by ajay on 9/6/21.
 */
public class TestManager {
    public static void main(String[] args){
        String prepaid_skill = "{\"id\" : \"PREPAID\",\"name\" : \"PREPAID SYSTEM\", \"intents\" : { \"GET_BALANCE\" :{\"id\":\"GET-BALANCE\"}}}";
        String radhakripa_skill = "{\"id\" : \"RADHAKRIPA\",\"name\" : \"RADHAKRIPA APPLICATION\" }";

        SkillManager.getInstance().register(prepaid_skill);
        SkillManager.getInstance().register(radhakripa_skill);
        SkillManager.getInstance().dump();

    }
}
