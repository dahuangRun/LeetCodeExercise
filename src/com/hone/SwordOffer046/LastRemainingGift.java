package com.hone.SwordOffer046;

/**
 * 题目：
 * 思路：用数据模拟换，用好两个变量i,step.
 * @author Xia
 *
 */
public class LastRemainingGift {
	public static int LastRemaining_Solution(int n, int m) {
		int[] childrens = new int[n];		//
		int i = -1;//设置每一步的下标值
		int step = 0;	//计算走了几步
		int count = n;	//统计剩余多少人
		while (count > 0) {
			i++;				//向前走了一步
			if (i >= n)			//如果走到数组的尾部，则开始从头开始 
				i = 0;
			if (childrens[i] == 1)			//如果这个孩子已经出局，则跳过本次循环
				continue;
			step++;							//往前走了一步
			if (step == m) {
				childrens[i] = 1;
				count--;
				step = 0;
			}
		}
		return i;							//返回最后一个出局的小孩儿
        
    }
}
