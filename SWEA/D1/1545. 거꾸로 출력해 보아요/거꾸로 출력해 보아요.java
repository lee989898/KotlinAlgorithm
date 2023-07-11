import java.util.Scanner;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = num; i >= 0; i--) {
            System.out.print(i + " ");
        }

    }
}