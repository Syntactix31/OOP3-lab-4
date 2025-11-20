package exercise1;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * Created 11/20/2025
 * 
 * @author Levi Moreau, Jiro Roales, Theo Sanchez
 * 
 * Class Definition:
 *
 * 
 * 
 * @param <E>
 */
public class MyAList<E> implements Iterable<E>
{
	private ArrayList<E> list;
	
	// Not sure if we need java documentation of just inline comments on each of the methods
	public MyAList() {
		list = new ArrayList<E>();
	}
	
	
    public void add(E item) {
        list.add(item);
    }

    
    public void addAll(MyAList<E> items) {
        if (items != null) {
            for (int i = 0; i < items.size(); i++) {
                this.list.add(items.get(i));
            }
        }
    }

    
    public E get(int index) {
        return list.get(index);
    }

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


