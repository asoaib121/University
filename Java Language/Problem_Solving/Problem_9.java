/*
*Write a Java program to create a class called Animal with a method called makeSound().
Create a subclass called Cat that overrides the makeSound() method to bark.
*/
package problem_solving;

class Animal {
    public void makeSound(){
        System.out.println("The fluet make many sound");
    }
}
class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("I have a cat");
    }
}
public class Problem_9 {
    public static void main(String[] args) {
        Animal db=new Animal();
        db.makeSound();
        System.out.println();
        
        Cat db1=new Cat();
        db1.makeSound();
    }
}
