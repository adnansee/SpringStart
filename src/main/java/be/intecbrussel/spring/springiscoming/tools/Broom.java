package be.intecbrussel.spring.springiscoming.tools;

public class Broom  implements CleaningTool {

    private int timeUsed;


        @Override
        public void doCleanJob() {
            System.out.println("BROOM SOUND!!!"+"it was used "+ ++timeUsed+" times");
        }
    }


