package be.intecbrussel.spring.springiscoming;

import be.intecbrussel.spring.springiscoming.services.GardeningSericeImpl;
import be.intecbrussel.spring.springiscoming.services.GardeningService;
import be.intecbrussel.spring.springiscoming.tools.GardeningTool;
import be.intecbrussel.spring.springiscoming.tools.LawnMover;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OutHouseContextConfig {


    @Bean
    public GardeningTool lawnMower(){
        return new LawnMover();

    }

    @Bean
    public GardeningService gardeningService(GardeningTool gardeningTool){
        GardeningSericeImpl gardeningService = new GardeningSericeImpl();
        gardeningService.setGardeningTool(gardeningTool);

        return gardeningService;

        }
    }

