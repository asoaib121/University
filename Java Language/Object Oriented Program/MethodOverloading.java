
package JavaOop;


public class MethodOverloading {

    void add (int a,int b) {
        System.out.println(a+b);
    }
    void add (double a, double b) {
        System.out.println(a+b);
    }
    void add (int a,int b,int c) {
        System.out.println(a+b+c);
    }
    void add (){
       System.out.println("Nothing to add");
    }
    public static void main(String[] args) {
        
       MethodOverloading ob1=new  MethodOverloading();
       
       ob1.add(12,8);
       ob1.add(9.4,7.6);
       ob1.add(8,5,7);
       ob1.add();
    }
    
}
