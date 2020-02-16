package week4;

import java.util.Arrays;
import java.util.Scanner;

public class uva10038 {

    private static int n, count;
    private static int[] arr, bool;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            count = 0;
            n = s.nextInt();
            arr = new int[n];
            bool = new int[n];
            Arrays.fill(bool, 1);
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }

            boolean jolly = true;
            for (int i = 0; i < n - 1; i++) {
                int abs = Math.abs(arr[i] - arr[i + 1]);
                if (abs >= n || abs < 1 || !contains(abs)) {
                    jolly = false;
                    break;
                }
            }
            if (jolly && count == n - 1) System.out.println("Jolly");
            else System.out.println("Not jolly");
        }
    }

    public static boolean contains(int x) {
        if (bool[x] != 0) {
            bool[x] = 0;
            count++;
            return true;
        }
        return false;
    }
}