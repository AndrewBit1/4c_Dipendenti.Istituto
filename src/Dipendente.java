
public class Dipendente {

	protected String matricola;
	protected String indirizzo;
	protected String cognome;
	protected String nome;
	protected float stipendio;
	
	public Dipendente(String matricola, String indirizzo, String cognome, String nome, float stipendio) {
		
		this.matricola = matricola;
		this.indirizzo = indirizzo;
		this.cognome = cognome;
		this.nome = nome;
		this.stipendio = stipendio;
	}
	
	
	public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getStipendio() {
		return stipendio;
	}
	public void setStipendio(float stipendio) {
		this.stipendio = stipendio;
	}


	@Override
	public String toString() {
		return "Dipendente [matricola=" + matricola + ", indirizzo=" + indirizzo + ", cognome=" + cognome + ", nome="
				+ nome + ", stipendio=" + stipendio + "]";
	}
	
	

}
