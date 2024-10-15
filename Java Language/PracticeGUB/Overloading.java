package problem_solving;

class Time {
   int hour;
   int minitue;
   int second;
   
   public Time(int hour){
   this.hour=hour;
   }
   public Time(int hour,int minitue){
   this.hour=hour;
   this.minitue=minitue;
   }
   public Time(int hour,int minitue,int second){
   this.hour=hour;
   this.minitue=minitue;
   this.second=second;
   }
   
   
   void display (){
       System.out.println("hour: "+hour);
       System.out.println("minitue "+minitue);
       System.out.println("second "+second);
   }
}
public class Overloading {
    public static void main(String[] args) {
        Time ob1=new Time(2);
        ob1.display();
        System.out.println("");
        
        Time ob2=new Time(2,45);
        ob2.display();
        System.out.println("");
        
        Time ob3=new Time(3,54,32);
        ob3.display();
        
    }
    
}
