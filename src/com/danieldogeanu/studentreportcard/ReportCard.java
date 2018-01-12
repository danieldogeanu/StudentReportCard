package com.danieldogeanu.studentreportcard;

import java.util.ArrayList;

public class ReportCard {

    /** Student Name */
    private String studentName;

    /**
     * Student Grades for various disciplines.
     * In Romania we have whole integers as grades (e.g. 8, 4, 6, etc).
     * We only transform them to floats when we do the average between all the grades
     * and on the exams, where the score is more precise.
     */
    private int englishGrade;
    private int mathGrade;
    private int historyGrade;
    private int biologyGrade;
    private int geographyGrade;
    private int chemistryGrade;
    private int physicsGrade;

    /** Overall student average grade. */
    private float studentAverage;

    /**
     * Constructor for the ReportCard.
     * @param name Student name.
     * @param grades Grades for all disciplines, in order: English, Math, History, Biology, Geography, Chemistry, Physics.
     */
    public ReportCard(String name, ArrayList<Integer> grades) {
        studentName = name;
        englishGrade = grades.get(0);
        mathGrade = grades.get(1);
        historyGrade = grades.get(2);
        biologyGrade = grades.get(3);
        geographyGrade = grades.get(4);
        chemistryGrade = grades.get(5);
        physicsGrade = grades.get(6);
        studentAverage = calculateStudentAverage();
    }

    /** Empty constructor for the ReportCard with default values. */
    public ReportCard() {
        studentName = "";
        englishGrade = 0;
        mathGrade = 0;
        historyGrade = 0;
        biologyGrade = 0;
        geographyGrade = 0;
        chemistryGrade = 0;
        physicsGrade = 0;
        studentAverage = calculateStudentAverage();
    }

    /** Get and set the student name. */
    public String getStudentName() { return studentName; }
    public void setStudentName(String name) { studentName = name; }

    /** Get the grades for each discipline. */
    public int getEnglishGrade() { return englishGrade; }
    public int getMathGrade() { return mathGrade; }
    public int getHistoryGrade() { return historyGrade; }
    public int getBiologyGrade() { return biologyGrade; }
    public int getGeographyGrade() { return geographyGrade; }
    public int getChemistryGrade() { return chemistryGrade; }
    public int getPhysicsGrade() { return physicsGrade; }

    /** Set the grades for each discipline. */
    public void setEnglishGrade(int grade) { englishGrade = grade; }
    public void setMathGrade(int grade) { mathGrade = grade; }
    public void setHistoryGrade(int grade) { historyGrade = grade; }
    public void setBiologyGrade(int grade) { biologyGrade = grade; }
    public void setGeographyGrade(int grade) { geographyGrade = grade; }
    public void setChemistryGrade(int grade) { chemistryGrade = grade; }
    public void setPhysicsGrade(int grade) { physicsGrade = grade; }

    /** Get student average grade. */
    public float getStudentAverage() { return studentAverage; }

    /** Calculate the student average grade. */
    private float calculateStudentAverage() {
        return (englishGrade + mathGrade + historyGrade + biologyGrade + geographyGrade + chemistryGrade + physicsGrade) / 7;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("Name: " + studentName + "; ")
                .append("English Grade: " + Integer.toString(englishGrade) + "; ")
                .append("Math Grade: " + Integer.toString(mathGrade) + "; ")
                .append("History Grade: " + Integer.toString(historyGrade) + "; ")
                .append("Biology Grade: " + Integer.toString(biologyGrade) + "; ")
                .append("Geography Grade: " + Integer.toString(geographyGrade) + "; ")
                .append("Chemistry Grade: " + Integer.toString(chemistryGrade) + "; ")
                .append("Physics Grade: " + Integer.toString(physicsGrade) + "; ")
                .append("Student Average: " + Float.toString(studentAverage));
        return string.toString();
    }
}
