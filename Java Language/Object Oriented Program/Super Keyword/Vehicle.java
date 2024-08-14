package Super_Keyword;

public class Vehicle {

    String color;
    int weight;

    Vehicle(String c, int w) {
        color = c;
        weight = w;
    }
    
    void display () {
        System.out.println("Color= "+color);
        System.out.println("Weight= "+weight);
    }
}
