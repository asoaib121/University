
package Inheritance;


public class Teacher extends Person {
    
    String qualification;
    
    void displayInformation2() {
        displayInformation1();
        System.out.println("Qualification= "+qualification);
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        
        Teacher db1=new Teacher();
        db1.name="Shoaib";
        db1.age=24;
        db1.qualification="bsc in CSE";
        db1.displayInformation2();
        
        Teacher db2=new Teacher();
        db2.name="laiyan";
        db2.age=26;
        db2.qualification="Msc in CSE";
        db2.displayInformation2();
        
        
    }
    
}
