package com.hone.SwordOffer021;

import java.util.Stack;

/**
 * 题目：根据压栈的顺序判断出栈的顺序是否正确。 
 * 
 * 思路：模拟入栈的顺序，及出栈的顺序。如果最后出栈顺序可以吻合的话，则辅助栈空间最后为空。如果不吻合，则最后栈不为空。
 * @author Xia
 */
public class IsPopOrderByPush {
	public boolean IsPopOrder(int[] pushA, int[] popA) {

		if(pushA.length == 0 || popA.length == 0)
            return false;

		// 构建一个辅助的栈
		Stack<Integer> help = new Stack<Integer>();
		//用于标识弹出序列的位置
		int peekStep = 0;
		
		for (int i = 0; i < pushA.length; i++) {
			help.push(pushA[i]);
			//如果栈不为空，且栈顶元素等于弹出序列,将辅助栈空间弹出及弹出序列后移。
			while (!help.empty() && help.peek() == popA[peekStep]) {
				help.pop();
				peekStep++;
			}
		}
		return help.empty();
	}
}
