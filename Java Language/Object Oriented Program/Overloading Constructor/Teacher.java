package OverloadingConstructor;

public class Teacher {

    String name, age;
    int number;

    Teacher() {
        System.out.println("No Information");
    }

    Teacher(String m, String n) {
        name = m;
        age = n;
    }

    Teacher(String m, String n, int k) {
        name = m;
        age = n;
        number = k;
    }

    void displayInformation() {

        System.out.println("Name= " + name);
        System.out.println("age= " + age);
        System.out.println("number= " + number);
        
        System.out.println("\n");

    }
}
