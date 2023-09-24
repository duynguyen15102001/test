import java.sql.Date;
import java.sql.Timestamp;
import java.util.Scanner;

import entity.Candidate;
import view.ScannerFactory;
import view.ViewManager;

public class Main {
	public static void main(String[] args) {
        ViewManager uiManager = new ViewManager();
        Candidate candidate = new Candidate();
        Scanner scanner = ScannerFactory.getScanner();
        
        
      
            System.out.println("Application");
            System.out.println("Enter 1: To insert candidate");
            System.out.println("Enter 2: To show full name: ");
            System.out.println("Enter 3: Sort candidate list by type and birthday: ");
            System.out.println("Enter 4: To Update candidate: ");
            System.out.println("Enter 5: To exit:");
            Integer ch = scanner.nextInt();
            switch (ch) {
                case 1: {
                	
                   
                	System.out.println("Enter id:");
                	String id = scanner.next();
                	candidate.setId(id);
                	System.out.println("fullname:");
                	candidate.setFullName(scanner.next());
                	System.out.println("birthday:");
                	String dateString = scanner.next();
                	Date ts = Date.valueOf(dateString);
                    candidate.setBirthday(ts);
                   
           
                    System.out.println("Phone:");
                 	candidate.setPhone(scanner.next());
                	System.out.println("Enter type of candidate:");
                    int type = scanner.nextInt();

                    uiManager.insert(type,candidate);
                    candidate.count++;
                    System.out.println("So luong ung vien vua nhap vao"+ candidate.count++);
                    
                }
                case 2:{
                	 uiManager.showFullNameCandidate();
                	 break;
                }
                case 3:{
               	 // sort
               }
                case 4:{
               	 //update
               }
                case 5:{
                	 System.exit(0);
                }
                // TODO HERE
            }
        }
    
}
