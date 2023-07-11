import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 1; i <= tc; i++) {
            String str = sc.next();

            String year = str.substring(0, 4);
            String month = str.substring(4, 6);
            String day = str.substring(6, 8);

            int m = Integer.parseInt(month);
            int d = Integer.parseInt(day);

            if (m > 12 || m == 0 || d > days[m] || d == 0) {
                str = "-1";
            } else {
                str = year + "/" + month + "/" + day;
            }

            System.out.println("#" + i + " " + str);
        }
    }
}