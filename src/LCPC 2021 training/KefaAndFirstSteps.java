import java.util.Scanner;

public class KefaAndFirstSteps {
    //https://codeforces.com/problemset/problem/580/A
    //accepted
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), max = 1;
        int[] arr = new int[n], lis = new int[n];
        lis[0] = 1;
        arr[0] = s.nextInt();
        for (int i = 1; i < n; i++) {
            arr[i] = s.nextInt();
            if(arr[i] >= arr[i-1]) lis[i] = lis[i-1] + 1;
            else lis[i] = 1;
            if(max < lis[i]) max = lis[i];
        }
        System.out.println(max);
    }
}
