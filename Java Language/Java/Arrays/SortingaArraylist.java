
package Arrays;

import java.util.ArrayList;
import java.util.Collections;


public class SortingaArraylist {

    
    public static void main(String[] args) {
        
        ArrayList<Integer>num=new ArrayList<>();
        
        num.add(20);
        num.add(30);
        num.add(-12);
        num.add(-4);
        num.add(54);
        num.add(90);
        num.add(-79);
        num.add(29);
        
        System.out.println("After Sorting Number: "+num);
        
        Collections.sort(num);
        System.out.println("Before Ascending Sort Number: "+num);
        
        Collections.sort(num,Collections.reverseOrder());
        System.out.print("Before Descending Sort Number: "+num);
    }
    
}
