package com.hone.SwordOffer026;

import tree.TreeNode;

/**
 * 题目：将二叉搜索树转化为排序好的双向链表
 * 思路：类似于执行中序遍历。
 * @author Xia
 *
 */
public class BSTtoDoubleList {
	TreeNode head = null;
    TreeNode realHead = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        ConvertHelp(pRootOfTree);
        return realHead;
    }
    public void ConvertHelp(TreeNode root){
        if(root == null)
            return;
        ConvertHelp(root.left);
        if(head == null){
            head = realHead = root;
        }else{
            head.right = root;
            root.left = head;
            head = root;
        }
        ConvertHelp(root.right);
    }
}
