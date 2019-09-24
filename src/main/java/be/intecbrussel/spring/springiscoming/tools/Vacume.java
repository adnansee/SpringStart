package be.intecbrussel.spring.springiscoming.tools;

public class Vacume implements CleaningTool {
    @Override
    public void doCleanJob() {
        System.out.println("VACUME SOUND!!!!!");
    }
}
