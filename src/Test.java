
public class Test {
	//static Pokemon head;
	//static Pokemon tail;
	static DoubleLinkedList dl = new DoubleLinkedList();
	
	public static void main(String[] args) {
		//head = new Pokemon();
		Pokemon pkm = new Pokemon(0, "Lukas", "Poison", "Normal", 0, 0, 0, 0, 0, 0, 0);
		Pokemon pkm2 = new Pokemon(1, "Lenni", "Dragon", "Fire", 1000, 1000, 1000, 1000, 100, 1000, 1000);
		//tail = new Pokemon();
		
		/*head.setNext(pkm);
		pkm.setPrev(head);
		pkm.setNext(pkm2);
		pkm2.setPrev(pkm);
		pkm2.setNext(tail);
		tail.setNext(null);
		tail.setPrev(pkm2);*/
		                
		dl.insert(pkm);
		dl.insert(pkm2);
		System.out.println(dl.toString());
		System.out.println();
		dl.delete(pkm);
                System.out.println(dl.toString());
		
		
		
		
		
	}
}
