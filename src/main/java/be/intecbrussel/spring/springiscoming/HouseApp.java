package be.intecbrussel.spring.springiscoming;

import be.intecbrussel.spring.springiscoming.services.CleaningService;
import be.intecbrussel.spring.springiscoming.tools.CleaningTool;
import be.intecbrussel.spring.springiscoming.tools.DisposableDuster;
import be.intecbrussel.spring.springiscoming.tools.Vacume;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HouseApp {
    public static void main(String[] args) {

       /* CleaningService cleaningService = new CleaningService(new Vacume());
        cleaningService.clean();*/

        //  ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HouseContextConfig.class);
       /* CleaningTool cleaningTool = applicationContext.getBean("broom", CleaningTool.class);
        cleaningTool.doCleanJob();*/

        try (ConfigurableApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(HouseContextConfig.class)) {
            CleaningTool cleaningService = applicationContext1.getBean("bezen", CleaningTool.class);
            cleaningService.doCleanJob();
        }


        System.out.println("------------------------------");


        try(ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(HouseContextConfig.class)){
            CleaningTool cleaningTool = applicationContext.getBean("sponge",CleaningTool.class);
          cleaningTool.doCleanJob();
        }

        //cleaningService = applicationContext.getBean("Vacc", CleaningService.class);
        //cleaningService.clean();

        try(ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(HouseContextConfig.class)){
            CleaningTool cleaningTool = applicationContext.getBean("duster", CleaningTool.class);
           // cleaningTool.doCleanJob();
            cleaningTool.doCleanJob();

        }

        System.out.println("<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>\n");

       /* try(ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(HouseContextConfig.class)) {
            CleaningService cs = applicationContext.getBean("dusterP",CleaningService.class);
            cs.setCleaningTool(new DisposableDusterProxy());
            cs.clean();
            cs.clean();
            cs.clean();
        }*/


        try(ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(HouseContextConfig.class)) {
            CleaningTool cs = new DisposableDusterProxy();
            cs.doCleanJob();
            cs.doCleanJob();
            cs.doCleanJob();
        }




    }

}
