
package problem_solving;

class person {
  String x;
int b;

    person() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


void display () {
    System.out.println("name: "+x);
    System.out.println("Age: "+b);
    System.out.println();
}
}
public class Class_And_Object {
    public static void main(String[] args) {
        
    
    person ob1=new person ();
    ob1.x="shoaib";
    ob1.b=21;
    ob1.display();
    
    person ob2=new person();
    ob2.x="laiyan";
    ob2.b=21;
    ob2.display();
    
}
}
