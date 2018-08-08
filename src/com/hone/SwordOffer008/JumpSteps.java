package com.hone.SwordOffer008;

/**
 * 题目：一只青蛙一次可以跳上1级台阶，也可以跳上2级,它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法
 * 解释：牛客网解释(https://www.nowcoder.com/questionTerminal/22243d016f6b47f2a6928b4313c85387)
 * f(0) = 1;
 * f(1) = 1;
 * f(2) = 2;
 * f(3) = 3;
 * f(4) = 6;
 * f(n) = 2*f(n-1)
 * @author Xia
 *
 */
public class JumpSteps {
	public int JumpFloorII(int target) {
		if (target <= 0) {
			return -1;
		}else if (target == 1) {
			return 1;
		}else {
			return 2 * JumpFloorII(target -1);
		}
	}
}
