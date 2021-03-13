package com.wisekingdavid;

public class Main {
    public static void main(String a[]) {
        ServeStrategyFactory psf = new PremiumServeStrategyFactory();
        ServeStrategyFactory ssf = new StandardServeStrategyFactory();
        Service s1 = new Service(psf.makeServeStrategy());
        Service s2 = new Service(ssf.makeServeStrategy());

        s1.serve();
        s2.serve();
    }
    /*
     * Execution of main should output:
     *
     * Premium Service
     * Standard Service
     *
     */
}
