package com.hone.SwordOffer005;

import java.util.Stack;

/**
 * 题目：用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * 其实就是考察堆、队列的性质
 * @author Xia
 *
 */
public class StackToQueue {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
	//先将所有的点都压入stack1中
	public void push(int node) {
		stack1.push(node);
	}

	public int pop() {
		if (stack1.isEmpty()||stack2.isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		//只有在stack2为空的时候才将stack1中的元素压入到stack2中，否则会覆盖
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}
}
