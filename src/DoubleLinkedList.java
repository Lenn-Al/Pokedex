/**
*
* Doppelt verkettete Liste
*
* @author Lennart Almstedt 4633202 Group 11d
* @author Maximilian von Unwerth 4568393 Group 11d
* @author Joshua Heinemann 4701655 Group 11d
*/
public class DoubleLinkedList implements List {
	
	private Pokemon elem;
	private DoubleLinkedList prev;
	private DoubleLinkedList next;
	
	/**
	* Kopf der Liste
	*/
	private DoubleLinkedList head = new DoubleLinkedList(new Pokemon()); 
	
	/**
	* Schwanz der Liste
	*/
	private DoubleLinkedList tail = new DoubleLinkedList(new Pokemon());
	
	/**
	* Konstruktor der Liste
	* Am Anfang leere Liste erstellen
	*/
	
	public DoubleLinkedList() {
		head.next = tail;
		tail.prev = head;
		elem = null;
	}
	
	public DoubleLinkedList(Pokemon p) {
		head.next = null;
		tail.prev = null;
		elem = p;
	}
	
	/**
	* Die Liste ist leer, wenn das erste Element das letzte ist.
	*/
	@Override
	public boolean isEmpty() {
		return next == null && prev == null;
	}

	/**
	* 
	*/
	@Override
	public int length() {
		int l = 0;
		DoubleLinkedList p = head.next;	
		//Fuer jedes Element in der Liste, 
		while (p != tail) { 
			l++;
			p = p.next;
		}
		return l;
	}

	/**
	* Gibt den Kopf der Liste zurueck
	* @return Das erste Pokemon 
	*/
	@Override
	public Pokemon firstPokemon() {
		return head.next.elem; //Kopf der Liste ist das erste Pokemon
	}

	/**
	* Fuegt ein Pokemon hinten in die Liste ein
	* @param Einzufuegendes Pokemon
	*/
	@Override
	public void insert(Pokemon p) {
		DoubleLinkedList l = new  DoubleLinkedList(p);
		DoubleLinkedList x = head;
		DoubleLinkedList y = head.next;
		while (y != tail && l.elem.getNr() >= y.elem.getNr() ) {
			x = x.next;
			y = y.next;
		}		
		l.setPrev(x);
		l.setNext(y);
		x.setNext(l);
		y.setPrev(l);
	}

	/**
	* Loescht ein Pokemon aus der Liste
	*/
	@Override
	public void delete(Pokemon p) {
		DoubleLinkedList x = head;
		DoubleLinkedList y = head.next();		
		while (y != tail && y.elem != p) {
			x = x.next();
			y = y.next();
		}
		if (y != tail) {
			x.setNext(y.next());
			x.next().setPrev(y.prev());
		}
		
	}
	
	/**
	* Gibt die Liste als Stirng zurueck
	* @return Die Liste als String
	*/
	public String toString() {
		DoubleLinkedList p = head;
		String s = "";
		while (p.next != tail) {
            p = p.next;         
            s += p.toString() + "\n";
		}		
		return s;
	}
	
	/**
	    * An vorderes Element ankoppeln
	    * @param pkm vorderes Pokemon
	    */
	    public void setPrev(DoubleLinkedList prev) {
	        this.prev = prev;
	    }
	    /**
	    * Vorheriges Element zurueckgeben
	    * @return Vorheriges Pokemon
	    */
	    public DoubleLinkedList prev() {
	        return prev;
	    }
	    /**
	    * Nachfolgendes Element setzen
	    * @param pkm Naechstes Pokemon
	    */
	    public void setNext(DoubleLinkedList next) {
	        this.next = next;
	    }
	    /**
	    * Naechstes Pokemon setzen
	    * @return Nachfolgendes Pokemon
	    */
	    public DoubleLinkedList next() {
	        return next;
	    }
	
	/**
	* Fuegt ein Pokemon an die richtige Position ein
	* @param Einzufuegenden Pokemon
	*/
//	public void insertSorted(Pokemon p) {
//		Pokemon x = head;
//		Pokemon y = head.next();
//		while(y != tail && p.getNr() >= y.getNr() ) {
//			x = x.next();
//			y = y.next();
//		}		
//		p.setPrev(x);
//		p.setNext(y);
//		x.setNext(p);
//		y.setPrev(p);
//	}

}
