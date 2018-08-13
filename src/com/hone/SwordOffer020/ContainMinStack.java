package com.hone.SwordOffer020;

import java.util.Arrays;
import java.util.Stack;

/**
 * 题目： 自定义包含min函数的栈数据结构。 
 * 方法1：利用一个Stack，完全模拟Stack的操作过程。
 * 
 * @author Xia
 *
 */
public class ContainMinStack {

	// 设置栈的大小
	private int size;
	private Integer[] element = new Integer[10]; // 用于存储栈中的元素
	private int min = Integer.MAX_VALUE;

	Stack<Integer> minStack = new Stack<Integer>();

	// 将元素压入到minStack中
	public void push(int node) {
		ensureCapacity(size + 1);
		element[size++] = node;
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
			element[size - 1] = (Integer) null;
		}
		size--;
		minStack.pop();
		min = minStack.peek();
	}

	public int top() {
		if (!empty()) {
			if (size - 1 >= 0) {
				return element[size - 1];
			}
		}
		return (Integer) null;
	}

	public boolean empty() {
		return size == 0;
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
