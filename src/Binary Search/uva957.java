import java.util.Scanner;

public class uva957 {

    private static int y, p, max, count, f, l;
    private static int[] arr;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNext()) {
            y = s.nextInt();
            p = s.nextInt();
            arr = new int[p];
            for (int i = 0; i < p; i++) {
                arr[i] = s.nextInt();
            }
            f = l = 0;
            max = Integer.MIN_VALUE;
            System.out.println(binarySearch(1, p) + " " + f + " " + l);
        }
    }

    private static boolean popes(int num) {
        int total = Integer.MIN_VALUE, tf =0, tl = 0;
        for (int j = 0; j < arr.length; j++) {
            count = 1;
            for (int k = j+1; k < arr.length; k++) {
                if (arr[k] - arr[j] > y-1)
                    break;
                count++;
            }
            if(total < count) {
                total = count;
                tf = arr[j];
                tl = arr[j+count-1];
            }
        }
        if (max <= total) {
            max = total;
            f = tf;
            l = tl;
        }
        if(total < num)
            return false;
        return true;
    }

    private static int binarySearch(int left, int right) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (popes(middle))
                left = middle + 1;
            else
                right = middle - 1;
        }
        return right;
    }

}
