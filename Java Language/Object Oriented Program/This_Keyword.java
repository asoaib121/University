package JavaOop;


public class This_Keyword {

   String a;
   int b;
   String c;
   
   This_Keyword (String a,int b) {
       this.a=a;
       this.b=b;
   }
   
   This_Keyword (String a,int b,String c) {
       this(a,b);
       this.c=c;
      
   }
   void display(){ 
       System.out.println("A= "+a);
       System.out.println("B= "+b);
       System.out.println("C= "+c);
   }
   
   void display1() {
       this.display();
       System.out.println();
       System.out.println("The function is This_Keyword");
       
   }
   
    public static void main(String[] args) {
        
        This_Keyword db1= new This_Keyword ("Shoaib",24,"laiyan");
        db1.display1();
    }
    
}
