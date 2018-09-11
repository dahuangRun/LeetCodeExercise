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
			//(1)：如果array[mid] > array[hight],min一定在mid右边
			if (array[mid] > array[hight]) {
				low = mid + 1;
			//(2)：如果array[mid] < array[hight],min是在a[mid]或者在mid的左边
			}else if (array[mid] < array[hight]) {
				hight = mid;
			//(3)：如果array[mid] = array[hight],min不好判断是在左边还是右边，只能一步一步试
			}else {
				hight = hight - 1;
			}
		}
		return array[low];
	}
}
