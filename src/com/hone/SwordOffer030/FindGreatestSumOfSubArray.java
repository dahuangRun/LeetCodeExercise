package com.hone.SwordOffer030;

/**
 * 求出连续最大子数组的和
 * 思路：只需要处理好 sum > 0 ,sum < 0 的情况。如果sum < 0,则前面的字符串一定不会包含在里面。
 * 可以将前面的sum赋值为0  
 * @author Xia 
 */
public class FindGreatestSumOfSubArray {
	public int FindGreatestSumOfSubArray_method(int[] array) {
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int i = 0;
		while (i < array.length) {
			if (sum >= 0) {
				sum = sum + array[i];
				if (sum > max) {
					max = sum;
				}
				i++;
			}
			if (sum < 0) {
				sum = 0;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		FindGreatestSumOfSubArray f = new FindGreatestSumOfSubArray();
		int[] a = { 6, -3, -2, 7, -15, 1, 2, 2 };
		System.out.println(f.FindGreatestSumOfSubArray_method(a));
	}

}
