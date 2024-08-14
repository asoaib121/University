
package Abstract;


public class Traingle extends Shape{
    
    Traingle(double a,double b) {
        super(a,b);
    }
    
    @Override
    void area() {
     double result=0.5*a*b;
        System.out.println("Area of Rectraingle= "+result);
    }
    
}
