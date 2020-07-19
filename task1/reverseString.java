public class reverseString {
	public static String Reverse(String input) {
		char[] chars = input.toCharArray();
		int left = 0, right = chars.length-1;
		while (left < right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			left += 1;
			right -= 1;
		}
		String res = String.valueOf(chars);
		return res;

	}

	public static void main(String[] args) {
		System.out.println(Reverse("abc"));

	}
}

