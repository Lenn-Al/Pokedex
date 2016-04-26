//TODO @Override Annotationen richtig?!
//TODO length überprüfen
//TODO insertSorted statt insert schreiben um nur Methoden aus List.java zu verwenden
//TODO x rauslassen, alles über y laufen lassen, genauso insertSorted

/**
*
* Doppelt verkettete Liste
*
* @author  
* @author Maximilian von Unwerth 4568393 Group ?
*/
public class DoubleLinkedList implements List {
	
	/**
	* Kopf der Liste
	*/
	private static Pokemon head = new Pokemon(); 
	
	/**
	* Schwanz der Liste
	*/
	private static Pokemon tail = new Pokemon();
	
	/**
	* Konstruktor der Liste
	* Am Anfang leere Liste erstellen
	*/
	public DoubleLinkedList() {
		head.setNext(tail); //Aufbau der leeren Liste: Head|Tail
		tail.setPrev(head); // Head und Tail direkt verbunden
	}
	
	/**
	* Die Liste ist leer, wenn das erste Element das letzte ist.
	*/
	@Override
	public boolean isEmpty() {
		return head.next() == tail; //Leere Liste? (analog Konstruktor)
	}

	/**
	* 
	*/
	@Override
	public int length() {
		int l = 0;
		Pokemon p = head.next();	
		//Fuer jedes Element in der Liste, 
		while(p != tail) { 
			l++;
			p = p.next();
		}
		return l;
	}

	/**
	* Gibt den Kopf der Liste zurueck
	* @return Das erste Pokemon 
	*/
	@Override
	public Pokemon firstPokemon() {
		return head; //Kopf der Liste ist das erste Pokemon
	}

	/**
	* Fuegt ein Pokemon hinten in die Liste ein
	* @param Einzufuegendes Pokemon
	*/
	@Override
	public void insert(Pokemon p) {
		p.setNext(tail); 
		p.setPrev(tail.prev());
		tail.prev().setNext(p);
		tail.setPrev(p);
        tail.prev().next().toString();
	}

	/**
	* Loescht ein Pokemon aus der Liste
	*/
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
	
	/**
	* Gibt die Liste als Stirng zurueck
	* @return Die Liste als String
	*/
	public String toString() {
		Pokemon p = head;
		String s = "";
		while(p.next() != tail) {
            p = p.next();         
            s += p.toString() + "\n";
		}		
		return s;
	}
	
	/**
	* Fuegt ein Pokemon an die richtige Position ein
	* @param Einzufuegenden Pokemon
	*/
	public void insertSorted(Pokemon p) {
		Pokemon x = head;
		Pokemon y = head.next();
		while(y != tail && p.getNr() >= y.getNr() ) {
			x = x.next();
			y = y.next();
		}		
		p.setPrev(x);
		p.setNext(y);
		x.setNext(p);
		y.setPrev(p);
	}

}
