package Arrays;

public class FindOutput {

    public static void main(String[] args) {
        int k = 0;
        int[][] num = new int[4][];
        num[0] = new int[1];
        num[1] = new int[2];
        num[2] = new int[3];
        num[3] = new int[4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                num[i][j] = k;
                k++;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
         System.out.println("\n");
        
        
         for (int i = 3; i >= 0; i--) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = k;
                k++;
            }
        }
        for (int i = 3; i >= 0; i--) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }

}
