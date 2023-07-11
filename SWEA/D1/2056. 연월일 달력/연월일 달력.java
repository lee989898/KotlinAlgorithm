import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for (int i = 1; i <= tc; i++) {
            String str = sc.next();

            String year = str.substring(0, 4);
            String month = str.substring(4, 6);
            String day = str.substring(6, 8);

            int m = Integer.parseInt(month);
            int d = Integer.parseInt(day);

            if (m == 4 || m == 6 || m == 9 || m == 11) {
                if (1 <= d && d <= 30) {
                    str = year + "/" + month + "/" + day;
                } else {
                    str = "-1";
                }
            } else if (m == 2) {
                if (1 <= d && d <= 28) {
                    str = year + "/" + month + "/" + day;
                } else {
                    str = "-1";
                }
            } else if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){
                if (1 <= d && d <= 31) {
                    str = year + "/" + month + "/" + day;
                } else {
                    str = "-1";
                }
            } else {
                str = "-1";
            }

            System.out.println("#" + i + " " + str);
        }
    }
}