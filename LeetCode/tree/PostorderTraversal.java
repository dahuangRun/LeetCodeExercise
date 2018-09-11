package tree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 二叉树的后序遍历
 * 
 * @author Xia
 *
 */

public class PostorderTraversal {
	
	//------------------二叉树的后序遍历递归版本
	ArrayList<Integer> res = new ArrayList<>();
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        
        if(root != null){
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            res.add(root.val);
        }
        return res;
    }
    
    
    //------------------二叉树的后序遍历非递归版本
    public ArrayList<Integer> postorderTraversal2(TreeNode root) {
    	ArrayList<Integer> res2 = new ArrayList<>();
    	Stack<TreeNode> stack = new Stack<>();
    	if (root == null) {
			return res2;
		}
    	stack.push(root);
    	while (!stack.isEmpty()) {
    		TreeNode temp = stack.peek();
    		if (temp.left != null) {
				stack.push(temp.left);
				temp.left = null;			//隔断父节点和左孩子结点之间的联系，防止下次又添加进去
			}else if (temp.right != null) {
				stack.push(temp.right);
				temp.right = null;
			}else {
				res2.add(temp.val);			//如果既没有左孩子又没有右孩子说明该输出了
				stack.pop();
			}
    	}
    	return res2;
    }
    

}
