package com.hone.sort;

/**
 * 第一种方法：插入排序
 * 思想:类似于打扑克牌的插入方式，首先在插入之前之前的元素都是已经排好序的，当此刻插入a时，将大于a的数向右边移动。
 * 然后将temp插入到它本该属的位置。
 * 
 * @author Xia
 *
 */
public class Pratice0001InsertSort {
	public void insertMethod(int[] a) {
		int i,j,temp;
		for (i = 1; i < a.length; i++) {
			temp = a[i];
			for (j = i; j > 0&&temp < a[j-1]; j--) {
				a[j] = a[j-1];
			}
			a[j] = temp;
		}
	}
	
	
}
