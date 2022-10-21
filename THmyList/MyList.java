package Lesson10.THmyList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private int DEFAULT_CAPACITY = 10;
    private Object elements[];
    //    Mảng đối tượng elements chứa các phần tử trong danh sách
    public MyList(){
    elements = new Object[DEFAULT_CAPACITY];
}
    public void ensureCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }
    public void add(Object e){
        if(size == elements.length){
            ensureCapa();
        }
    elements[size++] = e;
    }
    public Object get(int i){
        if (i>=size||i <0){
            throw new IndexOutOfBoundsException("Index: " +i+ ", Size " +i);
        }
        return elements[i];
    }
}