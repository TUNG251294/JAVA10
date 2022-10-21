package Lesson10.Exercise;

public class Student {
    private String name;
    private int id;
    private double score;
    private int yearOB;
    public Student(){
    }

    public Student(String name, int id, double score, int yearOB) {
        this.name = name;
        this.id = id;
        this.score = score;
        this.yearOB = yearOB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getYearOB() {
        return yearOB;
    }

    public void setYearOB(int yearOB) {
        this.yearOB = yearOB;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", score=" + score +
                ", yearOB=" + yearOB +
                '}';
    }
}
