import java.util.Scanner;

public class uva591 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int set = 1;
        while(true){
            int n = s.nextInt();
            if(n == 0) return;
            int[] arr = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
                sum += arr[i];
            }
            int k = 0, h = sum / n;
            for (int i = 0; i < n; i++) {
                if (arr[i] > h) {
                    while(arr[i] != h){
                        k++;
                        arr[i]--;
                    }
                }
            }
            System.out.println("Set #" + set);
            System.out.println("The minimum number of moves is " + k + ".");
            System.out.println();
            set++;
        }
    }
}
