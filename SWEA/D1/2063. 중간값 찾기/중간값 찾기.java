import java.util.Scanner;
import java.util.Arrays;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int[] nums = new int[num];
        for(int i = 0; i < num; i++) {
            nums[i] = sc.nextInt();
        }
        
        Arrays.sort(nums);
        
        System.out.print(nums[num / 2]);
	}
}