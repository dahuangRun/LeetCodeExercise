package com.hone.algor004;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 两个排序数组的中位数 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2 。 请找出这两个有序数组的中位数。
 * 要求算法的时间复杂度为O(log (m+n))
 * 思路：主要借助java中的collections.sort()进行排序
 * @author Xia
 */
public class MedianNumber {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double result = 0.0;
		List<Integer> twoArray = new ArrayList<Integer>();
		for (int i = 0; i < nums1.length; i++) {
			twoArray.add(nums1[i]);
		}
		for (int i = 0; i < nums2.length; i++) {
			twoArray.add(nums2[i]);
		}
		Collections.sort(twoArray);
		if (twoArray.size() % 2 == 0) {
			result = (twoArray.get(twoArray.size()/ 2) + twoArray.get((twoArray.size() - 1) / 2))/2.0;
		} else {
			result = twoArray.get((twoArray.size() - 1) / 2);
		}
		return result;
	}

	public static void main(String[] args) {
		int [] nums1 = {1, 3};
		int [] nums2 =  {4};
		double result = findMedianSortedArrays(nums1, nums2);
		System.out.println(result);
		
	}

}
