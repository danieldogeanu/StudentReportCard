package com.danieldogeanu.studentreportcard;

public class Main {

    public static void main(String[] args) {

        ReportCard studentOne = new ReportCard();
        studentOne.setStudentName("John Doe");
        studentOne.setEnglishGrade(9);
        studentOne.setMathGrade(7);
        studentOne.setHistoryGrade(5);
        studentOne.setBiologyGrade(10);
        studentOne.setGeographyGrade(8);
        studentOne.setChemistryGrade(8);
        studentOne.setPhysicsGrade(9);

        System.out.println(studentOne.toString());

    }
}
