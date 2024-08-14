
package PolymorPhism;


public class traingle extends shape{
    double base;
    double height;
    
    traingle(double base,double height) {
        this.base=base;
        this.height=height;
   }
    
    @Override
    double area() {
        System.out.print("AREA OF TRAINGLE= ");
        return 0.5*base*height;
    }
    
    public static void main(String[] args) {
        
        shape p=new shape();
        System.out.println(p.area());
        
        p=new Rectangle(10.5,30.5);
        System.out.println(p.area());
        
        p=new traingle(23.8,6.7);
        System.out.println(p.area());
     
    }
    
}
