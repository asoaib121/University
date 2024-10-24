package problem_solving;

class Dog {
    private String name;
    private String breed;

    Dog(String name,String breed){
        this.name=name;
        this.breed=breed;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setBreed(String breed){
        this.breed=breed;
    }
    public String getBreed(){
        return breed;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Breed: "+breed);
    }
}
public class Problem_12 {
    public static void main(String[] args) {
        Dog db1=new Dog("charley","chepil");
        db1.display();
        System.out.println();
        
        Dog db2=new Dog("dian","diln");
        db1.display();
        System.out.println();
        
        db1.setName("Mths");
        db1.setBreed("geny");
        db1.display( );
    }
    
}
