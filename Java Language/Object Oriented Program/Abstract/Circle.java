
package Abstract;


public class Circle extends Shape {
    
    Circle(double a,double b) {
        super(a,b);
    }
    
    @Override
    void area() {
        double result=3.1416*a*b;
        System.out.println("Area of Circle= "+result);
    }
    
    public static void main(String[] args) {
        
        Shape db1;
        db1=new Rectraingle(12.5,6.4);
        db1.area();
        
        db1=new Traingle(72.5,6.4);
        db1.area();
       
        db1=new Circle(5.8,9.3);
        db1.area();
    }
}
