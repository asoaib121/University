package PolymorPhism;

public class Rectangle extends shape {
    
    double base;
    double width;
    
   
    Rectangle(double base, double width) {
        this.base = base;
        this.width = width;
    }
    
    
    @Override
    double area() {
        System.out.print("AREA OF RECTRANGLE= ");
     return base*width;   
    }
    
}
