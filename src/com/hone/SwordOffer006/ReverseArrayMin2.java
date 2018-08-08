package com.hone.SwordOffer006;

/**
 * 可以采用二分查找方法
 * @author Xia
 *
 */
public class ReverseArrayMin2 {
	public int minNumberInRotateArray(int[] array) {
		int low = 0;
		int hight = array.length-1;
		while (low < hight) {
			int mid = (low+hight)/2;
			if (array[mid] > array[hight]) {
				low = mid + 1;
			}else if (array[mid] < array[hight]) {
				hight = mid;
			}else {
				hight = hight - 1;
			}
		}
		return array[low];
	}
}
