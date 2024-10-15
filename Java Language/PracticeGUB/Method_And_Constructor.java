
package problem_solving;

class Person{
    String name;
    int age;

Person (String name,int age) {
this.name=name;
this.age=age;
  }

void display(){
    System.out.println("name: "+name);
    System.out.println("Age"+age);
}
}
public class Method_And_Constructor {
    public static void main(String[] args) {
        Person ob1=new Person("Shoaib",21);
        ob1.display();
        
        Person ob2=new Person("Laiyan",21);
        ob2.display();
    }
}
