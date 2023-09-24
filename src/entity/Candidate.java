package entity;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;

public class Candidate {
	public static long count = 0;
    protected String id;
    protected String fullName;
    protected Date birthday;
    protected String phone;
    protected String email;
    protected int type;
    protected List<Certificate> certificates;

    public Candidate() {}

    public Candidate(String id, String fullName, Date birthday, String phone, String email, List<Certificate> certificates) {
        this.id = id;
        this.fullName = fullName;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        this.certificates = certificates;
    }

    public void showInformation() {
    	 System.out.println(this);
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
    public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }
    
    
    
}
