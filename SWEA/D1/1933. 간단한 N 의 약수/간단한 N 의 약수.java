import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> stk = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            if (n % i == 0) {
                stk.add(i);
            }
        }

        for(int i = 0; i < stk.size(); i++) {
            System.out.print(stk.get(i) + " ");
        }
    }
}