package be.intecbrussel.spring.springiscoming;

import be.intecbrussel.spring.springiscoming.services.CleaningService;
import be.intecbrussel.spring.springiscoming.tools.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class HouseContextConfig {

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

    @Bean(name = "duster")
    @Scope("prototype")

    public CleaningTool duster() {
        return new DisposableDuster();
    }

    /*@Bean(name = "dusterp")
    @Scope("singleton")
    public CleaningTool dusterProxy() {
        return new DisposableDusterProxy();
    }*/




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

    /*@Bean(name = "dusterP")
    public CleaningService dusterService() {
        CleaningService cleaningService = new CleaningService(vacume());
        cleaningService.setCleaningTool(dusterProxy());
        return cleaningService;
    }

    @Bean
    public CleaningService dusterServiceProxy() {
        CleaningService cleaningService = new CleaningService(vacume());
        cleaningService.setCleaningTool(dusterProxy());
        return cleaningService;
    }*/


}
