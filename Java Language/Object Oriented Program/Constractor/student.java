
package Constractor;


public class student {
    
    String name,home_town;
    int number;
    
    student(){
        System.out.println("No Value");
    }

   student(String m,String n,int p){
       
       
       name=m;
       home_town=n;
       number=p;
   }
   void displayInformation(){
       System.out.println("Name= "+name);
       System.out.println("Home_town= "+home_town);
       System.out.println("Number= "+number);
       System.out.println("\n\n");
   }
    
}
