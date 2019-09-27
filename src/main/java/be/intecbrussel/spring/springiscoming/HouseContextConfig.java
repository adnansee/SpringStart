package be.intecbrussel.spring.springiscoming;

import be.intecbrussel.spring.springiscoming.services.*;
import be.intecbrussel.spring.springiscoming.tools.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("be.intecbrussel.spring.springiscoming")
public class HouseContextConfig {
/*
    @Bean(name = "bezen")
    @Scope("prototype")
    public CleaningTool broom() {
        return new Broom();
    }

    @Bean(name = "Vacc")
    @Scope("")
    public CleaningTool vacume() {
        return new Vacume();
    }

    @Bean(name = "sponge")
    @Scope("prototype")
    public CleaningTool sponge() {
        return new Sponge();
    }

    @Bean
    public GardeningTool lawnMower() {
        return new LawnMover();
    }

    @Bean(name = "duster")
    @Scope("prototype")
    public CleaningTool duster() {
        return new DisposableDuster();
    }

    @Bean
    public CleaningService broomService() {
        CleaningService cleaningService = new CleaningService(broom());
        cleaningService.setCleaningTool(broom());
        return cleaningService;
    }

    @Bean
    public CleaningService vacumeService() {
        CleaningService cleaningService = new CleaningService(vacume());
        cleaningService.setCleaningTool(vacume());
        return cleaningService;
    }


    @Bean(initMethod = "init", destroyMethod = "destroy")
    public GardeningService gardeningService(GardeningTool gardeningTool) {
        GardeningSericeImpl gardeningService = new GardeningSericeImpl();
        gardeningService.setGardeningTool(gardeningTool);
        return gardeningService;

    }


    @Bean(initMethod = "init", destroyMethod = "destroy")
    public DomesticService domesticService() {
        DomesticServiceImpl domesticService = new DomesticServiceImpl();

        return domesticService;

    }
*/
}
