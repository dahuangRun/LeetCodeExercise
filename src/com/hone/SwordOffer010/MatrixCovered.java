package com.hone.SwordOffer010;

/**
 * 题目：我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。 
 * 		请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * 		根据规律其实也是斐波那切数列
 * @author Xia
 *
 */
public class MatrixCovered {
	public int RectCover(int target) {
		int first = 1;
		int second = 2;
		int third = 0;
		if (target <= 2) {
			return target;
		}
		for (int i = 3; i <= target; i++) {
			third = first + second;
			first = second;
			second = third;
		}
		return third;
	}

}
