package com.hone.SwordOffer038;

/**
 * 题目：输入一棵二叉树，求该树的深度
 * 思路1：递归遍历树的深度,递归的出口点是遍历到树的叶子节点。
 * @author Xia
 *
 */
public class DepthBinaryTree {
	public int TreeDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = TreeDepth(root.left);
		int right = TreeDepth(root.right);
		return Math.max(left, right)+1;
    }
	
	public static void main(String[] args) {
		System.out.println(new DepthBinaryTree().TreeDepth(new TreeNode(2)));
	}
}


