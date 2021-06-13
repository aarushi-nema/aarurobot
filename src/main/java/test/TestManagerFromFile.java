package test;

import framework.SkillManager;

/**
 * Created by ajay on 9/6/21.
 */
public class TestManagerFromFile {
    public static void main(String[] args){

        SkillManager.getInstance().registerFromFile("skill.prepaid.json");
        SkillManager.getInstance().registerFromFile("skill.radhakripa.json");
        SkillManager.getInstance().dump();

    }
}
