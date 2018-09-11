package tree;

import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

public class InorderTraversal {
	
	//--------------------1 采用递归的方法
	private List<Integer> result;

	public List<Integer> inorderTraversal(TreeNode root) {
		result = new ArrayList<>();
		inHelper(root);
		return result;
	}

	public void inHelper(TreeNode root) {
		if (root != null) {
			inHelper(root.left);
			result.add(root.val);
			inHelper(root.right);
		}

	}
	
	//--------------------2 采用递归的方法2
	private List<Integer> result2 = new ArrayList<>() ;
    public List<Integer> inorderTraversal2(TreeNode root) {
        if(root != null){
            inorderTraversal(root.left);
            result2.add(root.val);
            inorderTraversal(root.right);
        }
        return result2;
    }
    
    
    //--------------------3 采用非递归的方法2
    /**
     * 1 先将所有的左子树结点都压入堆栈，直到没有左子树
     * 2 弹出栈顶的元素，并且访问这个结点的右子树
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal3(TreeNode root) {
    	List<Integer> res3 = new ArrayList<>() ;
    	Stack<TreeNode> stack = new Stack<>();
    	TreeNode node = root;
    	while (node != null || !stack.isEmpty()) {
			while (node != null) {
				stack.push(node);
				node = node.left;
			}
			
			if (!stack.isEmpty()) {
				node = stack.pop();
				res3.add(node.val);
				node = node.right;
			}
		}
    	return res3;
    }
    
    
    
}
