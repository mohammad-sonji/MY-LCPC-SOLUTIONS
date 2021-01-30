import java.util.Scanner;

// https://codeforces.com/problemset/problem/1475/A
public class OddDivisor {
    // Accepted
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            long n = s.nextLong();
            if (n % 2 == 1) {
                System.out.println("YES");
                continue;
            }
            while (n % 2 == 0) n /= 2;
            System.out.println((n > 1) ? "YES" : "NO");
        }
    }
}
