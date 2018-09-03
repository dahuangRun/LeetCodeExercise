package com.hone.SwordOffer008;

/**
 * 题目：一只青蛙一次可以跳上1级台阶，也可以跳上2级,它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法
 * f(0) = 1;
 * f(1) = 1;
 * f(2) = 2;
 * f(3) = 3;
 * f(4) = 5;
 * f(n) = f(n-1) + f(n-2) 
 * @author Xia
 *
 */
public class JumpSteps2 {
	public int JumpFloor(int target) {
		if (target == 1 || target ==2) {
			return target;
		}
		//思路：当前台阶的跳法总数=当前台阶后退一阶的台阶的跳法总数+当前台阶后退二阶的台阶的跳法总数
		int sum = 0;	
		int jumpBackOne = 2;			// 当前台阶后退一阶的台阶的跳法总数(初始值当前台阶是第3阶)		
		int jumpBackTwo = 1;			// 当前台阶后退一阶的台阶的跳法总数(初始值当前台阶是第3阶)		
			
		for (int i = 3; i <= target; i++) {
			sum = jumpBackOne + jumpBackTwo;
			jumpBackTwo = jumpBackOne;
			jumpBackOne = sum;
		}
		return sum;
	}
}
