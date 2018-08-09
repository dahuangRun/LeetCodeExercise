package com.hone.SwordOffer017;

/**
 * 题目：输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * 
 * @author Xia
 *
 */
public class IsSubTree {
	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
		boolean result = false;
		
		//只有在root1和root2不为空的时候，开始内部判断，否则直接返回默认的false
		if (root1 != null&& root2 != null) {
			
			//如果找到了root2对应的根节点，则直接在内部开始寻找
			if (root1.val == root2.val) {
				//以这个根节点开始判断是否包含是完整的包含其中
				result = doesTree1HasTree2(root1,root2);
			}
			
			//如果不包含，则去root结点的左子树去寻找包含的树
			if (!result) {
				result = HasSubtree(root1.left, root2);
			}
			
			//如果左子树也不包含，则去右子树寻找
			if (!result) {
				result = HasSubtree(root1.right, root2);
			}
		}
		
		//最后返回结果
		return result;
	}

	//判断以root1为根节点的树是否包含以root2为根节点的树
	private boolean doesTree1HasTree2(TreeNode root1, TreeNode root2) {
		//如果root2遍历完了后可以对应上，则直接返回true
		if (root2 == null) {
			return true;
		}
		//如果Tree2还没有遍历完，Tree1却遍历完了。返回false
		if (root1 == null) {
			return false;
		}
		if (root1.val != root2.val) {
			return false;
		}
		
		//如果root1和root2对应上了，则开始寻找其内部是否完全相同(也是就是判断左子树和右子树是否包含)
		return doesTree1HasTree2(root1.left, root2.left)&&doesTree1HasTree2(root1.right, root2.right);
	}
}
