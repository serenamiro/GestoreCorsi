package it.polito.tdp.corsi.model;

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
}
