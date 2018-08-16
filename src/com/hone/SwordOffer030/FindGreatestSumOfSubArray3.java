package com.hone.SwordOffer030;

/**
 * 求出连续最大子数组的和
 * 第二种方法：肯定是暴力解法。内部做两层循环，遍历所有的数对于各个数都分别求出最大子数组的和。
 * 			但是这种方法肯定会加大复杂性。
 * @author Xia 
 */
public class FindGreatestSumOfSubArray3 {
	public int FindGreatestSumOfSubArray_method(int[] array) {
		int i,j;
		int maxSub = Integer.MIN_VALUE;
		for( i = 0; i <array.length ; i++){
			int curSub = 0;
			for( j = i ; j < array.length ; j++){
				curSub+= array[j];
				if (maxSub < curSub) 
					maxSub = curSub;
			}
		}
		return maxSub;
	}

	public static void main(String[] args) {
		FindGreatestSumOfSubArray3 f = new FindGreatestSumOfSubArray3();
		int[] a = { 6, -3, -2, 7, -15, 1, 2, 2 };
		System.out.println(f.FindGreatestSumOfSubArray_method(a));
	}

}
