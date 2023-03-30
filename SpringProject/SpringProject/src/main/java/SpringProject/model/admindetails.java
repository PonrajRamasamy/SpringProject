package SpringProject.model;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity 
public class admindetails {
  

	
   @Id 
   private int id; 
   private String admin_name; 
   private String password;

   
   @OneToOne(mappedBy="ad") 
   private TheaterDetails theaterdeatils; 

  
   public admindetails() {
		super();
	}
   
   
  public admindetails(int id, String admin_name, String password, List<TheaterDetails> td) {
		super();
		this.id = id;
		this.admin_name = admin_name;
		this.password = password;
		this.theaterdeatils= theaterdeatils;
	}
   
   public int getId() {
	return id;
   }

   public void setId(int id) {
	this.id = id;
   }

  	public String getAdmin_name() {
	return admin_name;
  	}

  	public void setAdmin_name(String admin_name) {
	this.admin_name = admin_name;
  	}

    public String getPassword() {
	return password;
    }

	public void setPassword(String password) {
	this.password = password;
	}

	public TheaterDetails getTd() {
	return theaterdeatils;
	}

	public void setTd(TheaterDetails theaterdeatils) {
	this.theaterdeatils = theaterdeatils;
	}

	   
   
 
}
