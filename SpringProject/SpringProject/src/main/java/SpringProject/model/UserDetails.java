package SpringProject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserDetails
{
	

	  @Id
	  private int id;
	  @Column(name = "username",unique = true)
	  private String username;
	  private String password;  
	  private String name;
	  private String gender;
	  
	   	  
	  public UserDetails() {
			super();
			
		}
	  
	  
	  public UserDetails(int id, String name, String gender, String username, String password) {
			super();
			this.id = id;
			this.name = name;
			this.gender = gender;
			this.username = username;
			this.password = password;
		}

	  
	  
	  public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	  
	 
		  
}