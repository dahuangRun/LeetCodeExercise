package lru;

import java.util.HashMap;

public class LRUcacheTest {
	int capacity;
	HashMap<Integer, Node> map = new HashMap<Integer, Node>();
	Node head = null;
	Node end = null;

	public LRUcacheTest(int capacity) {
		this.capacity = capacity;
	}

	/**
	 * 如果cache中不存在要get的值，返回-1；
	 * 如果cache中存在要找的值，返回其值并将其在原链表中删除，然后将其插入作为头结点。
	 * @param key
	 * @return
	 */
	public int get(int key) {
		if (map.containsKey(key)) {
			Node n = map.get(key);
			remove(n);
			setHead(n);
			return n.value;
		}
		return -1;
	}

	/**
	 * 删除一个结点
	 * 
	 * @param n
	 */
	public void remove(Node n) {
		if (n.pre != null) {
			n.pre.next = n.next;
		} else {
			head = n.next;
		}

		if (n.next != null) {
			n.next.pre = n.pre;
		} else {
			end = n.pre;
		}

	}

	/**
	 * 设置为头结点
	 * @param n
	 */
	public void setHead(Node n) {
		n.next = head;
		n.pre = null;

		if (head != null)
			head.pre = n;

		head = n;

		if (end == null)
			end = head;
	}
	
	
	/**
	 * set(key,value)：当set的key值已经存在，就更新其value， 将其在原链表中删除，然后将其作为头结点；
	 * 当set的key值不存在，就新建一个node，如果当前len<capacity,就将其加入hashmap中，并将其作为头结点，
	 * 更新len长度，否则，删除链表最后一个node，再将其放入hashmap并作为头结点，但len不更新。
	 * @param key
	 * @param value
	 */
	public void set(int key, int value) {
		if (map.containsKey(key)) {
			Node old = map.get(key);
			old.value = value;
			remove(old);
			setHead(old);
		} else {
			Node created = new Node(key, value);
			if (map.size() >= capacity) {
				map.remove(end.key);
				remove(end);
				setHead(created);
 
			} else {
				setHead(created);
			}
 
			map.put(key, created);
		}
	}
}
