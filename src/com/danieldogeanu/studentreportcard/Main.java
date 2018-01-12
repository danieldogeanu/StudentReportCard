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

        int[] studentTwoGrades = {7,5,4,7,7,9,6};
        ReportCard studentTwo = new ReportCard("Jane Doe", studentTwoGrades);

        System.out.println(studentTwo.toString());

    }
}
