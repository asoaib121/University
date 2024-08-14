
package javacode1.oop;

import java.util.LinkedList;


public class LinkedListDemo {

    
    public static void main(String[] args) {
        LinkedList<String> countryname=new LinkedList();
        
        countryname.add("Bangladesh");
        countryname.add("Nepal");
        countryname.add("Bhutan");
        countryname.add("Srilonka");
        countryname.addFirst("Afganisthan");
        countryname.addLast("Australia");
        countryname.add("Japan");
        
        for(String country:countryname) {
            System.out.println(country);
        }
        System.out.println("Size of linkedlist: "+countryname.size());
        countryname.clear();
        System.out.println(countryname);
       
    }
    
}
