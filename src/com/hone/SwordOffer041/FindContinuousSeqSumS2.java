package com.hone.SwordOffer041;

import java.util.ArrayList;

/**
 * 题目：输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 * 思路：利用双指针来解决
 * @author Xia
 */
public class FindContinuousSeqSumS2 {
	
	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer> > res = new ArrayList<ArrayList<Integer> >();
		int low = 1;
		int hight = 2;
		while(low < hight){
			//计算综合(1+n)*n/2
			int cur = (low + hight)*(hight - low + 1)/2;
			if(cur == sum ){
				ArrayList<Integer> arr = new ArrayList<Integer>();
				for(int i = low ; i <= hight;i++){
					arr.add(i);
				}
				res.add(arr);
				low++;
			//如果当前窗口小于sum，则将右边界向右移动一位
			}else if(cur < sum){
				hight++;
			//如果当前窗口大于sum，则将做窗口向右移动一位
			}else if(cur > sum){
				low++;
			}
		}
		return res;
    }
}
