package com.hone.SwordOffer041;

import java.util.ArrayList;

/**
 * 题目：输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 * 思路：
 * @author Xia
 *
 */
public class FindContinuousSeqSumS {
	
	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer> > result = new ArrayList<ArrayList<Integer> >();		//最后的返回结果
		//其中i表示总数
		for (int i = (int)Math.sqrt(2 * sum); i >= 2; i--) {								
			if ( (i & 1) ==1 && sum % i == 0 || (sum % i )* 2 == i) {
				ArrayList<Integer> list = new ArrayList<Integer>();
				for (int j = 0,k=(sum/i) - (i - 1)/2; j < i; j++,k++) {
					list.add(k);
				}
				result.add(list);
			}
		}
		return result;
    }
}
