package be.intecbrussel.spring.springiscoming;

import be.intecbrussel.spring.springiscoming.services.DomesticService;
import be.intecbrussel.spring.springiscoming.tools.CleaningTool;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HouseApp2 {

    public static void main(String[] args) {
        try (ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(HouseContextConfig.class)){
            System.out.println("Container Initilized");

//            DomesticService service = ctx.getBean("domesticService",DomesticService.class);
 //           service.runHouseHold();

            System.out.println("---------------------------------");

            CleaningTool cleaningTool = ctx.getBean("sponje", CleaningTool.class);
            cleaningTool.doCleanJob();
            System.out.println("---------------------------------");
            cleaningTool = ctx.getBean("vacume", CleaningTool.class);
            cleaningTool.doCleanJob();
        }
    }
}
