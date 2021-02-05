import java.util.Scanner;

public class Boredom {
    //    https://codeforces.com/problemset/problem/455/A
    // accepted
    public static long[] dp = new long[100005], res = new long[100005];

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) dp[s.nextInt()]++;
        res[0] = 0;
        res[1] = dp[1];
        for (int i = 2; i < res.length; i++) res[i] = Math.max(res[i-1], res[i-2]+ i * dp[i]);
        System.out.println(res[100000]);
    }

}
