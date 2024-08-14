
package JavaOop;


public class LengthofArgument {

    void add(int ... number) {
        int sum=0;
        for (int x: number) {
            sum=sum+x;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
       LengthofArgument result=new LengthofArgument();
       
       result.add(30,38,92);
       result.add(10,30,40,50,60);
    }
    
}
