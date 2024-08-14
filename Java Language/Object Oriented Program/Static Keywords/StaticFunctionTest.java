
package StaticKeyword;

import static StaticKeyword.CreateFunction.UniversityName;


public class StaticFunctionTest {
    
    public static void main(String[] args) {
        
        CreateFunction student1=new CreateFunction("Shoaib");
        System.out.println("University Name= "+UniversityName);
        student1.displayInformation();
        
        
        CreateFunction student2=new CreateFunction("Ahmed");
        student2.displayInformation();
        
    }
    
}
