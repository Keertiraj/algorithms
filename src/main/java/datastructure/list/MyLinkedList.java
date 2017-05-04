package datastructure.list;

/*
 * Implementation of Doubly linked list. This creates the Empty LinkedList.
 */

public class MyLinkedList<E> {
	
	private ListNode<E> head;
	private ListNode<E> tail;
	private int size;
	
	/*
	 * Initialisation of the linked list.
	 */
	public MyLinkedList(){
		
		size = 0;
		head = new ListNode<E>(null);
		tail = new ListNode<E>(null);
		head.next = tail;
		tail.prev = head;

	}
	
	public void addNode(ListNode<E> n){
		
		n.next = head.next;
		n.prev = n.next.prev;
		n.next.prev = n;
		head.next = n;   // Or more general n.prev.next
		
	}

}

class ListNode<E>{
	
	ListNode<E> next;
	ListNode<E> prev;
	E data;
	
	public ListNode(E data){
		this.data = data;
	}
	
	
}
