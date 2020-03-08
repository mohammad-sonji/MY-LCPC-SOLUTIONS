import java.util.Scanner;

public class uva10077 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            int m = s.nextInt();
            int n = s.nextInt();
            if (m == 1 && n == 1) break;
            double div = (double) m / n;
            StringBuilder sb = new StringBuilder();
            System.out.println(binarySearch(0, 1, 1, 0, div, sb));
        }
    }

    private static String binarySearch(int m, int n, int m1, int n1, double div, StringBuilder sb) {
        while (true) {
            double mid = ((double)m + m1) / ((double)n + n1);
            if (div < mid) {
                sb.append("L");
                m1 = m1+m;
                n1 = n1+n;
            } else if (div > mid) {
                sb.append("R");
                m = m+m1;
                n = n+n1;
            } else
                break;
        }
        return sb.toString();
    }
}
