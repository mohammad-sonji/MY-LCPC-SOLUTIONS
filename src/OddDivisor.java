import java.util.Scanner;

// https://codeforces.com/problemset/problem/1475/A
public class OddDivisor {
    // Accepted, vip (bitcount)
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            long n = s.nextLong();
            if (n % 2 == 1) {
                System.out.println("YES");
                continue;
            }
            System.out.println((Long.bitCount(n) == 1) ? "NO" : "YES");
        }
    }
}
