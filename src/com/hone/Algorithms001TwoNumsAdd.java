package com.hone;

/**
 * 1 两数之和 https://leetcode-cn.com/problems/two-sum/description/
 * 思路：利用一个二层的for循环
 * @author Xia
 *
 */
public class Algorithms001TwoNumsAdd {

	public static int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		for (int i = 0; i < nums.length-1;i++) {
			for (int j = nums.length - 1; j > 0;j--) {
				if (nums[i] + nums[j] == target) {
					res[0] = i;
					res[1] = j;
					return res;
				} 
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15,8};
		int target = 9;
		int[] res = new int[2];
		res = Algorithms001TwoNumsAdd.twoSum(nums, target);
		for (int i : res) {
			System.out.print(i+" ");
		}
	}

}
