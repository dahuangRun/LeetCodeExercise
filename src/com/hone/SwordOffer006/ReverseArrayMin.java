package com.hone.SwordOffer006;

/**
 * 题目：输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 第一种方法：遍历整个数组，如果a[i+1]<a[i],则a[i+1]一定是整个旋转数组中的最小值。
 * @author Xia
 *
 */
public class ReverseArrayMin {
	public int minNumberInRotateArray(int[] array) {
		if (array == null) {
			return 0;
		}
		int aim = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i + 1] < array[i]) {
				aim = array[i + 1];
				break;
			}
		}

		return aim;
	}
	public static void main(String[] args) {
		int[] a = {2,2,3,1,2};
		int res = new ReverseArrayMin().minNumberInRotateArray(a);
		System.out.println(res);
		
	}
}
