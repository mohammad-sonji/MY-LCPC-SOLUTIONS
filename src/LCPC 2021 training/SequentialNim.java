import java.util.Scanner;

public class SequentialNim {
    //https://codeforces.com/problemset/problem/1382/B
    //accepted
    // XOR operator
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = s.nextInt();
            int k = 0;
            while (k < n && arr[k] == 1) k++;
            if (k % 2 == 1 ^ k == n) System.out.println("Second");
            else System.out.println("First");
        }
    }
}
