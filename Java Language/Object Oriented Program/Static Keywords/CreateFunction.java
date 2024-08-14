
package StaticKeyword;


public class CreateFunction {
    
    String name;
    static int id=232;
    static String UniversityName="Green University";

   CreateFunction(String a) {
       name=a;
      // id=b;
       
   }
   
   void displayInformation() {
       
       System.out.println("Name= "+name);
       System.out.println("Id= "+id);
       
       System.out.println("\n");
   }
}
