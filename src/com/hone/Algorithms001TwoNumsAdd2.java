package com.hone;

import java.util.HashMap;
import java.util.Map;

/**
 * 1 两数之和 https://leetcode-cn.com/problems/two-sum/description/
 * 思路：可以利用哈希表进行映射
 * 时间复杂度= O(n)
 * @author Xia
 *
 */
public class Algorithms001TwoNumsAdd2 {

	public static int[] twoSum(int[] nums, int target) {
		//利用一个hashMap()来存储数据,注意这里面是用Value→Key    Key→Value
		//因为在map中只有按照key来获取value的值，map.getKey()
		Map<Integer, Integer> numsMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			numsMap.put(nums[i], i);
		}
		int[] res = new int[2];
		for (int i = 0; i < nums.length;i++) {
			int content = target - nums[i];
			
			if (numsMap.containsKey(content)&&numsMap.get(content) != i) {
				res[0] = i;
				res[1] = numsMap.get(content);
				return res;
			}
			
			
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15,8};
		int target = 9;
		int[] res = new int[2];
		res = Algorithms001TwoNumsAdd2.twoSum(nums, target);
		for (int i : res) {
			System.out.print(i+" ");
		}
	}

}
