public class removeWhiteSpace {
	public static String removeWhiteSpace(String str) {
		StringBuilder res = new StringBuilder();
		for (int i=0; i < str.length(); i++) {
			if (str.charAt(i) == ' ' || str.charAt(i) == '\t') continue;
			else {
				res.append(str.charAt(i));
			}
		}
		return res.toString();
	}


	public static void main(String[] args) {
		String str = "Write a Java Program to remove all white spaces from a string without using replace.";
		System.out.println("Sentence is: " + str);
		System.out.println("After remove get: " + removeWhiteSpace(str));
		
	}
}