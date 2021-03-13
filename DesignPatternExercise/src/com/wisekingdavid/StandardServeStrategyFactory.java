package com.wisekingdavid;

public class StandardServeStrategyFactory implements ServeStrategyFactory{
    @Override
    public String makeServeStrategy() {
        return "Standard Service";
    }
}
