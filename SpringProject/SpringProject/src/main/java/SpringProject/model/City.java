package SpringProject.model;

import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


@Entity
public class City 
{
	
	  @Id
	  private  int id; 
	  
	  @Column(name="name",unique=true)
	  private String city;
	  
	  @OneToOne(mappedBy="city")
	  private TheaterDetails tds;
	  
	  
	   public City() {
			super();
		}
	   
	   
	   public City(int id, String city, TheaterDetails td) {
			super();
			this.id = id;
			this.city = city;
			this.tds = tds;
		}

	   
	   
		  public int getId() {
				return id;
			}


			public void setId(int id) {
				this.id = id;
			}


			public String getCity() {
				return city;
			}


			public void setCity(String city) {
				this.city = city;
			}


			public TheaterDetails getTd() {
				return tds;
			}


			public void setTd(TheaterDetails tds) {
				this.tds = tds;
			}

	   	   
}
