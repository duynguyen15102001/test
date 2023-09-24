package service;


import java.sql.Date;
import java.time.LocalDate;

import exception.BirthDayException;
import exception.EmailException;
import exception.FullNameException;
import exception.PhoneException;


public class ValidatorService {
	 public static void birthdayCheck(Date birthday) throws BirthDayException {
		
		  if(birthday.getYear() < 1900) {
			  throw new BirthDayException("nam sinh phai hon 1990");
		  }
	    }

	    public static void phoneCheck(String phone) throws PhoneException {
	        // TODO HERE
	    }

	    public static void emailCheck(String str) throws EmailException {
	    	// Lay vi tri ky tu @ xuat hien trong chuoi
	        int vt = str.indexOf('@');

	        // TH1: Neu khong chua @
	        if (vt == -1) {
	            // Nem ra 1 doi tuong loi
	            throw new EmailException("Khong hop le cho khong chua ky tu '@'");
	        }

	        // TH2: Neu @ nam o vi tri dau tien
	        if (vt == 0) {
	            throw new EmailException("Khong hop le do '@' nam o vi tri dau tien");
	        }

	        // TH3: Kiem tra xem trong chuoi co chua @ nao khac hay khong
	        vt = str.indexOf('@', vt + 1);
	        // Neu con chua @
	        if (vt != -1) {
	            throw new EmailException("Khong hop le do chua nhieu hon 1 ky tu '@'");
	        }

	        // TH4: Dung
	        System.out.println("Dia chi email dung dinh dang!");
	    }
	    
	    

	    public static void nameCheck(String name) throws FullNameException {
	        // TODO HERE
	    }
}
