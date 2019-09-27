package be.intecbrussel.spring.springiscoming.services;

import be.intecbrussel.spring.springiscoming.tools.GardeningTool;

public class GardeningSericeImpl implements GardeningService {
    private GardeningTool gardeningTool;


    public GardeningSericeImpl setGardeningTool(GardeningTool gardeningTool) {
        this.gardeningTool = gardeningTool;
        return this;
    }

    @Override
    public void garden() {
        System.out.println("LETS GET GREEN!-----WORKING IN THE GARDEN");
        gardeningTool.doGardenJob();
    }

    public void init(){
        System.out.println("Gardening Service preparing for running");


    }
    public void destroy(){
        System.out.println("Gardening Service cleaning up");

    }
}
