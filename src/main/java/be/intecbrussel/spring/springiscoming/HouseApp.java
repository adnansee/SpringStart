package be.intecbrussel.spring.springiscoming;

import be.intecbrussel.spring.springiscoming.services.CleaningService;
import be.intecbrussel.spring.springiscoming.tools.CleaningTool;
import be.intecbrussel.spring.springiscoming.tools.Vacume;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HouseApp {
    public static void main(String[] args) {

       /* CleaningService cleaningService = new CleaningService(new Vacume());
        cleaningService.clean();*/

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HouseContextConfig.class);
       /* CleaningTool cleaningTool = applicationContext.getBean("broom", CleaningTool.class);
        cleaningTool.doCleanJob();*/

       CleaningService cleaningService = applicationContext.getBean("vacumeService", CleaningService.class);
       cleaningService.clean();



    }

}
