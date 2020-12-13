package com.wisekingdavid;

public class setFortuneService implements Coach{

    private FortuneService fortuneService;

    public void CricketCoach() {
        System.out.println("setFortuneService: no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("setFortuneService: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;


    }

    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
