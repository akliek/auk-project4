package src.part1;

import java.util.Arrays;

/**
 * Task 1.5 nested loop.
 */
public class NestedLoop {
	public static void main(String[] args) {
		int     tmp;
		int[]   nums = {34, 1, 3, -5, 45, 9, 0, 12, -40, 20};

		System.out.println("Original array: " + Arrays.toString(nums));
		// Sort arrays of numbers using bubble sort.
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
				}
			}
		}
		System.out.println("Sorted array: " + Arrays.toString(nums));
	}
}
