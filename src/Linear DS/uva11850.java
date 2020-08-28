import java.util.Arrays;
import java.util.Scanner;

public class uva11850 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while(true) {
            int n = s.nextInt();
            if (n == 0) return;
            int[] loc = new int[n];
            for (int i = 0; i < n; i++) {
                loc[i] = s.nextInt();
            }
            Arrays.sort(loc);
            boolean flag = true;
            int t = 0;
            for (int i = 1; i < n; i++) {
                t = loc[i] - loc[i-1];
                if(t > 200) {
                    flag = false;
                    break;
                }
            }
            int d = (1422 - loc[n-1]) * 2;
            if (d > 200)
                    flag = false;
            if(flag == false)
                System.out.println("IMPOSSIBLE");
            else
                System.out.println("POSSIBLE");
        }

    }
}
