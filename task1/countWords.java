import java.util.*;
public class countWords{
	public static String count(String input) {
		String[] words = input.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (String word:words) {
			map.put(word, map.getOrDefault(word, 0)+1);
		}

		StringBuilder res = new StringBuilder();
		Iterator mapiter = map.entrySet().iterator();
		while (mapiter.hasNext()) {
			Map.Entry mapElement = (Map.Entry)mapiter.next();
			int cnt = (int) mapElement.getValue();
			res.append(mapElement.getKey() + " : " + cnt + "\n");
		}
		return res.toString();

	}

	public static void main(String[] args) {
		String input = "Write a Java Program to count the number of words in a string using HashMap";
		System.out.println(count(input));
	}

}