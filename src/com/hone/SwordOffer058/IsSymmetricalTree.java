package com.hone.SwordOffer058;

/**
 * 题目：判断一棵二叉树是否是对称二叉树
 * 思路：利用递归的思路。  暂时只是想到利用前序和后序遍历的方式。
 * 		依次判断：首先根节点以及其左右子树，左子树的左子树和右子树的右子树相同。
 * 				左子树的右子树和右子树的左子树相同即可，采用递归
 * @author Xia
 *
 */
public class IsSymmetricalTree {
	public boolean isSymmetrical(TreeNode pRoot){
        if (pRoot == null) {
			return true;
		}
        return comRoot(pRoot.left,pRoot.right);
    }

	private boolean comRoot(TreeNode left, TreeNode right) {
		
		if(left == null && right == null){
            return true;
        }
		if (left == null) {
			return false;
		}
		if (right == null) {
			return false;
		}
		if (left.val != right.val) {
			return false;
		}
		//然后递归遍历，左子树的右结点，右子树的左结点；左子树的左结点，右子树的右子树.
		return comRoot(left.right, right.left) && comRoot(left.left, right.right);
	}
}
