package com.wisekingdavid;

public class Main {
    public static void main(String[] args) {
        Shape rectangle;
        rectangle = new Rectangle(3, 5);
        AddPrinter result = new AddPrinter(rectangle);
        NamePrinter name = new NamePrinter(rectangle);

        name.namePrinter();
        result.printArea();

        Printer printer = new Printer(rectangle);
        printer.printAreaName();

        //System.out.println(rectangle.getClass().getSimpleName() + " area: " + rectangle.getArea());

        System.out.println();

//        Shape triangle;
//        triangle = new TriangleArea(new Triangle(4, 5));
//        System.out.println(triangle.getName()+" area: " + triangle.getArea());
    }
}
