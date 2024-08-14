
package Inheritance;

 
public class PrivateTeacher  extends PrivatePerson {
    
    private  String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
    void displayInformation() {
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getQualification());
    }
    
    public static void main(String[] args) {
        PrivateTeacher db1=new PrivateTeacher();
        
        db1.setName("shoaib Ahmed");
        db1.setAge(24);
        db1.setQualification("Bsc in CSE");
        db1.displayInformation();
        
    }
}
