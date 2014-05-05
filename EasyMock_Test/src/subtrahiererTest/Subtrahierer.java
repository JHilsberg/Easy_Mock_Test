package subtrahiererTest;

public class Subtrahierer {
	private Datenbank db;
	
	public Subtrahierer(Datenbank db){
		this.db = db;
	}

	public int subtrahiereZahlAusDB(){
		int number = 5;
		number = number - db.getLetzteZahlInDB();
		return number;
	}
}
