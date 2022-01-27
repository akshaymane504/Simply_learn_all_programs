//You are given a project to demonstrate the uses of classes, objects, and the object-oriented pillars in Java.

import java.util.Scanner;

public class P19 {
    private static int id;
    private static String Name;


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return Name;
    }


    public void setName(String name) {
        Name = name;
    }


    public P19(int id, String name) {
        super();
        this.id = id;
        Name = name;
    }


    public static void main(String[] args) {


        P19 emp1 = new P19(90, "Akshay");
        System.out.println(emp1.toString());
        System.out.println(emp1.hashCode());

    }

    @Override
    public String toString() {

        return "   Employee ID :  " + id + "   Employee Name  :  " + Name;

    }

    @Override
    public int hashCode() {
        return id;
    }
}


