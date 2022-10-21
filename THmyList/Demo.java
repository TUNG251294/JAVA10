package Lesson10.THmyList;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        cars.addFirst("Sirius");
        cars.remove("Ford");
        System.out.println(cars);

        System.out.println(cars.getFirst());
    }
}
