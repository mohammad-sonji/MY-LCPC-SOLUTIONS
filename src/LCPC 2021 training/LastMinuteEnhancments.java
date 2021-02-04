import java.util.Scanner;

public class LastMinuteEnhancments {
    //https://codeforces.com/problemset/problem/1466/B
    //accepted
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int x = 0, y = 0;
            int[] count = new int[2*n+5];
            for (int i = 0; i < n; i++) {
                y = x;
                x = s.nextInt();
                if (x <= y) x++;
                if (count[x] == 0) count[x]++;
            }
            int sum = 0;
            for (int i = 0; i < count.length; i++) sum += count[i];
            System.out.println(sum);
        }
    }
}
