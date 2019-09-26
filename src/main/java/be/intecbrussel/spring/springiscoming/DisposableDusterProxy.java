package be.intecbrussel.spring.springiscoming;

import be.intecbrussel.spring.springiscoming.tools.CleaningTool;
import be.intecbrussel.spring.springiscoming.tools.DisposableDuster;


public class DisposableDusterProxy implements CleaningTool {
    private int counter;

    @Override
    public void doCleanJob() {
        new DisposableDuster().doCleanJob();
        System.out.println("Ill clean it bitch"+" the duster was used "+ ++counter +" times");
    }
}
