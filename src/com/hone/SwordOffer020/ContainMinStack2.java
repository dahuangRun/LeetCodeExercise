package com.hone.SwordOffer020;

import java.util.Stack;

/**
 * 题目： 自定义包含min函数的栈数据结构。
 * 思路：利用两个stack，一个stack用于存储正常的栈数据，另一个minStack用于存储顶最小的数
 * @author Xia
 *
 */
public class ContainMinStack2 {
	
	Stack<Integer> helpStack = new Stack<>();
	Stack<Integer> minStack = new Stack<>();
	
	
	  public void push(int node) {
	        helpStack.push(node);
	        if (minStack.isEmpty() || node < minStack.peek()) {
				minStack.push(node);
			}else {
				minStack.push(minStack.peek());
			}
	    }
	    
	    public void pop() {
	        helpStack.pop();
	        minStack.pop();
	    }
	    
	    public int top() {
	        return helpStack.peek();
	    }
	    
	    public int min() {
	        return minStack.peek();
	    }
	
}
