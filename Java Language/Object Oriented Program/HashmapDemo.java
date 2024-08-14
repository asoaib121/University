
package javacode1.oop;

import java.util.HashMap;


public class HashmapDemo {

   
    public static void main(String[] args) {
        HashMap<Integer,String> a=new HashMap <Integer,String>();
        
        a.put(200,"Shoaib");
        a.put(201,"Ahmed");
        a.put(202,"Laiyan");
        
        System.out.println(a.get(200));
        System.out.println(a.get(201));
        System.out.println(a.get(202));
    }
    
}
