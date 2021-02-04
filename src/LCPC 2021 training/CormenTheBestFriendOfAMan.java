import java.util.Scanner;

public class CormenTheBestFriendOfAMan {
    //https://codeforces.com/problemset/problem/732/B
    //accepted
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), k = s.nextInt(), sum = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = s.nextInt();
        for (int i = 1; i < n; i++) {
            int x = (arr[i - 1] + arr[i]);
            if (x < k) {
                sum += k - x;
                arr[i] += k - x;
            }
        }
        System.out.println(sum);
        for (int i = 0; i < n - 1; i++) System.out.print(arr[i] + " ");
        System.out.println(arr[n-1]);
    }
}
