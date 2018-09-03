package list;

/**
 * ��Ŀ������һ�������У����������ͬ�Ľ�㣬��ɾ��������ͬ�Ľ�㡣
 * ����һ������������һ�����ͳ������ظ�������Ҫɾ����һ����㣬ͷ���ɾ���Ǻ��鷳���¶�����ˣ����ǿ������һ��������ͷ��㡣
 * ˼·�����������ؼ��Ľ�㣬pre ,cur,next��������ɾ����������һ����û����һ����ͬ�Ľ�㣬��ɾ����
 * 		���ǲ���ͳ�Ƶķ�������¼��ɾ������ǰһ�����pre�ʹ�ɾ�����һ������һ�¸����next��Ȼ��һ����ɾ�����е��м��㡣
 *  * @author Xia
 *
 */
public class ListRemoveAllSameNode {
	public ListNode deleteDuplicates(ListNode head) {
		
		ListNode temp = new ListNode(0);
		temp.next = head;
		
		ListNode pre = temp;
		ListNode cur = pre.next;
		ListNode next = null;
		
		boolean delete;
		
		while (cur != null) {
			next = cur.next;
			delete = false;
			while (next != null && cur.val == next.val) {
				cur = next;
				next = next.next;
				delete = true;
			}
			
			//������ظ���㣬��һ����ɾ�����е��ظ���㡣
			if (delete) {
				pre.next = next;
			}else {				//���û���ظ���㣬��ÿ�ν�pre����ݼ�
				pre = cur;
			}
			//�����Ƿ����ظ���㣬curÿ�ζ������һ��next
			cur = next;
		}
		return temp.next;
	}
}
