import java.util.Scanner;

public class uva11057 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            int m = s.nextInt();

            int x = 0, y = 0;
            for (int i = 0; i < n-1; i++) {
                for (int j = i+1; j < n; j++) {
                    if (arr[i] + arr[j] == m) {
                        if (Math.abs(arr[i] - arr[j]) < Math.abs(x - y) && x != 0 && y != 0) {
                            x = arr[i];
                            y = arr[j];
                        } else if (x == 0 && y == 0) {
                            x = arr[i];
                            y = arr[j];
                        }
                    }
                }
            }
            if (x <= y)
                System.out.println("Peter should buy books whose prices are " + x + " and " + y + ".");
            else
                System.out.println("Peter should buy books whose prices are " + y + " and " + x + ".");
            System.out.println();
        }
    }
}
