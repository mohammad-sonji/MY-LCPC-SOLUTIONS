import java.util.Scanner;

public class IOU {
    //https://codeforces.com/contest/376/problem/B
    // accepted
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), m = s.nextInt();
        int[] arr = new int[n+1];
        for (int i = 0; i < m; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            arr[b] += c;
            arr[a] -= c;
        }
        int res = 0;
        for (int i = 1; i <= n; i++) if(arr[i] > 0) res += arr[i];
        System.out.println(res);
    }
}
