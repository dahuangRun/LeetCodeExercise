package com.hone.sort;

/**
 * 测试冒泡排序
 * 思路：首先对相邻的两个数进行比较，第一轮可以将数组中最大的树排到数组的末端。
 * 
 * @author Xia
 *
 */
public class Pratice0002BubbleSort {
	public void sort(int[] a){
		int temp = 0;
		for (int i = a.length-1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (a[j+1] < a[j]) {
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}
