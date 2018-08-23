package com.hone.SwordOffer060;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 题目：从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 * 思路：实际上就是层序遍历。
 * @author Xia
 *
 */
public class PrintManyLines {
	public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer> > lists = new ArrayList<ArrayList<Integer>>();
		if (pRoot == null) {
			return lists;
		}
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		
		queue.add(pRoot);
		
		while (!queue.isEmpty()) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			int i = 0;
			int len = queue.size();
			while (i++ < len) {
				TreeNode temp = queue.poll();
				list.add(temp.val);
				if (temp.left != null)
					queue.add(temp.left);
				if (temp.right != null)
					queue.add(temp.right);
			}
			if (!list.isEmpty()) {
				lists.add(list);
			}
		}
		return lists;
    }
}
