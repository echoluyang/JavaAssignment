import java.util.*; 

public class missNumber {
	public static List<Integer> missNumber(int[] nums) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		HashMap<Integer, Boolean> map = new HashMap<>();
		List<Integer> res = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			min = Math.min(min, nums[i]);
			max = Math.max(max, nums[i]);
			map.put(nums[i], true);
		}

		for (int i  = min; i < max; i++) {
			if (map.getOrDefault(i, false) == false) {
				res.add(i);
			}
		}

		return res;
   
	}
	public static void main(String[] args) {
		int[] nums = {4,7,9,10};
		System.out.print("Missing numbers are : ");
		List<Integer> res = missNumber(nums);
		for (int i = 0; i < res.size(); i++) {
			System.out.print(res.get(i) + " ");
		}
		System.out.println();

	}
}