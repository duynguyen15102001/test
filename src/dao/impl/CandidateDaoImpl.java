package dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.CandidateDao;
import entity.Candidate;
import utils.ConnectionUtils;

public class CandidateDaoImpl implements CandidateDao {
	private Connection conn;
	Candidate candidate;
	@Override
	public void insert(Candidate candidate) {
		try(Connection conn = ConnectionUtils.getConnection();
		         Statement stmt = conn.createStatement();
		      ) {		      
		         // Execute a query
		         System.out.println("Inserting records into the table...");          
		         String sql = "INSERT INTO Candidate(id,fullname,birthday,phone,email,type) VALUES ('"+candidate.getId()+"','"+candidate.getFullName()+"','"+candidate.getBirthday()+"','"+candidate.getPhone()+"','"+candidate.getEmail()+"',"+candidate.getType()+")";
		         stmt.executeUpdate(sql);
		        
		      } catch (SQLException e) {
		         e.printStackTrace();
		      } 
		
	}
	@Override
	public Candidate findById(String id) {
		Candidate candidate = null;
		String sql = "SELECT * FROM Candidate WHERE id = '"+id+"'";
		try(Connection conn = ConnectionUtils.getConnection();
				 Statement stmt = conn.createStatement();
				
		         ResultSet rs = stmt.executeQuery(sql);
				
		      ) {		   
			
		         while(rs.next()){
		        	      		
		        	    candidate.setId(rs.getString("id"));
			    		candidate.setFullName(rs.getString("fullname"));
			    	         
		         }
		        
		      } catch (SQLException e) {
		         e.printStackTrace();
		      }
		return candidate;
	}
	@Override
	public boolean deleteById(String id) {
		// TODO Auto-generated method stub
		return false;
	}
	@SuppressWarnings("null")
	@Override
	public List<Candidate> findAll() {
		List<Candidate> listCandidate = new ArrayList<>();
		String sql = "SELECT * FROM Candidate";
		try(Connection conn = ConnectionUtils.getConnection();
				 Statement stmt = conn.createStatement();
				
		         ResultSet rs = stmt.executeQuery(sql);
				
		      ) {		   
			
		         while(rs.next()){
		        	  
			        Candidate candidate = new Candidate();
		        	 candidate.setId(rs.getString("id"));
			         candidate.setFullName(rs.getString("fullname"));
			    		
		             listCandidate.add(candidate);
		         }
		        
		      } catch (SQLException e) {
		         e.printStackTrace();
		      }
	

		return listCandidate;
	}
	@Override
	public int count() {
		int countCandidate = 0;
		String sql = "SELECT count(*) AS count FROM Candidate ";
		try(Connection conn = ConnectionUtils.getConnection();
				 Statement stmt = conn.createStatement();
				
		         ResultSet rs = stmt.executeQuery(sql);
				
				
		      ) {		   
			
		         while(rs.next()){
		        	countCandidate = rs.getInt(1); 
		        	
		         }
		        
		      } catch (SQLException e) {
		         e.printStackTrace();
		      }
	

	
		return countCandidate;
	}
	
   
}
