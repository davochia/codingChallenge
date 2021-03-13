package com.wisekingdavid;

public class PremiumServeStrategyFactory implements ServeStrategyFactory{
    @Override
    public String makeServeStrategy() {
        return "Premium Service";
    }
}
