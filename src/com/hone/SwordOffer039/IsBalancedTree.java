package com.hone.SwordOffer039;

/**
 * 题目：判断二叉树是否是平衡二叉树
 * 思路1：利用递归算法，每次求取 结点高度，判断是否是左右子树高度差。自树顶向下依次遍历。
 * 缺点：时间慢。复杂度较高。
 * @author Xia
 *
 */
public class IsBalancedTree {
	public boolean IsBalanced_Solution(TreeNode root) {
		if (root == null) {
			return true;
		}
		int left = depthOfTree(root.left);
		int right = depthOfTree(root.right);
		while ( Math.abs((left-right))<=1&&IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right)) {
			return true;
		}
		return false;
	}

	private int depthOfTree(TreeNode node) {
		if (node == null) {
			return 0;
		}
		int left = depthOfTree(node.left);
		int right = depthOfTree(node.right);
		return Math.max(left, right)+1;
	}
	
	
}
