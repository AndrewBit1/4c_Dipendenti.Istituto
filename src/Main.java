
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scuola s1 = new Scuola("A.Meucci", "Centrale", 10);
		
		Docente doc1 = new Docente("abc123", "Via Roma", "Bruno", "Maria", 1200, "Matematica");
		Docente doc2 = new Docente("bb2", "Via Piave", "Ferrari", "Giuseppe", 1300, "Tecnologia");
		Docente doc3 = new Docente("rr8", "Via Milano", "Filippo", "Rossi", 1200, "Musica");
		
		Collaboratore coll1 = new Collaboratore("cc", "Via Torino", "Damico", "Antonio", 1100, 1);
		Collaboratore coll2 = new Collaboratore("de", "Via Agosto", "Bruno", "Michele", 1100, 2);
		
		//AGGIUNTA DIPENDENTI
		System.out.println(s1.addDipendente(doc1));
		System.out.println(s1.addDipendente(doc2));
		System.out.println(s1.addDipendente(doc3));
		System.out.println(s1.addDipendente(coll1));
		System.out.println(s1.addDipendente(coll2));
		
		System.out.println("---------------------STAMPA SCUOLA DOPO AGGIUNTA------------------------------");
		System.out.println(s1.toString());
		
		
		//ELIMINA DIPENDENTE PER MATRICOLA
		System.out.println("\n-------------------ELIMINAZIONE DIPENDENTE PER MATRICOLA-------------------------");
		System.out.println(s1.eliminaDipendente("bb2"));
		
		System.out.println("---------------------STAMPA SCUOLA DOPO ELIMINAZIONE------------------------------");
		System.out.println(s1.toString());
		
		
		System.out.println("\n--------------------RICERCA DIPENDENTE PER MATRICOLA-----------------------");
		System.out.println(s1.cercaDipendentePerCognome("abc123"));
		
		
		//CERCA DIPENDENTI CON UN DETERMINATO COGNOME
		System.out.println("\n-----------------------------DIPENDENTI CON LO STESSO COGNOME-----------------------");
		Dipendente[] cognomeDipendenti = s1.cercaDipendentiCognome("Bruno");
		for (int i=0; i< cognomeDipendenti.length; i++) {
			if(cognomeDipendenti[i] != null) {
				System.out.println(cognomeDipendenti[i].toString());
			}
			
			else {
				break;
			}
		}
		
		
		//RICERCA E STAMPA DI TUTTI I DOCENTI
		System.out.println("\nI DOCENTI DELL'ISTITUTO SONO:");
		Dipendente[] dec = s1.cercaDocenti();
		for (int i=0; i< dec.length; i++) {
			if(dec[i] != null) {
				System.out.println(dec[i].toString());
			}
			
			else {
				break;
			}
		}

	}

}
