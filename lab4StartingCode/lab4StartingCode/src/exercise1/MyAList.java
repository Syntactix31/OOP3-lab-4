package exercise1;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * Created 11/20/2025
 * 
 * @author Levi Moreau, Jiro Roales, Theo Sanchez
 * 
 * @version 1.8
 * 
 * @Summary
 * Class Definition: 
 * 		A custom linear list class that implements 
 * 		dynamic ArrayLists as its primary data structure 
 * 		and includes all method functionalities in 
 * 		addition to its iterator.
 * 
 * @param <E> The generic type E (Element) that is a placeholder 
 * 		  specifying any data type declared at a MyAList instance.
 * 
 */
public class MyAList<E> implements Iterable<E>
{
	private ArrayList<E> list;

	// Default Constructor that creates a new instance of an ArrayList
	public void MyAList() {
		list = new ArrayList<E>();
	}
	
	// Mutator method that adds an item of general type E to the list
    public void add(E item) {
        list.add(item);
    }

    // Mutator method that takes a specified array and maps all elements
    // to the list in its designated order
    public void addAll(MyAList<E> items) {
        if (items != null) {
            for (int i = 0; i < items.size(); i++) {
                this.list.add(items.get(i));
            }
        }
    }

    // Accessor method that returns the value of the data at 
    // the specified index
    public E get(int index) {
        return list.get(index);
    }

    // Accessor method that returns the data count of all elements 
    // in the list
    public int size() {
        return list.size();
    } 
    

	public void remove(int index) {
       list.remove(index);
    }
	
	public void set(int index, E item) {
		list.set(index, item);
	}
		
	public boolean isEmpty() {
		return list.isEmpty();
	}

	public Object[] toArray() {
		return list.toArray();
	}

	public void clear() {
		list.clear();
	}

	@Override
	public Iterator<E> iterator() {
		return list.iterator();
	}
}


