package JavaOop;

import java.io.File;

public class FileDemo1 {

    public static void main(String[] args) {

        File dir = new File("C:/Users/soaib/Desktop/Shoaib");
        dir.mkdir();
        /*
        String dirlocation=dir.getAbsolutePath();
        System.out.println(dirlocation);
        
        System.out.println(dir.getName());
        
        if(dir.delete()) {
            System.out.println("The file has been delete");
        } */

        File file1 = new File("C:/Users/soaib/Desktop/Shoaib/Student.txt");

        try {
            file1.createNewFile();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        if(file1.exists()) {
            System.out.println("File is Exists");
        }
        
        
      
    }

   
}

