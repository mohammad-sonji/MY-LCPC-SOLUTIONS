package week4;

import java.util.Scanner;
// accepted 
public class uva11926 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while (s.hasNext()) {
            boolean[] time = new boolean[1000001];
            int n = s.nextInt();
            int m = s.nextInt();
            if (n == 0 && m == 0) break;
            boolean con = false;

            for (int i = 0; i < n; i++) {
                int start = s.nextInt();
                int end = s.nextInt();

                for (int j = start; j < end && j < time.length; j++) {
                    if (time[j]) {
                        con = true;
                        break;
                    }
                    time[j] = true;
                }
            }

            if (!con)
                for (int i = 0; i < m; i++) {
                    int start = s.nextInt();
                    int end = s.nextInt();
                    int repeat = s.nextInt();

                    while (start < time.length) {
                        for (int j = start; j < end && j < time.length; j++) {
                            if (time[j]) {
                                con = true;
                                break;
                            }
                            time[j] = true;
                        }
                        if (con) break;
                        start += repeat;
                        end += repeat;
                    }
                }
            if (con) System.out.println("CONFLICT");
            else System.out.println("NO CONFLICT");
        }
    }
}

