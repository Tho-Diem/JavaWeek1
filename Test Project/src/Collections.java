import java.util.Arrays;

public class Collections {
	public static void main(String[] args) {
		exercise6();
	}

	public static void exercise6() {
		int[] nums = new int[100];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;

		}
		System.out.println(Arrays.toString(nums));
		for (int i : nums) {
			System.out.println(i + 2);
		}
	}

	public static void exercise5() {
		int[] nums = new int[999];
		for (int i = 100; i < nums.length; i++) {
			nums[i] = i + 1;
		}
	}
}
