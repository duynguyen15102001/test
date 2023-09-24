package view;

import java.util.List;
import java.util.Scanner;

import entity.Candidate;
import entity.Experience;
import entity.Fresher;
import entity.Intern;
import exception.BirthDayException;
import exception.EmailException;
import exception.FullNameException;
import exception.PhoneException;
import service.CandidateManager;
import service.ValidatorService;

public class ViewManager {
	 private CandidateManager candidateManager = new CandidateManager();

	  
	    public void insert(int type,Candidate candidate) {
	      
	        if (type == 0) {
	        	candidate.setType(0);
	          
	        }
	        if (type == 1) {
	        	candidate.setType(1);
	            
	        }
	        if (type == 2) {
	        	candidate.setType(2);
	            
	        }

	        try {
	            checkData(candidate);
	        } catch (BirthDayException e) {
	           
	        } catch (PhoneException e) {
	           
	        } catch (EmailException e) {
	           
	        } catch (FullNameException e) {
	           
	        }
         
	        candidateManager.insert(candidate);
	    }

	   

	   

	  

	    public void update() {
	        System.out.print("Input ID to update: ");
	        String id = ScannerFactory.getScanner().nextLine();
	        Candidate employee = this.candidateManager.findById(id);
	        // TODO HERE
	    }

	    

	    public void showFullNameCandidate() {
	      List<Candidate> listCandidate =  candidateManager.findAll();
	      StringBuffer sb = new StringBuffer();
	      for(Candidate candidate : listCandidate) {
	    	  sb.append(candidate.getFullName());
	    	 
	    	  sb.append(",");
	      }
	        String fullname = sb.toString();
	        System.out.println(fullname);
	    }
	    
	 

	    private void checkData(Candidate employee) throws BirthDayException, PhoneException, EmailException, FullNameException {
	        ValidatorService.birthdayCheck(employee.getBirthday());
	        ValidatorService.phoneCheck(employee.getPhone());
	        ValidatorService.emailCheck(employee.getEmail());
	        ValidatorService.nameCheck(employee.getFullName());
	    }

}
