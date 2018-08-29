package com.hone.SwordOffer062;

import java.util.Stack;

/**
 * 题目：给定一棵二叉搜索树，请找出其中的第k小的结点。 
 * 思路：利用非递归的中序遍历
 * 
 * @author Xia
 */
public class FindKthNode2 {
	public TreeNode KthNode(TreeNode pRoot, int k) {
		if (pRoot == null || k == 0) {
			return null;
		}
		TreeNode node = pRoot;
		int index = 0;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while (node != null || !stack.empty()) {
			while (node != null) {
				stack.push(node);
				node = node.left;
			}
			node = stack.pop();
			index++;
			if (index == k)
				return node;
			node = node.right;
		}
		return null;
	}
}
