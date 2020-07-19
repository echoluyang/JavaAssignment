//Write a Java Program to iterate ArrayList using for-loop, while-loop, and advance for-loop.

import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class iterArrayList {
	public static void iterForLoop(ArrayList<Integer> nums) {
		System.out.print("Iterate ArrayList using for-loop: ");
		for (int i = 0; i < nums.size(); i++) {
			System.out.print(nums.get(i) + " ");
		}
		System.out.println();
	}

	public static void iterWhileLoop(ArrayList<Integer> nums) {
		System.out.print("Iterate ArrayList using while-loop: ");
		Iterator iterator = nums.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();

	}

	public static void iterAdvanced(ArrayList<Integer> nums) {
		System.out.print("Iterate ArrayList using advanced for-loop: ");
		for (Integer num: nums) {
			System.out.print(num + " ");
		}
		System.out.println();
	}


	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		for (int i=0; i < 10; i++) {
			nums.add(i+1);
		}
		
		iterForLoop(nums);
		iterWhileLoop(nums);
		iterAdvanced(nums);

	}
}




