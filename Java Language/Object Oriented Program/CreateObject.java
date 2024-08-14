
package javacode1.oop;


public class CreateObject {
    public static void main(String[] args) {
        
        CreateClass student1 =new CreateClass();
        
        student1.name="Shoaib";
        student1.home_town="Bangladesh";
        student1.number=193390287;
        
        System.out.println("Name= "+student1.name); 
        System.out.println("home_town= "+student1.home_town);
        System.out.println("Number= "+student1.number);
        
        
        System.out.println();
        
        CreateClass student2 =new CreateClass();
        
        student2.name="Ahmed";
        student2.home_town="Bangladesh";
        student2.number=1837390287;
        
        System.out.println("Name= "+student2.name); 
        System.out.println("home_town= "+student2.home_town);
        System.out.println("Number= "+student2.number);
             
    }
    
}
