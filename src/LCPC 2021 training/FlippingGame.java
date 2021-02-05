import java.util.Scanner;

public class FlippingGame {
    //https://codeforces.com/problemset/problem/327/A
    // accepted
    public static int[][] dp = new int[105][105];

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = s.nextInt();
        System.out.println(dp(arr, 0, 0));
    }

    private static int dp(int[] arr, int i, int j) {
        if (j >= i && i < arr.length && j < arr.length) {
            if (dp[i][j] == 0) {
                int count = 0;
                for (int k = 0; k < arr.length; k++) {
                    if (k >= i && k <= j) count += 1 - arr[k];
                    else count += arr[k];
                }
                return dp[i][j] = Math.max(count, Math.max(dp(arr, i, j + 1), dp(arr, i + 1, i + 1)));
            } else return dp[i][j];
        } else return 0;
    }
}
