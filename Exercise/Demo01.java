package Lesson10.Exercise;

import java.util.ArrayList;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        System.out.println("Size ban dau cua arraylist la: " + arrList.size());
        arrList.add("C");
        arrList.add("A");
        arrList.add("E");
        arrList.add("B");
        arrList.add(1,"A2");
        System.out.println("Size xua arraylist sau khi them la: " + arrList.size());
        System.out.println("Noi dung cua arraylist la: " + arrList);
        arrList.remove("E");
        arrList.remove(2);
        System.out.println("Size cua arraylist sau khi xoa la: " + arrList.size());
        System.out.println("Noi dung cua arraylist la: " + arrList);
    }
}
