package be.intecbrussel.spring.springiscoming.tools;

import org.springframework.stereotype.Component;

@Component
public class Vacume implements CleaningTool {
    @Override
    public void doCleanJob() {
        System.out.println("VACUME SOUND!!!!!");
    }
}
