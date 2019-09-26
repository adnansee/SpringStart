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
        System.out.println("LETS GET GREEN!");
    }
}
