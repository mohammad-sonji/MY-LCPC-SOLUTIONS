import java.util.Scanner;

public class uva679 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int d = s.nextInt(), i = s.nextInt();
            int vertices = (int)Math.pow(2, d);
            System.out.println(binarySearch(1, vertices, i));
        }
    }
    private static int binarySearch(int vertex, int vertices, int balls) {
        int left = vertex * 2, right = vertex * 2 + 1;
        if(left < vertices && right < vertices) {
            if (balls % 2 == 0)
                return binarySearch(right, vertices, balls / 2);
            else
                return binarySearch(left, vertices, balls / 2 + 1);
        }
        return vertex;
    }
}
