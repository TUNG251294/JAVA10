package Lesson10.Exercise;

public class Main {
    public static void main(String[] args) {
        StudentManagement sManagement = new StudentManagement();
        Student s1 = new Student("Tung", 1, 8.5, 1994);
        Student s2 = new Student("Phuong", 2, 8.0, 1994);
        Student s3 = new Student("Nhan", 3, 8.3, 1994);
        sManagement.add(s1);
        sManagement.add(s2);
        sManagement.add(s3);
//        sManagement.print();



//        System.out.println(sManagement.isEmpty());

//        sManagement.setClear();
//        sManagement.print();
//        System.out.println(sManagement.isEmpty());

//        System.out.println(sManagement.getSize());
//        System.out.println(sManagement.searchById(2));
//
        sManagement.sortDecrease();

//        sManagement.setRemove(1);
//        sManagement.print();


    }
}
