import java.util.Scanner;

public class uva11332 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while(true) {
            int n = s.nextInt();
            if (n == 0) return;
            if (n % 10 == n) {
                System.out.println(n);
                continue;
            }
            int sum = 0;
            while(true) {
                int x = n % 10;
                sum += x;
                n /= 10;
                if(sum % 10 != sum && n == 0){
                    n = sum;
                    sum = 0;
                }
                if(n == 0 && sum % 10 == sum) break;
            }
            System.out.println(sum);
        }
    }
}
