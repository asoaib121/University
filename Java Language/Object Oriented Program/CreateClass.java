
package javacode1.oop;


public class CreateClass {

    
   
        String name,home_town;
        int number;
        
        void setInformation(String m,String n,int k){
            
            name=m;
            home_town=n;
            number=k;
            
        }
        void displayInformation(){
            
          System.out.println("name= "+name);
          System.out.println("home_town= "+home_town);
          System.out.println("number= "+number);
          
          System.out.println("\n\n");
            
        }
    
    
}
