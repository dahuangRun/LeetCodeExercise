package com.hone.SwordOffer037;

import javax.xml.stream.events.StartDocument;

/**
 * 统计一个数字在排序数组中出现的次数。
 * 思路1：因为数组是有序的，可以采用二分法。
 * 		 找出第一次等于a的位置
 * 		找出最后一次等于a的位置，然后做差值即可。
 * @author Xia
 *
 */
public class GetNumberTimes2 {
	public int GetNumberOfK(int[] array, int k) {
		int n = array.length;
		if (n == 0) {
			return 0;
		}
		int firstK = getFirstK(array,k,0,n-1);
		int lastK = getLasttK(array,k,0,n-1);
		if (firstK != -1 && lastK != -1) {
			return lastK - firstK + 1;
		}
		return 0;
	}

	//获得值为k的第一个位置
	private int getFirstK(int[] array, int k, int i, int j) {
		if (i >= j) {
			return -1;
		}
		int mid = (i + j)/2;
		if (array[mid] > k) {
			return getFirstK(array, k, i, mid-1);
		}else if (array[mid] < k) {
			return getFirstK(array, k, mid+1, j);
		}else if (mid -1 >= 0&&array[mid -1] == k) {		//如果不是第一词出现则还需要递归。
			return getFirstK(array, k, i, mid-1);
		}else{
			return mid;
		}
	}
	
	//获得值为k的最后一个位置
	//利用二分法的循环写法
	private int getLasttK(int[] array, int k, int i, int j) {
		int mid = (i+j)/2;
		while (i <= j) {
			if (array[mid] > k) {
				j = mid - 1;
			}else if (array[mid] < k) {
				i = mid + 1;
			}else if (mid+1<array.length && array[mid+1] == k) {		//这个if用于判断是否是最后一次出现
				i = mid + 1;
			}else {
				return mid;
			}
			mid = (i+j)/2;
		}
		return -1;
	}
}
