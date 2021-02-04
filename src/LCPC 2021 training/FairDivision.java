import java.util.Scanner;

//https://codeforces.com/problemset/problem/1472/B
public class FairDivision {
    // accepted
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt(), w1 = 0, w2 = 0, sum = 0;
            for (int i = 0; i < n; i++) {
                int x = s.nextInt();
                if(x == 1) w1++;
                else w2++;
                sum += x;
            }
            if (sum % 2 != 0 || (w2 % 2 !=0 && w1 == 0)) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
