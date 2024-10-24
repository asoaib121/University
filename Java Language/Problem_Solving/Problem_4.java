/*
Constructor Overloading
Write a Java program to create a class called "Book" with instance variables title, author, and price. Implement a default constructor and two parameterized constructors:

One constructor takes title and author as parameters.
The other constructor takes title, author, and price as parameters.
Print the values of the variables for each constructor.
*/
package problem_solving;

class Book {
String title;
String author;
int price;

Book(){
    System.out.println("No Information");
}

Book(String title,String author){
    this.title=title;
    this.author=author;
}
Book(String title,String author,int price){
    this.title=title;
    this.author=author;
    this.price=price;
}
public void display(){
    System.out.println("Title: "+title);
    System.out.println("Author: "+author);
    System.out.println("Price: "+price);
}
}
public class Problem_4 {
    public static void main(String[] args) {
        Book db1=new Book();
        db1.display();
        System.out.println();
        
        Book db2=new Book("Advanced java","Anom bojlol rahman");
        db2.display();
        System.out.println();
        
        Book db3=new Book("Data and computer"," Stallings William",1360);
        db3.display();
    }
}
