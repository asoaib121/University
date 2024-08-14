
package Abstract;


public class Rectraingle extends Shape {
    
    Rectraingle (double a,double b) {
        super (a,b);
    }
    
    @Override
    void area(){
        double result= a*b;
        System.out.println("Area of Rectraingle= "+result);
    }
    
}
