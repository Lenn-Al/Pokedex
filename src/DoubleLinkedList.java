import com.sun.corba.se.impl.ior.POAObjectKeyTemplate;

public class DoubleLinkedList implements List {
	private Pokemon head = new Pokemon();
	private Pokemon tail = new Pokemon();
	
	public DoubleLinkedList() {
		head.setNext(tail);
		tail.setPrev(head);
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return head.next() == tail;
	}

	@Override
	public int length() {
		int l = 0;
		Pokemon p = head.next();
		
		while(p != tail) {
			l++;
			p = p.next();
		}
		return l;
	}

	@Override
	public Pokemon firstPokemon() {
		return head;
	}

	@Override
	public void insert(Pokemon p) {
		p.setNext(tail);
		p.setPrev(tail.prev());
		tail.prev().setNext(p);
		tail.setPrev(tail.prev().next());
	}

	@Override
	public void delete(Pokemon p) {
		Pokemon x = head;
		Pokemon y = head.next();
		
		while(y != tail && y != p) {
			x = x.next();
			y = y.next();
		}
		
		if(y != tail) {
			x.setNext(y.next());
			x.next().setPrev(y.prev());
		}
		
	}
	
	public String toString() {
		Pokemon p = head.next();
		String s = "";
		while(p.next() != tail) {
			s += p.toString() + "\n";
			p = p.next();
		}
		
		return s;
	}
	

}
