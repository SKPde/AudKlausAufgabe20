
public interface WarteSchlange {
	public void rein(Wert d); // Eingang zur Warteschlange
	
	public Wert raus(); // Entfernt vordersten Wert und gibt ihn aus
}
