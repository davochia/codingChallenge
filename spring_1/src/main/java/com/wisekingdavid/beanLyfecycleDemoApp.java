package com.wisekingdavid;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach theCoach = ctx.getBean("myCoach", Coach.class);
        Coach alphaCoach = ctx.getBean("myCoach", Coach.class);

        boolean result = theCoach == alphaCoach;
        System.out.println(result);
    }
}
