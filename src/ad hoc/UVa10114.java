import java.util.Scanner;

public class UVa10114 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true) {
            int duration = s.nextInt();
            if (duration < 0) return;
            double dp = s.nextDouble();
            double amount = s.nextDouble();
            int dr = s.nextInt();
            double[] arr = new double[duration+1];
            for (int i = 0; i < dr; i++) {
                int month = (int) s.nextDouble();
                double rate = s.nextDouble();
                for (int j = month; j < arr.length; j++) {
                    arr[j] = rate;
                }
            }
            double worth = amount + dp, owes = amount;
            for (int i = 0; i < arr.length; i++) {
                worth -= worth * arr[i];
                if (i > 0)
                    owes = owes - (amount/duration);
                if(worth > owes) {
                    if(i == 1)
                        System.out.println(i + " month");
                    else
                        System.out.println(i + " months");
                    break;
                }
            }
        }
    }
}
