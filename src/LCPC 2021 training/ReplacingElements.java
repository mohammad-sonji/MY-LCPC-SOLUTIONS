import java.util.Arrays;
import java.util.Scanner;

//https://codeforces.com/problemset/problem/1473/A
public class ReplacingElements {
    // accepted
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0){
            int n = s.nextInt(), d = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = s.nextInt();
            Arrays.sort(arr); // 2 2 3 5 7
            if((arr[0] + arr[1]) > d && arr[n-1]>d) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
