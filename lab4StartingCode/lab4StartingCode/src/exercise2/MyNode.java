package exercise2;


/**
 * Created 11/20/2025
 * 
 * @author Levi Moreau
 * 
 * @version 1.8
 * 
 * @Summary
 * Class Definition: 
 * 		A custom node class for the doubly linked list 
 * 		that controls iteration flow with reference to
 * 		each node's respective predeccessor and successor.
 * 
 * @param <E> The generic type E (Element) that is a placeholder 
 * 		  specifying any data type declared at a MyNode instance.
 * 
 */ class MyNode<E>
{

	private E element;
	private MyNode<E> next;
	private MyNode<E> prev;

	public MyNode(E element) {
		this.element = element;
		this.next = null;
	}
	
	
}
