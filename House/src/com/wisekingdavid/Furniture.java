package com.wisekingdavid;

import com.wisekingdavid.furnitures.Bed;
import com.wisekingdavid.furnitures.Cuboards;
import com.wisekingdavid.furnitures.Sofa;
import com.wisekingdavid.furnitures.Waldrope;

public class Furniture {
    private Waldrope theWaldrope;
    private Bed theBed;
    private Sofa theSofa;
    private Cuboards theCuboards;

    public Furniture(Waldrope theWaldrope, Bed theBed, Sofa theSofa, Cuboards theCuboards) {
        this.theWaldrope = theWaldrope;
        this.theBed = theBed;
        this.theSofa = theSofa;
        this.theCuboards = theCuboards;
    }

    public Waldrope getTheWaldrope() {
        return theWaldrope;
    }

    public Bed getTheBed() {
        return theBed;
    }

    public Sofa getTheSofa() {
        return theSofa;
    }

    public Cuboards getTheCuboards() {
        return theCuboards;
    }
}
