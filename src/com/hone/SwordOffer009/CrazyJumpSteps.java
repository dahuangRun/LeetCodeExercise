package com.hone.SwordOffer009;

/**
 * 题目：一只青蛙一次可以跳上1级台阶，也可以跳上2级,也可以跳上n个台阶，求该青蛙跳上一个n级的台阶总共有多少种跳法

 * 
 * @author Xia
 *
 */
public class CrazyJumpSteps {
	public int JumpFloor(int target) {
		if (target <= 0) {
			return -1;
		}else if (target == 1) {
			return 1;
		}else if (target == 2) {
			return 2;
		}else {
			return 2 * JumpFloor(target - 1);
		}
		
}
}
