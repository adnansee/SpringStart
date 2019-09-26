package be.intecbrussel.spring.springiscoming.tools;

public class Sponge implements CleaningTool {
    @Override
    public void doCleanJob() {
        System.out.println("SPONGE SOUND!!!");
    }
}
