package com.wisekingdavid;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        String  validModel = model.toLowerCase();
        if (validModel.equals("911") || validModel.equals("Carera")){
            this.model = model;
        }else System.out.println("unknown model");
    }

    public String getModel(){
        return this.model;
    }
}
