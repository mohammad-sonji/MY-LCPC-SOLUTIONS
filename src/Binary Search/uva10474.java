import java.util.Arrays;
import java.util.Scanner;

public class uva10474 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = 1;
        while(true){
            int n = s.nextInt(), q = s.nextInt();
            if(n == 0 && q == 0) break;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            Arrays.sort(arr);
            System.out.println("CASE# " + t + ":");
            for (int i = 0; i < q; i++) {
                int query = s.nextInt();
                int res = binarySearch(0, arr.length-1, arr, query);
                if(res == -1)
                    System.out.println(query + " not found");
                else
                    System.out.println(query + " found at " + res);
            }
            t++;
        }

    }
    private static int binarySearch(int left, int right, int[] arr, int query) {
        int ans = -1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (query > arr[middle]) {
                left = middle + 1;
            }
            else if(query < arr[middle]){
                right = middle - 1;
            } else {
                ans = middle + 1;
                right = middle - 1;
            }
        }
        return ans;
    }
}
