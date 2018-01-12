package com.danieldogeanu.studentreportcard;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ReportCard johnDoe = new ReportCard();
        johnDoe.setStudentName("John Doe");
        johnDoe.setEnglishGrade(9);
        johnDoe.setMathGrade(7);
        johnDoe.setHistoryGrade(5);
        johnDoe.setBiologyGrade(10);
        johnDoe.setGeographyGrade(3);
        johnDoe.setChemistryGrade(8);
        johnDoe.setPhysicsGrade(9);

        ArrayList<ReportCard> students = new ArrayList<ReportCard>();
        students.add(johnDoe);
        students.add(new ReportCard("Lettice Kaylie", 7, 8, 5, 6, 10, 8, 9));
        students.add(new ReportCard("Jazlyn Eli", 9, 7, 9, 6, 6, 8, 7));
        students.add(new ReportCard("Wallace Renita", 4, 3, 5, 2, 6, 8, 3));
        students.add(new ReportCard("Andrea Katharyn", 6, 8, 8, 9, 3, 10, 7));

        for (ReportCard student : students) {
            System.out.println(student.toString());
        }

    }
}
