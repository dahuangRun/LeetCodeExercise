package com.hone.SwordOffer037;

/**
 * 统计一个数字在排序数组中出现的次数。
 * 思路1：简单粗暴的解法。
 * @author Xia
 *
 */
public class GetNumberTimes {
	public int GetNumberOfK(int[] array, int k) {
		int times = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == k) {
				times++;
			}
		}
		return times;
	}
}
