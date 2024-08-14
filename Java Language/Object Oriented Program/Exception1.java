
package JavaOop;


public class Exception1 {

    
    public static void main(String[] args) {
        
        try {
        int x=5;
        int y=0;
        int result=x/y;
        System.out.println("Result is= "+result);
        }catch(Exception e){
            System.out.println("Exception: "+e);
        }
        
        try{
           int[] z=new int[5];
        z[5]=10;
        System.out.println("Z is= "+z[5]); 
        }catch(Exception b){
            System.out.println("Exception: "+b);  
        }
        System.out.println("Last line of the program");
    }
    
}
