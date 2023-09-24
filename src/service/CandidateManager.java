package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import dao.CandidateDao;
import dao.impl.CandidateDaoImpl;
import entity.Candidate;
import entity.Experience;
import entity.Fresher;
import entity.Intern;

public class CandidateManager {
	 private CandidateDao candidateDao = new CandidateDaoImpl();
	 private List<Candidate> employees;
	

	    public CandidateManager() {
	        this.employees = new ArrayList<>();
	    }

	    public void insert(Candidate employee) {
	        candidateDao.insert(employee);
	    }

	   
	   

	    /**
	     * type = 0 => Experience
	     * type = 1 => Fresher
	     * type = 2 => Intern
	     */
	   

	    public List<Candidate> findAll() {
	        return candidateDao.findAll();
	    }
	    public Candidate findById(String id) {
	        return candidateDao.findById(id);
	    }
	    
	    public List<Candidate> sort() {
	    	List<Candidate> candidates = new ArrayList<>();
	        candidates = candidateDao.findAll();
	        Collections.sort(candidates,(p1,p2)->Integer.compare(p1.getType(), p2.getType()));
	      return candidates;
	       
	    }
	    public int count() {
	    	return candidateDao.count();
	    }


}
