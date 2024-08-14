
package javacode1.oop;

import java.util.HashSet;


public class HashsetDemo {
    
    public static void main(String[] args) {
        
        HashSet<String> town=new HashSet<String>();
        
        town.add("Dhaka");
        town.add("Tokiyo");
        town.add("new york");
        town.add("Kolkata");
        
        System.out.println(town);
    
        System.out.println("Size= "+town.size());
        
        town.remove("new york");
        System.out.println(town);
        
        town.clear();
        System.out.println(town);
        boolean value=town.isEmpty();
        System.out.println(value);
        
    }
    
}
