package com.hone.SwordOffer030;

/**
 * 求出连续最大子数组的和
 * 思路：也是线性时间的解法,但是这个是第一个方法的精简版本。
 * 不过思路一样，只不过这次将区间只是划分为sum<0,sum>max
 * @author Xia 
 */
public class FindGreatestSumOfSubArray2 {
	public int FindGreatestSumOfSubArray_method(int[] array) {
		int sum = 0;
		int max = Integer.MIN_VALUE;
		for (int j = 0; j < array.length; j++) {
			sum += array[j];
			if (sum > max) {
				max = sum;
			}
			if (sum < 0 ) {
				sum = 0;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		FindGreatestSumOfSubArray2 f = new FindGreatestSumOfSubArray2();
		int[] a = { 6, -3, -2, 7, -15, 1, 2, 2 };
		System.out.println(f.FindGreatestSumOfSubArray_method(a));
	}

}
