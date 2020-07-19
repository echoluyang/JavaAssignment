import java.util.*;

public class duplicateChar {
	public static List<Character> findDuplicate(String str) {
		List<Character> res = new ArrayList<>();
		Map<Character, Integer> map = new HashMap<>();
		for (int i=0;i < str.length(); i++) {
			char c = str.charAt(i);
			map.put(c, map.getOrDefault(c,0)+1);
		}

		Iterator iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry mapElement = (Map.Entry)iterator.next();
			int cnt = (int)mapElement.getValue();
			if (cnt > 1) {
				res.add((Character)mapElement.getKey());
			}
		}
		return res;

	}
	public static void main(String[] args) {
		String str = "duplicate characters in a string";
		List<Character> res = findDuplicate(str);
		System.out.print("Duplicate characters in string \"" + str + "\" are:");
		for (int i=0; i< res.size(); i++){
			System.out.print(res.get(i) + " ");
		}
		System.out.println();
	}
}