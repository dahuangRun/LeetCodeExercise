package com.hone.sort;

/**
 * 从待排序的数据元素中选取最小的数据元素并将它和元素数据中的第一个元素相交换，
 * 然后从除了第一个元素的其他的数据集合中选择最小数据元素并将它与第二个元素相交换位置，
 * 直到元素集合中剩下最后一个元素为止。
 * 
 * 比冒泡排序优秀的地方在于：最多交换n次。
 * @author Xia
 *
 */
public class Pratice0003SelectSort {

	public void selectSort(int[] a){
		int temp = 0;
		//从0开始逐一的移动到边界处
		for (int i = 0; i < a.length-1; i++) {
			int min = i;
			for (int j = i+1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			if (min != i) {
				temp = a[min];
				a[min] = a[i];
				a[i] = temp;
			}
		}
	}
}
