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
	
	
	
	
	public E removeFirst() {
		
	}
	
	public E removeLast() {
		
	}
	
	public int size() {
		
	}
	
	public boolean isEmpty() {
		
	}
	

}
