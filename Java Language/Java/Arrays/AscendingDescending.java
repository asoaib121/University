package Arrays;

import java.util.Arrays;

public class AscendingDescending {

    public static void main(String[] args) {

        int[] num = {-1, -7, 3, 2, 7, 9};

        Arrays.sort(num);

        System.out.print("Ascending Number: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(num[i] + " ");
        }

        System.out.println();
        System.out.print("Descending number:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(" " + num[i]);
        }

    }

}
