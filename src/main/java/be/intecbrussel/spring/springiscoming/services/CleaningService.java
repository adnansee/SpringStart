package be.intecbrussel.spring.springiscoming.services;

import be.intecbrussel.spring.springiscoming.tools.Broom;
import be.intecbrussel.spring.springiscoming.tools.CleaningTool;

public class CleaningService {

    private CleaningTool cleaningTool;

    public CleaningService(CleaningTool cleaningTool) {
        this.cleaningTool = cleaningTool;
    }

    public CleaningService() {

    }


    public CleaningService setCleaningTool(CleaningTool cleaningTool) {
        this.cleaningTool = cleaningTool;
        return this;
    }

    public void clean() {

        System.out.println("Cleaning service is working");
        cleaningTool.doCleanJob();

    }

}
