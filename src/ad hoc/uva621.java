import java.util.Scanner;

public class uva621 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t > 0) {

            String str = s.next();
            if(str.substring(Math.max(str.length() - 2, 0)).equals("35"))
                System.out.println("-");
            else if(str.substring(Math.max(str.length() - 1, 0)).equals("4") && str.charAt(0) == '9')
                System.out.println("*");
            else if(str.charAt(0) == '1' &&
                    str.charAt(1) == '9' &&
                    str.charAt(2) == '0')
                System.out.println("?");
            else if(str.equals("1") || str.equals("4") || str.equals("78"))
                System.out.println("+");
            t--;
        }
    }
}
