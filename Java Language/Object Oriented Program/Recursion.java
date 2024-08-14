package JavaOop;

public class Recursion {
   
    int fact(int n) {
    if(n==1)
   return 1;
    else
   return n*fact(n-1);
   
    }
    
    public static void main(String[] args) {
        Recursion ob1= new Recursion();
        int result =ob1.fact(5);
        System.out.println("factorial is: "+result);
        
    }

}
