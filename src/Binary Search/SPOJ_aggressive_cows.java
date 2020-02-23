import java.util.Arrays;
import java.util.Scanner;

public class SPOJ_aggressive_cows {

    private static int n, c;
    private static int[] pos;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        while(t-- > 0) {
            n = s.nextInt();
            c = s.nextInt();
            pos = new int[n];
            for (int i = 0; i < n; i++) {
                pos[i] = s.nextInt();
            }

            Arrays.sort(pos);

            System.out.println(binarySearch(0, pos[pos.length-1] - pos[0]));
        }
    }

    private static boolean can(int num){
        int count = 1, lastPos = pos[0];
        for (int i = 1; i < pos.length; i++) {
            if(pos[i]-lastPos < num)
                continue;
            count++;
            if(count == c)
                return true;
            lastPos = pos[i];
        }
        return false;
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
