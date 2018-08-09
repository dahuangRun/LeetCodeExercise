package com.hone.sort;

public class Test {
	public static void main(String[] args) {
		int [] a = {4,3,2,1,5,6,8,7};
//		new Pratice0001InsertSort().insertMethod(a);
		new Pratice0002BubbleSort().sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
