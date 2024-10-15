
package problem_solving;
 
 class Privateperson {
    private String name;
    private int age;
    
public String getname () {
    return name;
}

public void  setName(String name) {
this.name=name;
}

public int getage() {
return age;
}

public void setAge(int age) {
this.age=age;
}
}
public class Inheritance extends Privateperson {
   
        
  private String qualification;
        public String getqualification () {
return qualification;
}
  public void setqualification (String qualification)     {
  this.qualification=qualification;
   }  
   void display () {
       System.out.println(getname());
       System.out.println(getage());
       System.out.println(getqualification ());
   } 
    public static void main(String[] args) {
        Inheritance ob1 =new Inheritance();
        ob1.setName("shoaib ahmed");
        ob1.setAge(21);
        ob1.setqualification("BSC in cse");
        ob1.display();
    }
}
    

