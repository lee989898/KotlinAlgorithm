import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        
        for(int i = 1; i <= tc; i++) {
        	String expr = "";
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(a > b) {
           		expr = ">";
            } else if(a < b) {
            	expr = "<";
            } else {
            	expr = "=";
            }
            
            System.out.println("#" + i + " " + expr);
        }
        
	}
}