package com.hone.sort;

public class Test {
	public static void main(String[] args) {
		int [] a = {4,3,2,1,5,6,8,7};
//		new Pratice0001InsertSort().insertMethod(a);
//		new Pratice0002BubbleSort().sort(a);
//		new Pratice0003SelectSort().selectSort(a);
//		new Pratice0004QuickSort().quickSort(a, 0, a.length-1);
		new Pratice0005MergeSort().mergeSort(a, 0, a.length-1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
