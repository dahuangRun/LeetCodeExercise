package com.hone.SwordOffer018;

import java.util.Stack;

/**
 * 题目：操作给定的二叉树，将其变换为源二叉树的镜像。
 * 思路：利用栈使用非递归的二叉树镜像.
 * @author Xia
 *
 */
public class BinaryTreeMirror2 {
	public void Mirror(TreeNode root) {
		if(root == null )
			return;
		Stack<TreeNode> s = new Stack<>();
		s.push(root);
		while (!s.isEmpty()) {
			TreeNode tree = s.peek();
			s.pop();
			if(tree.left != null || tree.right != null){
				TreeNode temp = tree.left;
				tree.left = tree.right;
				tree.right = temp;
			}
			if (tree.left != null)
				s.push(tree.left);
			if(tree.right != null)
				s.push(tree.right);
		}
	}
}
