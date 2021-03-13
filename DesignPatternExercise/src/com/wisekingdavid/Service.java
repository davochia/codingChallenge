package com.wisekingdavid;

public class Service {
    private String serveStrategyFactory;

    public Service(String serveStrategyFactory) {
        this.serveStrategyFactory = serveStrategyFactory;
    }

    public void serve(){
        System.out.println(this.serveStrategyFactory);
    }
}
