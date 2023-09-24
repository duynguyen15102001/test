package dao;

import java.util.List;

import entity.Candidate;

public interface CandidateDao {
	void insert(Candidate candidate);
	
	Candidate findById(String id);
	
	boolean deleteById(String id);
	
	List<Candidate> findAll();
	
	int count();
	
	
}
