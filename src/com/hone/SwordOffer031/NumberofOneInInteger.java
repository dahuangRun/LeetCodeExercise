package com.hone.SwordOffer031;
/**
 * 题目：求出任意非负整数区间中1出现的次数。比如[1,13] 1,10,11,12,13  总共出现6次
 * 思路：将每个数字都作为字符存储到StringBuffer中，然后开始遍历String，统计次数。
 * @author Xia
 *
 */
public class NumberofOneInInteger {
	public int NumberOf1Between1AndN_Solution(int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			sb.append(i);
		}
		String st = sb.toString();
		int times = 0;
		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i)=='1') {
				times++;
			}
			
		}
		return times;
	    
    }
	public static void main(String[] args) {
		int n = 13;
		System.out.println(new NumberofOneInInteger().NumberOf1Between1AndN_Solution(n));
	}
}
