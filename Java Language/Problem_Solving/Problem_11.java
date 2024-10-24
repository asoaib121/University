/*
*Write a Java program to create a class called Employee with methods called work() and getSalary().
Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
*/
package problem_solving;

class Employee{
    int sallery;
    Employee(int sallery){
        this.sallery=sallery;
    }
    public void work(){
        System.out.println("Working as an Employee");
    }
    public int getSallery(){
        return sallery;
    }
}

class HRManager extends Employee {

    public HRManager(int sallery) {
        super(sallery);
    }
    
    @Override
    public void work(){
        System.out.println("Managing Empoyee");
    } 
    
    public void addEmployee(){
        System.out.println("Adding new Employee");
    }
}
public class Problem_11 {
    public static void main(String[] args) {
        Employee db=new Employee(7000);
        System.out.println("Employee Sallery: "+db.getSallery());
        db.work();
        System.out.println();
        
        HRManager db1=new HRManager(12000);
        System.out.println("Manager Sallery: "+db1.getSallery());
        db1.work();
        System.out.println();
        
        db1.addEmployee();
    }
    
}
