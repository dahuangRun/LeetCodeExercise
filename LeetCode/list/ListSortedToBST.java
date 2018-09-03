package list;

/**
 * ��Ŀ����������ת������������
 * ˼·��ÿ�ζ���Ѱ����λ��㣬��Ϊ�����������Ӷ������ĸ��ڵ㡣
 * 		�㷨�ľ���֮�������������      ��λ�ڵ�    (ͨ������ָ��)һ��ָ����һ����һ��ָ�������������϶������ҳ�mid��
 * 		Ȼ���ٷֱ��mid�����߷ֱ�ݹ顣
 * @author Xia
 *
 */
public class ListSortedToBST {
public TreeNode sortedListToBST(ListNode head) {
        
        return sortedChild(head,null);
        
    }
    
    TreeNode sortedChild(ListNode head,ListNode tail){
        if(head == tail){
            return null;
        }
        
        if(head.next == tail){
            //���ֻʣ��һ��Ԫ��
            TreeNode root = new TreeNode(head.val);
            return root;
        }
        //�������ڵ���ͳ��mid
        ListNode mid = head;
        ListNode cur = head;
        
        //֮��������ָ�룬һ��ָ��ÿ����һ����һ��ָ��ÿ����������������������Ǹ�������β������mid��պõ����յ��λ��
        while(cur != tail && cur.next != tail){
            mid = mid.next;
            cur = cur.next.next;
        }
        
        //�ݹ���ģ�����mid��������зָ�Ϊ�����֣�С��mid�ʹ���mid�Ĳ��֡�
        TreeNode root = new TreeNode(mid.val);
        root.left = sortedChild(head,mid);
        root.right = sortedChild(mid.next,tail);
        return root;
        
    }
}

