import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a == 1) {
            if(b == 2) {
                System.out.println("B");
            }
            if(b == 3) {
                System.out.println("A");
            }
        } else if(a == 2) {
            if(b == 1) {
                System.out.println("B");
            }
            if(b == 3) {
                System.out.println("A");
            }        
        } else {
            if(b == 1) {
                System.out.println("B");
            }
            if(b == 2) {
                System.out.println("A");
            }        	
        }
    }
}