import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        
        for(int i = 1; i <= tc; i++) {
            int max = 0;
                
            for(int j = 1; j <= 10; j++) {
            	int num = sc.nextInt();
                if(num > max) {
                	max = num;
                }
            }
            
            System.out.println("#" + i + " " + max);
        }
	}
}