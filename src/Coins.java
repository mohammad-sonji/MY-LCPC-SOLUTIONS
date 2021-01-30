import java.util.Scanner;

public class Coins {
    //    https://codeforces.com/contest/47/problem/B
    public static int a = 0, b = 0, c = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String x = s.nextLine();
        String y = s.nextLine();
        String z = s.nextLine();
        check(x);
        check(y);
        check(z);
        if(a == b || b == c || a == c) {
            System.out.println("Impossible");
            return;
        }
        System.out.println(result());
    }

    private static String result() {
        String result;
        int max;
        if(a < b && a < c) {
            result = "A";
            if(b < c) result += "BC";
            else result += "CB";
        } else if (b < a && b < c) {
            result = "B";
            if(a < c) result += "AC";
            else result += "CA";
        } else {
            result = "C";
            if(a < b) result += "AB";
            else result += "BA";
        }
        return result;
    }

    public static void check(String str) {
        if(str.charAt(1) == '<') {
            if(str.charAt(2) == 'A') a++;
            else if(str.charAt(2) == 'B') b++;
            else c++;
        } else if(str.charAt(1) == '>') {
            if(str.charAt(0) == 'A') a++;
            else if(str.charAt(0) == 'B') b++;
            else c++;
        }
//        System.out.println(a + " " + b + " " + c);
    }

}
