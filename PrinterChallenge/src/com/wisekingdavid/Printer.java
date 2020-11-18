package com.wisekingdavid;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean  isDuolex;

    public Printer(int tonerLevel, boolean isDuolex) {
        if(tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.isDuolex = isDuolex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuolex() {
        return isDuolex;
    }

    public void setDuolex(boolean duolex) {
        isDuolex = duolex;
    }

    public int isTonerFilledUp(int fillTonner){
        if(fillTonner > 0 && fillTonner <= 100){
            if(this.tonerLevel + fillTonner > 100){
                return -1;
            }
            this.tonerLevel += fillTonner;
            return tonerLevel;
        }
        else {
            return -1;
        }
    }


    public int pagesPrinted(int pages){
        int pagesToPrint = pages;
        if(isDuolex){
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Duplex printer mode");
            this.pagesPrinted += pagesToPrint;
            return pagesToPrint;
        }else{
            System.out.println("Single printer mode");
            this.pagesPrinted += pagesToPrint;
            return pagesToPrint;
        }
    }
}
