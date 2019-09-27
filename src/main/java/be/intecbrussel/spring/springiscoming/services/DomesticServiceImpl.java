package be.intecbrussel.spring.springiscoming.services;

public class DomesticServiceImpl implements DomesticService {


    public CleaningService cleaningService;
    public GardeningService gardeningService;

    public CleaningService getCleaningService() {
        return cleaningService;
    }

    public DomesticServiceImpl setCleaningService(CleaningService cleaningService) {
        this.cleaningService = cleaningService;
        return this;
    }

    public GardeningService getGardeningService() {
        return gardeningService;
    }

    public DomesticServiceImpl setGardeningService(GardeningService gardeningService) {
        this.gardeningService = gardeningService;
        return this;
    }

    public void init(){
        System.out.println("Domestic Service preparing for running");


    }
    public void destroy(){
        System.out.println("Domestic Service cleaning up");

    }

    @Override
    public void runHouseHold() {

    }
}
