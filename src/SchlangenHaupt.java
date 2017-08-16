
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
	}

}
