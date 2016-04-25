public class Pokemon {
	
	
	private Pokemon prev;
	private Pokemon next;
	protected static Pokemon nullPkm = new Pokemon(-1, "", "", "", 0, 0, 0, 0, 0, 0, 0);
	
	private int nr;
	private String name;
	private String type1;
	private String type2;
	private int total;
	private int hp;
	private int atk;
	private int def;
	private int spatk;
	private int spdef;
	private int speed;
	
	private final int LONGEST_STRING = 15;
	
	public Pokemon() {
		this.nr=-1;
		this.name="";
		this.type1="";
		this.type2="";
		this.total=0;
		this.atk=0;
		this.def=0;
		this.spatk=0;
		this.spdef=0;
		this.speed=0;
	}
	
	public Pokemon( int nr,String name, String type1, String type2,
			int total,int hp,int atk,int def,int spatk,
			int spdef,int speed) {
		this.nr=nr;
		this.name=name;
		this.type1=type1;
		this.type2=type2;
		this.total=total;
		this.hp=hp;
		this.atk=atk;
		this.def=def;
		this.spatk=spatk;
		this.spdef=spdef;
		this.speed=speed;
	}
	
	private String convertNumber(int num) {
		String sNr;
		if(num < 10) {
			sNr = "  " + num;
		}
		else if(num < 100) {
			sNr = " " + num;
		}
		else {
			sNr = Integer.toString(num);
		}
		
		return sNr;
	}
	
	private String convertString(String str) {
		String sName = "";
		for(int i = 0; i < LONGEST_STRING - str.length(); i++) {
			sName += " ";
		}
		sName += str;
		
		return sName;
	}
	
	public void setPrev(Pokemon pkm) {
		this.prev = pkm;
	}
	
	public Pokemon prev() {
	/*	if(prev != DoubleLinkedList.head) {
			return prev;
		}
		return new Pokemon();*/
		return prev;
	}
	
	public void setNext(Pokemon pkm) {
		this.next = pkm;
	}
	
	public Pokemon next() {
		/*if(next != DoubleLinkedList.tail) {
			return next;
		}
		return new Pokemon();*/
		return next;
	}
	
	public String toString() {
		String sNr = convertNumber(nr);
		String sName = convertString(name);
		String sType1 = convertString(type1);
		String sType2 = convertString(type2);
		String sTotal = convertNumber(total);
		String sHp = convertNumber(hp);
		String sAtk = convertNumber(atk);
		String sDef = convertNumber(def);
		String sSpAtk = convertNumber(spatk);
		String sSpDef = convertNumber(spdef);
		String sSpeed = convertNumber(speed);
		
		
		
		
		String formated_line = sNr + " | " + sName + " | " + sType1 + " | " + sType2 + " | " + sTotal + " | " + sHp + " | " + sAtk + " | " + sDef + " | " + sSpAtk + " | " + sSpDef + " | " + sSpeed;
		return formated_line;
	}
}
