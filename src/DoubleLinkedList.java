/**
*
* Doppelt verkettete Liste
*
* @author Lennart Almstedt 4633202 Group 11d
* @author Maximilian von Unwerth 4568393 Group 11d
* @author Joshua Heinemann 4701655 Group 11d
*/
public class DoubleLinkedList implements List {
	//Speichert die aktuelle Laenge der Liste.
    private int n  = 0;
	//Speichert das Kopfobjekt.
	private Node head;
	//Speichert das Schwanzobjekt.
    private Node tail;
    /**
	* Die Node-Klasse welche alle
	* wichtigen Variablen beinhaltet.
	* wie Item,prev,next
	*/
    private class Node {
        private Pokemon item;
        private Node prev;
        private Node next;
    }
	
	/**
	* Standartkonstruktor der DoubleLinkedList
	*/
	public DoubleLinkedList() {
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
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
        Node x = head;
        Node y = head.next;
        Node m = new Node();
        m.item = p;
        while (y != tail && y.item.getNr() != p.getNr()) {
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
       
        while (y != head && y.item != p) {
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
          
        while (x != tail) {
            s += x.item.toString() + "\n";
            x = x.next;
        }
            
        return s;
	}
}
