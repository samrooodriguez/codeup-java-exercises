package grades;

import java.util.ArrayList;

class Student {

    private ArrayList<Integer> grades;
    private String name;
    private int studentID;

    Student(String name, int studentID) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.studentID= studentID;
    }

    public String getName() {
        return this.name;
    }

    public int getStudentID(){
        return this.studentID;
    }

    public ArrayList<Integer> getGrade(){
        return this.grades;

    }

     void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double average = 0;
        for(int grade : grades){
            average += grade;
        }
        return Math.round(average / grades.size());
    }


}
