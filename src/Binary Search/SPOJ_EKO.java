import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SPOJ_EKO {

    private static int[] arr;
    private static int n;
    private static long m;

    public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine());
        n = Integer.parseInt(tokenizer.nextToken());
        m = Long.parseLong(tokenizer.nextToken());
        arr = new int[n];
        tokenizer = new StringTokenizer(bufferedReader.readLine());
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
            max = Math.max(arr[i], max);
        }
        System.out.print(binarySearch(1, max));
    }

    private static boolean can(int num) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] > num)
                sum += arr[i] - num;
        }
        return sum >= m;
    }

    private static int binarySearch(int left, int right) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (can(middle))
                left = middle + 1;
            else
                right = middle - 1;
        }
        return right;
    }

}
