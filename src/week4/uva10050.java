package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
// accepted
public class uva10050 {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int t = Integer.valueOf(br.readLine());
        while (t-- > 0) {
            int n = Integer.valueOf(br.readLine());
            int p = Integer.valueOf(br.readLine());
            int[] arr = new int[p];
            for (int i = 0; i < p; i++) {
                arr[i] = Integer.valueOf(br.readLine());
            }
            // solution
            int d = 0;
            int[] days = new int[n];
            Arrays.fill(days, 0);
            for (int i = 1; i <= n; i++) {
                if (i % 7 != 0 && i % 7 != 6) {
                    for (int j = 0; j < p; j++) {
                        if (i % arr[j] == 0 && days[i-1] == 0) {
                            d++;
                            days[i-1] = 1;
//                            System.out.println("player: " + j + " : " + i);
                        }
                    }
                }
            }
            System.out.println(d);
        }

    }
}
