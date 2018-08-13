package com.hone.sort;

/**
 * 快速排序
 * 思路：采用分而治之的方法。每次取一个数作为中心点。
 * 每次需要partition：将小于中心点的值让在左边，大于中心点的值放在右边。
 * 
 * 每经过一个循环，都将中心点放在该放的位置。
 * 时间复杂度：O(nLogn)
 * @author Xia
 *
 */
public class Pratice0004QuickSort {
	
	public void quickSort(int[] a ,int low ,int hight) {
		if (low < hight) {
			int pi = partition(a,low,hight);
			quickSort(a, low, pi - 1);
			quickSort(a, pi+1, hight);
		}
	}

	//每次分治都将标兵放在了正确的位置
	private int partition(int[] a, int low, int hight) {
		int pivot = a[hight];
		int i = low - 1 ; 	//Index of smaller element
		int j ;
		for (j = low; j < hight; j++) {
			if (a[j] <= pivot) {
				i++;		//
				if (i != j) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		int temp = a[i+1];
        a[i+1] = a[hight];
        a[hight] = temp;
		
		return i+1;
	}
}
