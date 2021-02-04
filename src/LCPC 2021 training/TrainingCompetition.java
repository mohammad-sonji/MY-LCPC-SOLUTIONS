import java.util.Scanner;

public class TrainingCompetition {
    // E teams Accepted
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            int max = Integer.MIN_VALUE, sum = 0, min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
                max = Math.max(max, arr[i]);
                min = Math.min(min, arr[i]);
                sum += arr[i];
            }
            int k = 0;
            for (int i = 2; i <= min; i++) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if(arr[j] % i == 0) count++;
                    else break;
                }
                if(count == n) k = i;
            }
            if(k == 0) System.out.println(1 + " " + sum);
            else System.out.println(k + " " + (sum/k));
        }
    }
}
