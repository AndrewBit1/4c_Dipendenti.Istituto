
public class Docente extends Dipendente {
	private String materia;
	
	public Docente(String matricola, String indirizzo, String cognome, String nome, float stipendio, String materia) {
		
		super(matricola, indirizzo, cognome, nome, stipendio);
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return super.toString() + "Docente [materia=" + materia + "]";
	}
	
	
	

}
