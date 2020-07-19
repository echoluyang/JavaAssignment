//Write a Java Program to iterate HashMap using While and advance for loop.
import java.util.*;
public class iterHashMap {
	public static Map<String, Integer> constructMap(String str) {
		String[] words = str.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (String word:words) {
			map.put(word, map.getOrDefault(word,0)+1);
		}
		return map;
	}

	public static void iterWhile (Map<String, Integer> map) {
		Iterator iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry mapElement = (Map.Entry)iterator.next();
			System.out.println("Key: " + mapElement.getKey() + " & Value : " + mapElement.getValue());
		}
	}

	public static void iterFor(Map<String, Integer> map) {
		for (Map.Entry mapElement : map.entrySet()) {
			System.out.println("Key: " + mapElement.getKey() + " & Value: " + mapElement.getValue());
		}

	}


	public static void main(String[] args) {
		Map<String, Integer> hashmap = constructMap("a a b b c c d d e f");
		System.out.println("----------Iterate map using While loop----------");
		iterWhile(hashmap);
		System.out.println();

		System.out.println("----------Iterate map using For loop----------");
		iterFor(hashmap);
		
	}
}




