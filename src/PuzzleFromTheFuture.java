import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://codeforces.com/problemset/problem/1474/A
public class PuzzleFromTheFuture {
    // accepted

    public static int[] a = new int[100005], b = new int[100005];

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int t = Integer.valueOf(br.readLine());
        while (t-- > 0) {
            int n = Integer.valueOf(br.readLine());
            String str = br.readLine();
            for (int i = 1; i <= n; i++) b[i] = Integer.valueOf(str.charAt(i - 1) - '0');
            a[1] = 1;
            for (int i = 2; i <= n; i++) {
                int j;
                for (j = 1; j >= 0; j--) if (j + b[i] != a[i - 1] + b[i - 1]) break;
                a[i] = j;
            }
            String result = "";
            for (int i = 1; i <= n; i++) result += a[i];
            System.out.println(result);
        }
    }

}
