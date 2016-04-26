/**
*
* Doppelt verkettete Liste
*
* @author Lennart Almstedt 4633202 Group 11d
* @author Maximilian von Unwerth 4568393 Group 11d
* @author Joshua Heinemann 4701655 Group 11d
*/
public class DoubleLinkedList implements List {
	
        private int n  = 0;
	private Node head;
        private Node tail;
        
        private class Node {
            private Pokemon item;
            private Node prev;
            private Node next;
        }
	
	/**
	* Kopf der Liste
	*/
//	private DoubleLinkedList head = new DoubleLinkedList(new Pokemon()); 
	
	/**
	* Schwanz der Liste
	*/
//	private DoubleLinkedList tail = new DoubleLinkedList(new Pokemon());
	
	/**
	* Konstruktor der Liste
	* Am Anfang leere Liste erstellen
	*/
	
	/*public DoubleLinkedList() {
		next = null;
		prev = null;
		elem = null;
	}*/
	
	public DoubleLinkedList() {
            head = new Node();
            tail = new Node();
            head.next=tail;
            tail.prev=head;
	}
	
	/**
	* Die Liste ist leer, wenn das erste Element das letzte ist.
	*/
	@Override
	public boolean isEmpty() {
            return n == 0;
	}

	/**
	* 
	*/
	@Override
	public int length() {
            return n;
	}

	/**
	* Gibt den Kopf der Liste zurueck
	* @return Das erste Pokemon 
	*/
	@Override
	public Pokemon firstPokemon() {
            return head.next.item; //Kopf der Liste ist das erste Pokemon
	}

	/**
	* Fuegt ein Pokemon hinten in die Liste ein
	* @param Einzufuegendes Pokemon
	*/
	@Override
	public void insert(Pokemon p) {
            Node x= head;
            Node y=head.next;
            Node m = new Node();
            m.item = p;

            while(y != tail && y.item.getNr() != p.getNr()) {
                x = x.next;
                y = y.next;
            }
            x.next = m;
            y.prev = m;
            m.prev = x;
            m.next = y;
            n++;
	}

	/**
	* Loescht ein Pokemon aus der Liste
	*/
	@Override
	public void delete(Pokemon p) {
            Node x = head;
            Node y = head.next;
            
            while(y != head && y.item != p) {
                x = x.next;
                y = y.next;
            }
            y.next.prev = x;
            x.next = y.next;
            n--;
	}
	
	/**
	* Gibt die Liste als Stirng zurueck
	* @return Die Liste als String
	*/
	public String toString() {
            Node x = head.next;
            String s = "";
            
            while(x != tail) {
                s+= x.item.toString() + "\n";
                x = x.next;
            }
            
            return s;
	}
	
//	/**
//	    * An vorderes Element ankoppeln
//	    * @param pkm vorderes Pokemon
//	    */
//	    public void setPrev(DoubleLinkedList prev) {
//	        this.prev = prev;
//	    }
//	    /**
//	    * Vorheriges Element zurueckgeben
//	    * @return Vorheriges Pokemon
//	    */
//	    public DoubleLinkedList prev() {
//	        return prev;
//	    }
//	    /**
//	    * Nachfolgendes Element setzen
//	    * @param pkm Naechstes Pokemon
//	    */
//	    public void setNext(DoubleLinkedList next) {
//	        this.next = next;
//	    }
//	    /**
//	    * Naechstes Pokemon setzen
//	    * @return Nachfolgendes Pokemon
//	    */
//	    public DoubleLinkedList next() {
//	        return next;
//	    }
	
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
