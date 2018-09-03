package list;

/**
 * 題目：给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * 思路：定义两个结点，一个p，一个q，其实就是类似于p先走n步，然后在开始走q，直到p到达尾部为止。
 * @author Xia
 *
 */
public class RemoveNthFromEndMethod {
	 public ListNode removeNthFromEnd(ListNode head, int n) {
		 
	        ListNode temp = new ListNode(0);
	        temp.next = head;
	        
	        ListNode p = temp;
	        ListNode q = temp;
	        int i = 0;
	        for(; p != null ;i++){
	            if(i > n){
	                q = q.next;
	            }
	            p = p.next;
	        }   
	        
	        //删除找到的结点
	        q.next = q.next.next;
	        
	        return temp.next;
	        
	    }
}
