package be.intecbrussel.spring.springiscoming.tools;

public class DisposableDuster implements CleaningTool {
    private boolean clean = true;

    public DisposableDuster() {
        System.out.println("Create disposable duster");
    }

    @Override
    public void doCleanJob() {
        if(clean){
            System.out.println("SWIFF clean");
            clean = false;

        }else{

            System.out.println("its a dirty duster");
        }
    }
}
