public class secondHighest {
	public static int secondHighest(int[] nums) {
		if (nums.length < 2) {
			System.out.println("Not enough elements");
			return nums[0];
		} 
		int highest = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (int i=0; i < nums.length; i++) {
			if (nums[i] > highest) {
				second = highest;
				highest = nums[i];
			} 
			else if (nums[i] > second && nums[i] != highest) {
				second = nums[i];
			}
		}
		if (second == Integer.MIN_VALUE) {
			System.out.println("There is no second highest number, only the highest");
			return highest;
		}
		
		return second;
	}

	public static void main(String[] args) {
		int[] nums = {3,4,2,1,6};
		System.out.println("Second highest is: " + secondHighest(nums));
			
	}
		
}
