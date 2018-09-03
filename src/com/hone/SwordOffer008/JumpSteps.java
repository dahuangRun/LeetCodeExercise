package com.hone.SwordOffer008;

/**
 * 题目：一只青蛙一次可以跳上1级台阶，也可以跳上2级,求该青蛙跳上一个n级的台阶总共有多少种跳法
 * f(0) = 1;
 * f(1) = 1;
 * f(2) = 2;
 * f(3) = 3;
 * f(4) = 5;
 * f(n) = f(n-1) + f(n-2) 
 * @author Xia
 *
 */
public class JumpSteps {
	public int JumpFloor(int target) {
		if (target <= 0) {
			return -1;
		}else if (target <= 2) {
			return target;
		}else {
			return  JumpFloor(target-1) + JumpFloor(target-2);
		}
	}
}
