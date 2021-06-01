import java.util.Arrays;
/**
 * versione 1
 * @author Andrea Manco
 * William :3
 */
public class Scuola {
	
	private String nome;
	private String sede;
	private int numDipendentiMax;
	private int dipendentiPresenti;
	private Dipendente[] dipendenti;
	
	public Scuola(String nome, String sede, int numDipendentiMax) {
		this.nome = nome;
		this.sede = sede;
		this.dipendentiPresenti = 0;
		this.numDipendentiMax = numDipendentiMax;
		this.dipendenti = new Dipendente[numDipendentiMax];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public int getNumDipendentiMax() {
		return numDipendentiMax;
	}

	public void setNumDipendentiMax(int numDipendentiMax) {
		this.numDipendentiMax = numDipendentiMax;
	}

	public int getDipendentiPresenti() {
		return dipendentiPresenti;
	}

	public void setDipendentiPresenti(int dipendentiPresenti) {
		this.dipendentiPresenti = dipendentiPresenti;
	}


	@Override
	public String toString() {
		String concatenazione="[";
		for(int i=0; i<dipendentiPresenti;i++) {
			concatenazione += dipendenti[i].toString();
			if(i< (dipendentiPresenti -1)) {
				concatenazione += ", ";
			}
			else {
				concatenazione += "]";
			}
		}
		return "Scuola [nome=" + nome + ", sede=" + sede + ", numDipendentiMax=" + numDipendentiMax
				+ ", dipendentiPresenti=" + dipendentiPresenti + ", dipendenti=" + concatenazione + "]";
	}
	
	//AGGIUNGI DIPENDENTE
	public boolean addDipendente(Dipendente d){
		if(dipendentiPresenti < dipendenti.length) {
			dipendenti[dipendentiPresenti] = d;
			dipendentiPresenti++;
			return true;
		}
		return false;
	}
	
	//ELIMINA DIPENDENTE PER MATRICOLA
	public boolean eliminaDipendente(String matricola) {
		for(int i=0; i<dipendentiPresenti; i++) {
			if(dipendenti[i].getMatricola().compareToIgnoreCase(matricola) == 0) {
				for(int j=i; j<dipendentiPresenti ; j++ ) {
					dipendenti[j] = dipendenti[j+1];
				}
				dipendentiPresenti --;
				return true;
			}
		}
		return false;
	}
	
	
	//RICERCA DIPENDENTE PER MATRICOLA
	public Dipendente cercaDipendentePerCognome(String codice) {
		for(int i=0; i<dipendentiPresenti; i++) {
			if(dipendenti[i].getMatricola().compareToIgnoreCase(codice) == 0) {
				return dipendenti[i];
			}
		}
		return null;
	}
	
	
	//METODO PER RICERCARE TUTTI I DIPENDENTI CON UN DETERMINATO COGNOME	
	public Dipendente[] cercaDipendentiCognome(String cognome) {
		Dipendente[] dipCogn = new Dipendente[dipendentiPresenti];
		int cont = 0;
		for(int i=0; i<dipendentiPresenti; i++) {
			if (dipendenti[i].getCognome().compareToIgnoreCase(cognome) == 0) {
				dipCogn[cont] = dipendenti[i];
				cont++;
			}
		}
		return dipCogn;
	}
	
	//RICERCA DI TUTTI I DOCENTI
	public Dipendente[] cercaDocenti(){
		int counter =0;
		Dipendente[] docenti = new Dipendente[dipendentiPresenti];
		
		for(int i=0; i<dipendentiPresenti; i++) {
			if(dipendenti[i] instanceof Docente) {
				docenti[counter] = dipendenti[i];
				counter++;
			}
		}
		return docenti;
	}
	
	

}
