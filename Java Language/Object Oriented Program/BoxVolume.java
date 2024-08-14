
package JavaOop;


public class BoxVolume {

    double height,wedth,depth;
    
    BoxVolume(double h,double w,double d) {
        
        height=h;
        wedth=w;
        depth=d;
    }
    
    void display() {
        double vol=height*wedth*depth;
        System.out.println("Volume is: "+vol);
    }
    
    public static void main(String[] args) {
        
        BoxVolume box1=new BoxVolume(10,10,10);
        BoxVolume box2=new BoxVolume(30,20,10);
        
        box1.display();
        box2.display();
    }
    
}
