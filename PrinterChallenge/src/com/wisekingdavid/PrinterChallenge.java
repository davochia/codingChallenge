package com.wisekingdavid;

public class PrinterChallenge {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);

        System.out.println("Page count = "+ printer.getPagesPrinted());
        int pagesprinted = printer.pagesPrinted(30);
        System.out.println("Pages printed = " + pagesprinted + ", Total pages = " + printer.getPagesPrinted());

        System.out.println("------------------------------------");

        System.out.println("Page count = "+ printer.getPagesPrinted());
        printer.setDuolex(false);
        pagesprinted = printer.pagesPrinted(300);
        System.out.println("Pages printed = " + pagesprinted + ", Total pages = " + printer.getPagesPrinted());

    }
}
