package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.Tekst;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {
		innleggtabell = new Innlegg[20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteledig = 0;
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		for (int i = 0; i < nesteledig; i++) {
			
		if (innleggtabell[i].erLik(innlegg)) {
			return innlegg.getId();
		}
		} return -1;
		
	}

	public boolean finnes(Innlegg innlegg) {
		for (int i = 0; i < nesteledig; i++) {
			
			if (innleggtabell[i].erLik(innlegg)) {
				return true;
			}
		} return false;
	}

	public boolean ledigPlass() {
		if (nesteledig < innleggtabell.length) {
			return true;
		} else {
			return false;
		}

	}
	
	public boolean leggTil(Innlegg innlegg) {
		boolean ledig = false;
		if (!ledigPlass()) {
			return ledig;
		} else {
			for (int i = 0; i < nesteledig; i++) {
				if (innleggtabell[i].erLik(innlegg)) {
					return ledig;
				} 
				}
				innleggtabell[nesteledig] = innlegg;
				nesteledig++;
				ledig = true;
				return ledig;
		}
	}
	
	public String toString() {
		String x = nesteledig + "\n";
		String y = "" ;
		for (int i = 0; i < nesteledig; i++) {
			y += innleggtabell[i].toString();
			
		} return x + y;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}