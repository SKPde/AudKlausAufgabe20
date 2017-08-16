
public class MeineSchlange implements WarteSchlange{
	
	private Wert anfang, ende; // Referenz auf Beginn und Ende der Liste

	@Override
	public void rein(Wert d) {
		// TODO Auto-generated method stub
		if(anfang == null) {
			anfang = d;
			ende = d;
		} else {
			ende.next = d;
			ende = d;
		}
	}

	@Override
	public Wert raus() {
		// TODO Auto-generated method stub
		Wert temp = anfang;
		anfang = temp.next;
		
		return temp;
	}
	
	public void ausgabe() {
		System.out.println("");
		Wert temp = anfang;
		while (temp != null) {
			System.out.println(temp.d);
			temp = temp.next;
		}
		System.out.println("");
	}

}
