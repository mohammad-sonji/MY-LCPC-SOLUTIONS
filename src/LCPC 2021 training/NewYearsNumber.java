import java.util.Scanner;

public class NewYearsNumber {
    //https://codeforces.com/problemset/problem/1475/B
    //accepted
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            boolean check = check(n, 0, 0);
            if (check) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean check(int n, int res, int count) {
        if (res == n || ((n - res) <= count && (n - res) > 0)) return true;
        if (res > n) return false;
        return check(n, res + 2020, count + 1);
    }
}
