package com.hone.SwordOffer030;

/**
 * 求出连续最大子数组的和
 * 第三种方法：采用递归调用的方法。
 * 思想：基本思想采用分而治之的想法。时间复杂度为Nlogn
 * 可以将一个数组分为两部分，左边子数组和右边子数组
 * 那么最大的子数组只可能有三种情况
 * 1：最大子数组位于左边（可以继续采用递归）
 * 2：最大子数组位于右边（可以继续采用递归）
 * 3：最大子数组跨越左右两边
 * @author Xia 
 */
public class FindGreatestSumOfSubArray4 {
	public int FindGreatestSumOfSubArray_method(int[] a,int left ,int right) {
		int MaxLeftSum , MaxRightSum ;		//左右边和最大值
		int MaxLeftBorderSum, MaxRightBorderSum ;  //含中间边界的最大左边或者右边的子序列和
		int LeftWithBoderNowSum,RightWithBorderNowSum;	//含中间边界的左右部分的当前的最大子数组的和
		int i , center,j;
		int max_left = -100;
		int max_right = -100;
		
		//递归的边界条件只剩下了一个元素
		if (left == right) 
			if(a[left]>0)  
		        return a[left];  
		    else  
		        return 0; 
		
		//首先求含中间边界的左右部分的最大值
		//实际上是左数组的最大后缀和右数组的最大前缀的和
		center = (left+right)/2;
		MaxLeftBorderSum = Integer.MIN_VALUE;      //最终的最大后缀
		LeftWithBoderNowSum = 0;
		for(i = center; i>= left; i--){
			LeftWithBoderNowSum += a[i];
			if(LeftWithBoderNowSum > MaxLeftBorderSum){
				MaxLeftBorderSum = LeftWithBoderNowSum;
				max_left = i;
			}
		}
		
		MaxRightBorderSum = Integer.MIN_VALUE;
		RightWithBorderNowSum = 0;
		//右边
		for ( j = center+1; j <= right; j++) {
			RightWithBorderNowSum +=a[j];
			if (RightWithBorderNowSum > MaxRightBorderSum) {
				MaxRightBorderSum = RightWithBorderNowSum ;
				max_right = j;
			}
		}
		
		//求最大子数组在左边的情况(一直递归调用上面的maxSubArray2() )
		MaxLeftSum = FindGreatestSumOfSubArray_method(a, left, center);
		MaxRightSum = FindGreatestSumOfSubArray_method(a, center+1, right);
		
		//再返回三者的最大值
		return Max3(MaxLeftSum, MaxRightSum, MaxRightBorderSum+MaxLeftBorderSum);
	}
	
	
	public static  int Max3(int a, int b, int c){
		int max = a;
		if (b > max) 
			max = b;
		if (c > max) 
			max = c;
		return max ;
	}


}
