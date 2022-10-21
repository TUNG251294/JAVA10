package Lesson10.Exercise;

import java.util.ArrayList;
import java.util.Collections;


public class StudentManagement {
    private ArrayList<Student> students = new ArrayList<>();
    double[] myint = {1.0,2.0,3.0};
    public StudentManagement() {
    }

    public void add(Student s){
        students.add(s);
    }
    public void print(){
        System.out.println(students);
    }
    public String isEmpty(){
        if(students.isEmpty()){
            return "the list is empty";
        } else {
            return "the list is not empty";
        }
    }
    public void setClear(){
        students.clear();
    }
    public int getSize(){
        return students.size();
    }

    public String searchById(int id){
        for (Student s: students){
            if(s.getId() == id){
                return "had found the Student " + s.getName();
            }
        }
        return "The student is not found";
    }

    public void setRemove(int id){
        for(Student s: students){
            if(s.getId() == id){
                students.remove(s);
                break;  //khong co break la xuat hien loi
            }
        }
    }

    public void sortDecrease(){

        StudentComparator studentComparator = new StudentComparator();
        Collections.sort(students,studentComparator);   //lớp Arraylist nằm trong interface Collections
        for (Student s: students){
            System.out.println(s);
        }
    }
}

