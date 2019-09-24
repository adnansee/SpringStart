package be.intecbrussel.spring.springiscoming;

import be.intecbrussel.spring.springiscoming.services.CleaningService;
import be.intecbrussel.spring.springiscoming.tools.Broom;
import be.intecbrussel.spring.springiscoming.tools.CleaningTool;
import be.intecbrussel.spring.springiscoming.tools.Vacume;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HouseContextConfig {

    @Bean
    public CleaningTool broom() {
        return new Broom();
    }

    @Bean
    public CleaningService vacumeService() {
        CleaningService cleaningService = new CleaningService(new Vacume());
        return cleaningService;
    }


}
