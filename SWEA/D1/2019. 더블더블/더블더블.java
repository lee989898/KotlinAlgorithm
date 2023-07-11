import java.util.Scanner;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 1;

        System.out.print(result + " ");
        for (int i = 0; i < num; i++) {
            result *= 2;
            System.out.print(result + " ");
        }

    }
}