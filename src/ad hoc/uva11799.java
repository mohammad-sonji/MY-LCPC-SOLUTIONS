import java.util.Scanner;

public class uva11799 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt(), tc = 1;

        while(tc <= t) {

            int max = Integer.MIN_VALUE;
            int[] arr = new int[s.nextInt()];
            for (int i = 0; i < arr.length; i++) {
                int n = s.nextInt();
                if(max < n)
                    max = n;
            }

            System.out.println("Case " + tc + ": " + max);
            tc++;
        }
    }
}
