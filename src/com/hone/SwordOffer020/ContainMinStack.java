package com.hone.SwordOffer020;

import java.util.Arrays;
import java.util.Stack;

/**
 * 题目： 自定义包含min函数的栈数据结构。
 * 
 * @author Xia
 *
 */
public class ContainMinStack {

	// 设置栈的大小
	private int size;
	private int[] element; // 用于存储栈中的元素
	private int top; // 栈顶指针
	private int min = Integer.MAX_VALUE;

	Stack<Integer> minStack = new Stack<Integer>();

	// 构造函数对默认的栈初始化
	public ContainMinStack(int size) {
		this.size = size;
		this.element = new int[size];
		top = 0;
	}

	// 将元素压入到minStack中
	public void push(int node) {
		ensureCapacity(size + 1);
		element[top++] = node;
		if (node <= min) {
			minStack.push(node);
			min = minStack.peek();
		} else {
			minStack.push(min);
		}
	}

	// 将元素从minStack中弹出
	public void pop() {
		Integer topNum = top();
		if (topNum != null) {
			element[top - 1] = (Integer) null;
		}
		top--;
		minStack.pop();
		min = minStack.peek();
	}

	public int top() {
		if (top >= 0) {
			return element[top];
		}
		return (Integer) null;

	}

	public int min() {
		return min;
	}

	// 对数组长度进行扩容
	public void ensureCapacity(int size) {
		int len = element.length;
		if (size > len) {
			int newLen = (len * 3) / 2 + 1;
			element = Arrays.copyOf(element, newLen);
		}
	}

}
