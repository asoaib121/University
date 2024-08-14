
package OverloadingConstructor;


public class OverloadingConstructor {
    public static void main(String[] args) {
        
        Teacher teacher1=new Teacher();
        teacher1.displayInformation();
        
        Teacher teacher2=new Teacher("Shoaib","twenty one");
        teacher2.displayInformation();
        
        Teacher teaacher3=new Teacher("Laiyan","Twenty",1738383938);
        teacher2.displayInformation();
        
    }
    
}
