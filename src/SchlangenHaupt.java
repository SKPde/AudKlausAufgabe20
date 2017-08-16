
public class SchlangenHaupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MeineSchlange schlange = new MeineSchlange();
		
		schlange.rein(new Wert(21.0));
		schlange.rein(new Wert(48.0));
		schlange.rein(new Wert(30.0));
		schlange.rein(new Wert(12.0));
		schlange.rein(new Wert(93.0));
		
		schlange.ausgabe();
		
		System.out.println("Raus: " + schlange.raus().d);
		System.out.println("Raus: " + schlange.raus().d);
		
		schlange.rein(new Wert(28.0));
		schlange.rein(new Wert(1.0));
		schlange.rein(new Wert(97.0));
		
		schlange.ausgabe();
		
		System.out.println("Raus: " + schlange.raus().d);
		
		schlange.ausgabe();
	}

}
