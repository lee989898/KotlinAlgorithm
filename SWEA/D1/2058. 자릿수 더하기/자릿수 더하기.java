import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sum = 0;
        for(int i = 0; i < str.length(); i++) {
        	sum += str.charAt(i) - '0';
        }
        System.out.print(sum);
	}
}