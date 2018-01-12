package com.danieldogeanu.studentreportcard;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ReportCard studentOne = new ReportCard();
        studentOne.setStudentName("John Doe");
        studentOne.setEnglishGrade(9);
        studentOne.setMathGrade(7);
        studentOne.setHistoryGrade(5);
        studentOne.setBiologyGrade(10);
        studentOne.setGeographyGrade(3);
        studentOne.setChemistryGrade(8);
        studentOne.setPhysicsGrade(9);

        System.out.println(studentOne.toString());
        System.out.println("----");

    }
}
