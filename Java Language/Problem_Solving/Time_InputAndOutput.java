package problem_solving;
import java.util.Scanner;
 class Time {
     int hour;
     int minitue;
     int second;
    
    public Time (int hour,int minitue,int second) {
        this.hour=hour;
        this.minitue=minitue;
        this.second=second;  }
    
      public boolean timevalid (){
         return (hour>=0 || hour<24 ) && (minitue >=0 || minitue<60) || (second<0 && second>60);
     }
       public void displaytime(){
        System.out.printf("The time is: %02d:%02d:%02d",hour,minitue,second);
    }  }

public class Time_InputAndOutput {
    public static void main(String[] args) {
        Scanner db1=new Scanner(System.in);
        
        System.out.println("Enter a hour: ");
        int hour=db1.nextInt();
        
        System.out.println("Enter a minitue: ");
        int minitue=db1.nextInt();
        
        System.out.println("Enter a second");
        int second=db1.nextInt();
        
        Time time=new Time(hour,minitue,second);
        
        if(!time.timevalid()){
            System.out.println("please enter a valid value");
            return;
        }
        
        time.displaytime();
        db1.close();
        
    }
  }
