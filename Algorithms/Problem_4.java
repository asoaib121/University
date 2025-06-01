//Java Program to Swap Two Numbers
package versity_problems;
class b{

     static void swapfunction(int a,int b) {
        int temp = a;
        a=b;
        b=temp;

        System.out.println("value of a is:" +a+ " value of b is:"+b);

    }
}
public class Problem_4 {
    public static void main(String[] args) {
        int a=34;
        int b=75;
         versity_problems.b.swapfunction(a,b);
    }
}
