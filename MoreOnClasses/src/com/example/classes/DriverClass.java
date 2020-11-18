package com.example.classes;

public class DriverClass {
    public static void main(String[] args) {
        Subject subject1 = new Subject("CIS4003", "Computer Science");
        Student student1 = new Student("Dav Och",1234564344);
        ExamPaper examPaper = new ExamPaper(student1, subject1, 100);

        System.out.println(examPaper);
        System.out.println("Subject Code: "+ examPaper.getSubject().getSubjectCode());

    }
}
