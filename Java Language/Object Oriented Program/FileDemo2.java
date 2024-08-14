package JavaOop;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class FileDemo2 {

    public static void main(String[] args) {

        String name;
        int id;

        try {
             Formatter formatter = new Formatter("C:/Users/soaib/Desktop/Shoaib/Student.txt/");
            System.out.print("Enter and and name: ");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();

            for (int i = 1; i <= num; i++) {
                System.out.print("Enter a name: ");
                name=input.next();
                
                System.out.print("Enter an id: ");
                id=input.nextInt();
               
                formatter.format("%s %d  \r \n",name,id);
            }

            formatter.close();

        } catch (FileNotFoundException a) {
            System.out.println(a);
        }
    }

}
