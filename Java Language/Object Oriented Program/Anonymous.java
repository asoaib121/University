
package JavaOop;


public class Anonymous {


    void display() {
        System.out.println("This is Shoaib");
    }
    
    public static void main(String[] args) {
       Anonymous pb1=new Anonymous() {
        
           @Override
           void display() {
               System.out.println("This is Laiyan");
           }
       };
       pb1.display();
    }
    
}
