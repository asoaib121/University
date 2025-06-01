package abc;

public class Lis {

    public static int lis(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];


        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int maxLen = 0;
        for (int len : dp) {
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] sequence = {9, 2, 5, 3, 7, 11, 8, 10, 13, 6};
        int length = lis(sequence);

        System.out.print("Total sequence number: ");
        for(int i=0;i<sequence.length;i++) {
            System.out.print(" "+sequence[i]);

        }
        System.out.println();
        System.out.println("Length of Longest Increasing Subsequence: " + length);
    }
}