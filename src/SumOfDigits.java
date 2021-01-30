import java.util.Scanner;
// https://codeforces.com/contest/102/problem/B
public class SumOfDigits {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String l = s.nextLine();
        int count = 0;
        int length = l.length();
        while (length > 1) {
            int sum = 0;
            for (int i = 0; i < length; i++)
                sum += l.charAt(i) - '0'; // subtracting 0 from the ascii value of a number gives the real value of that number
            l = "" + sum;
            length = l.length();
            count++;
        }
        System.out.println(count);
    }
}
