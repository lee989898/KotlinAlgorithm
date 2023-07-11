import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        
        for(int i = 1; i <= testcase; i++) {
        	int sum = 0;
            for(int j = 0; j < 10; j++) {
           		sum += sc.nextInt();
            }
            System.out.println("#" + i + " " + Math.round(sum * 10 / 100.0));
        }
	}
}