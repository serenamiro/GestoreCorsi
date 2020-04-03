package it.polito.tdp.corsi.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.polito.tdp.corsi.db.CorsoDAO;

public class Model {
	
	// per non istanziare troppe volte CorsoDAO, posso fare che
	// la classe model preveda un CorsoDAO, che viene creato nel costruttore
	
	private CorsoDAO dao;
	
	public Model() {
		dao = new CorsoDAO();
	}
	
	public List<Corso> getCorsiByPeriodo(Integer pd){
		// CorsoDAO dao = new CorsoDAO();
		return dao.getCorsiByPeriodo(pd);
	}
	
	public Map<Corso, Integer> getIscrittiByPeriodo(Integer pd){
		// CorsoDAO dao = new CorsoDAO();
		return dao.getIscrittiByPeriodo(pd);
	}
	
	public List<Studente> getStudentiByCorso(Corso corso){
		return dao.getStudentiByCorso(corso);
	}
	
	public boolean esisteCorso(String codins) {
		return dao.esisteCorso(codins);
	}
	
	public Map<String, Integer> getDivisioneCDS(Corso c){
		/* SOLUZIONE 1
		List<Studente> studenti = dao.getStudentiByCorso(c);
		Map<String, Integer> statistiche = new HashMap<String, Integer>();
		// nelle HashMap la chiave è univoca
		for(Studente s : studenti) {
			if(s.getCDS() != null && !s.getCDS().equals("")) {
				if(statistiche.containsKey(s.getCDS())) {
					statistiche.put(s.getCDS(), statistiche.get(s.getCDS())+1);
				} else {
					statistiche.put(s.getCDS(), 1);
				}
			}
		}
		return statistiche;
	*/
		// SOLUZIONE 2
		return dao.getDivisioneCDS(c);
	}
}
