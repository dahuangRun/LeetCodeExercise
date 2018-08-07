package com.hone.SwordOffer005;

import java.util.Stack;

/**
 * 题目：用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * @author Xia
 *
 */
public class StackToQueue {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node) {
		stack1.push(node);
	}

	public int pop() {
		while(stack1.isEmpty()){
			stack2.push(stack1.pop());
		}
		return stack2.pop();
	}
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		for (int i = 0; i < a.length; i++) {
			new StackToQueue().push(a[i]);
		}
		System.out.println(new StackToQueue().pop());
	}
}
