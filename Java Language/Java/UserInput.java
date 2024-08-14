
package userinput.java;

import java.util.Scanner;

public class UserInput {
    
   
   public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       Scanner input1= new Scanner(System.in);
       
       int id,price;
       String title,discription,catagory;
       
       System.out.println("id");
       id= input.nextInt();
               System.out.println("Id:"+id);
               
                System.out.println("price");
       price= input.nextInt();
               System.out.println("price:"+price);
               
               System.out.println("tite");
       title= input1.nextLine();
               System.out.println("title:"+title);
               
               System.out.println("discription");
       discription= input1.nextLine();
               System.out.println("discription:"+discription);
               
                 System.out.println("catagory");
      catagory= input1.nextLine();
               System.out.println("catagory:"+catagory);
               
               
               
   }
    
}
