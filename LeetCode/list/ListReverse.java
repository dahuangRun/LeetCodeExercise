package list;

/**
 * 题目：反转一个单链表。
 * 
 * @author Xia
 *
 */
public class ListReverse {
	
	/**
	 * 利用头插法反转链表
	 * @param head
	 * @return
	 */
	public ListNode reverseList(ListNode head) {
		 //定义一个空节点
        ListNode dummy = null;
        
        ListNode next = null;
        while(head != null){
            next = head.next;
            head.next = dummy;
            dummy = head;
            head = next;
        }
        return dummy;
	}
	
	/**
	 * 没有理解。
	 * 利用递归的思想反转链表(类似于借助一个栈)
	 * 不断的进入递归函数，知道head指向最后一个结点，node指向前一个结点，然后调换head和node的位置
	 * 在返回上一层递归函数，再交换head和node的位置，每次交换后，head结点后面都是交换好的顺序，直到p为首节点。
	 * @param head
	 * @return
	 */
	public ListNode reverseList2(ListNode head){
		if(head == null || head.next ==null){
			return head;
		}
		ListNode node = head;
		head = reverseList2(node.next);
		
		node.next.next = node;
		node.next = null;
		return head;
		
	}
	
}
