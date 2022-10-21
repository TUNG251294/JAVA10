package Lesson10.Exercise;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        double score1 = o1.getScore();
        double score2 = o2.getScore();
        return -Double.compare(score1,score2);
    }
}
