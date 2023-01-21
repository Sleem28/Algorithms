package HomeWork2;

import HomeWork2.Classes.MyLinkedList;

import java.sql.SQLOutput;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Add some values with the various types
        Integer intValue = 13;
        String strValue = "string value";
        Double dblValue1 = 123.45;
        Double dblValue2 = 3.12;

        MyLinkedList list = new MyLinkedList();
        list.add(intValue);
        list.add(strValue);
        list.add(dblValue1);
        list.add(dblValue2);

        System.out.println("list items before revert:");
        for(Object item : list){
            System.out.println(item);
        }

        list.revert();

        System.out.println("\nlist items after revert:");
        for(Object item : list){
            System.out.println(item);
        }
    }

}

