/*
*Modify the fix method to also change the third element of the arr3 array to 9. 
Then, print the sum of all elements in both arr1 and arr2 after calling the fix method.
 */
package problem_solving;

public class Problem_13 {

    public static void main(String[] args) {
        Problem_13 obj = new Problem_13();
        obj.start();
    }

    void start() {
        long[] arr1 = {3, 4, 5, 11};
        long[] arr2 = fix(arr1);

    System.out.println(arr1[0] + arr1[1] + arr1[2] + arr1[3]);
        System.out.println(arr2[0] + arr2[1] + arr2[2]);
    }
 long[] fix(long[] arr3) {
        arr3[1] = 7;
        return arr3;
    }
   
}//Output 26,15;