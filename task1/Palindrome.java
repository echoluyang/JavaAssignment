import java.lang.*;
class Palindrome {
	public static boolean isPalindrome(String str) {
		int l = 0, r = str.length()-1;
		while (l < r) {
			if (str.charAt(l) != str.charAt(r)) {
				return false;
			}
			l += 1;
			r -= 1;
		}
		return true;
	}


	public static boolean isPalindrome(int num) {
		int newnum = 0;
		int origin = num;
		while (num > 0) {
			int digit = num % 10;
			newnum = newnum * 10 + digit;
			num /= 10;
		}

		return (newnum == origin)? true:false;

	}
	public static void main(String[] args) {
		String str = "abcdedcba";
		System.out.println(str + " is Palindrome: " + isPalindrome(str));
		System.out.println();
		int num = -1234321;
		System.out.println(num + " is Palindrome: " + isPalindrome(num));
	}
}