
public class Collaboratore extends Dipendente {
	private int pianoDiLavoro;

	public Collaboratore(String matricola, String indirizzo, String cognome, String nome, float stipendio, int pianoDiLavoro) {
		super(matricola, indirizzo, cognome, nome, stipendio);
		this.pianoDiLavoro = pianoDiLavoro;
	}
	
	public int getPianoDiLavoro() {
		return pianoDiLavoro;
	}

	public void setPianoDiLavoro(int pianoDiLavoro) {
		this.pianoDiLavoro = pianoDiLavoro;
	}

	@Override
	public String toString() {
		return super.toString()+ "Collaboratore [pianoDiLavoro=" + pianoDiLavoro + "]";
	}
	
}
