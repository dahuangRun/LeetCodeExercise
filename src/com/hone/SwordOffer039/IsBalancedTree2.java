package com.hone.SwordOffer039;

/**
 * 题目：判断二叉树是否是平衡二叉树
 * 思路2：在判断上层结点的时候，会多次重复遍历下层结点，增加了不必要的开销。
 * 		  如果改为从下往上遍历，如果子树是平衡二叉树，则返回子树的高度；如果发现子树不是平衡二叉树，
 * 		  则直接停止遍历，这样至多只对每个结点访问一次。
 * @author Xia
 *
 */
public class IsBalancedTree2 {
	public boolean IsBalanced_Solution(TreeNode root) {
		return getDepth(root) != -1;
	}
	
	//获取子树的高度，但是实际上的返回值并不是树的高度。
	private int getDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = getDepth(root.left);		//获得左子树的高度
		if (left == -1) {
			return -1;
		}
		int right = getDepth(root.right);	//获得右子树的高度
		if (right == -1) {
			return -1;
		}
		//如果子树不是平衡二叉树，则直接返回-1,否则返回子树的高度。
		return Math.abs(left-right) > 1 ? -1:1+Math.max(left, right);
	}
}
