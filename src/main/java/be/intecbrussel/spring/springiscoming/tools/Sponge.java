package be.intecbrussel.spring.springiscoming.tools;


import org.springframework.stereotype.Component;

@Component("sponje")
public class Sponge implements CleaningTool {
    public Sponge() {
    }

    @Override
    public void doCleanJob() {
        System.out.println("SPONGE SOUND!!!");
    }
}
