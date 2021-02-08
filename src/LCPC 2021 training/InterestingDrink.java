import java.util.Arrays;
import java.util.Scanner;

public class InterestingDrink {
    //    https://codeforces.com/problemset/problem/706/B
    // Accepted
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            if(arr[i] > max) max = arr[i];
        }
        Arrays.sort(arr);
        int q = s.nextInt();
        int[] c = Count_Sort_modified(arr);
        for (int i = 0; i < q; i++) {
            int x = s.nextInt();
            if(x >= max) x = c.length-1;
            System.out.println(c[x]);
        }
    }

    private static int[] Count_Sort_modified(int[] a) {
        int n = a.length, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
            if (max < a[i]) max = a[i];
        int[] c = new int[max + 1];
        for (int i = 0; i < c.length; i++)
            c[i] = 0;
        for (int i = 0; i < n; i++)
            c[a[i]]++;
        for (int i = 1; i < c.length; i++)
            c[i] += c[i - 1];
        return c;
    }
}
