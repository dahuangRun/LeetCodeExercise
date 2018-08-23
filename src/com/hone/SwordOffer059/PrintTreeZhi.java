package com.hone.SwordOffer059;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 题目：按照之字形打印二叉树。
 * 		即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印。
 * 思路：将二叉树按照奇偶来打印。
 * @author Xia
 *
 */
public class PrintTreeZhi {
	public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer> > lists = new ArrayList<ArrayList<Integer>>();
		
		//将根节点定位第一层
		int flag = 1;
		
		//s1用来存储奇数层的结点
		Stack<TreeNode> s1 = new Stack<TreeNode>();
		//s2用来存储偶数层的结点
		Stack<TreeNode> s2 = new Stack<TreeNode>();
		
		s1.push(pRoot);
		
		while (!s1.empty() || !s2.empty()) {
			//处理奇数层
			if (flag % 2 != 0)  {
				ArrayList<Integer> temp = new ArrayList<Integer>();
				while (!s1.empty()) {
					TreeNode node = s1.pop();
					if (node != null) {
						temp.add(node.val);
						s2.push(node.left);
						s2.push(node.right);
					}
				}
				if (!temp.isEmpty()) {
					lists.add(temp);
					flag++;
				}
			}else {
				ArrayList<Integer> temp = new ArrayList<Integer>();
				while (!s2.empty()) {
					TreeNode node = s2.pop();
					if (node != null) {
						temp.add(node.val);
						s1.push(node.right);
						s1.push(node.left);
					}
				}
				if (!temp.isEmpty()) {
					lists.add(temp);
					flag++;
				}
			}
		}
		return lists;

    }
}
