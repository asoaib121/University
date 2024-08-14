package JavaOop;

public class Encapsulation {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Encapsulation db1 =new Encapsulation();
        
        db1.setName("Shoaib");
        System.out.println(db1.getName());
        
        db1.setAge(21);
        System.out.println(db1.getAge());
    }

}
