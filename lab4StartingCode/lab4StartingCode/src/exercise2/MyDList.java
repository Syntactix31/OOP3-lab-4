package exercise2;

/**
 * Created 11/20/2025
 * 
 * @author Levi Moreau, Jiro Roales, Theo Sanchez
 * 
 * @version 1.8
 * 
 * @Summary
 * Class Definition: 
 * 		A custom doubly linked list class that implements 
 * 		generic data sets as its primary data structure 
 * 		and includes all method functionalities in 
 * 		addition to its external node class for iterations.
 * 
 * @param <E> The generic type E (Element) that is a placeholder 
 * 		  specifying any data type declared at a MyDList instance.
 * 
 */
public class MyDList<E>
{

	private MyNode<E> head;
	private MyNode<E> tail;
	private int size;
	
	// Constructor method for initial set up of the empty list
	public void MyNode() {
		head = null;
		tail = null;
		size = 0;
	}
	
	// Accessor method that returns the value of the head node
	public MyNode<E> getHead() {
		return head;
	}
	
	// Mutator method that adds a value of specified data type 
	// to the beginning of the list as the "head" node
	public void addFirst(E item) {
		MyNode<E> newNode = new MyNode<E>(item);
		
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		
		size++;
		
	}
	
	// Mutator method that adds a value of specified data type 
	// to the end of the list as the "tail" node
	public void addLast(E item) {
		MyNode<E> newNode = new MyNode<E>(item);
		
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		
		size++;
	}
	
	
	// Removes and returns the first element in the list
	public E removeFirst() {
		if (head == null) {
			// empty list
			return null;
		}
		
		E data = head.getElement();
		
		// single element
		if (head == tail) {
			head = null;
			tail = null;
		} else {
			MyNode<E> newHead = head.getNext();
			head.setNext(null);
			if (newHead != null) {
				newHead.setPrev(null);
			}
			head = newHead;
		}
		
		size--;
		return data;
	}
	
	// E removeLast()
	public E removeLast() {
		if (tail == null) {
			// empty list
			return null;
		}
		
		E data = tail.getElement();
		
		// single element
		if (head == tail) {
			head = null;
			tail = null;
		} else {
			MyNode<E> newTail = tail.getPrev();
			tail.setPrev(null);
			if (newTail != null) {
				newTail.setNext(null);
			}
			tail = newTail;
		}
		
		size--;
		return data;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	

}
