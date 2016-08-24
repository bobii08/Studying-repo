package Tasks2;

import java.util.Scanner;

public class ZAD24 {

	public static void main(String[] args) {
		System.out.println("Please Enter a number : ");
        int n = new Scanner(System.in).nextInt();
        if(isPalindrome(n)){
            System.out.println("Number : " + n + " is a palindrome");
        }else{
            System.out.println("Number : " + n + " is not a palindrome");
        }         
    }
    public static boolean isPalindrome(int number) {
        int n = number;
        int reverse = 0;

        while (n != 0) {
            int remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;
        }
        if (number == reverse) {
            return true;
        }
        return false;
    }

}
