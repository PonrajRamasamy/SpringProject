package SpringProject.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class TheaterDetails 
{
	
	
	  @Id
	  private int id;  	 
	  private String theater_name;
 	  private int TotalNumOfSeat;
      private int movie;
	  private int rupees;
	  
	  @OneToOne
	  @JoinColumn(name="city")
      private City city;
	  
	  	  
	  public TheaterDetails() {
			super();
		}

	  
	  public TheaterDetails(int id, String theater_name, int totalNumOfSeat, int movie, int rupees, City city,
				admindetails ad) {
			super();
			this.id = id;
			this.theater_name = theater_name;
			TotalNumOfSeat = totalNumOfSeat;
			this.movie = movie;
			this.rupees = rupees;
			this.city = city;
		}

	  
	  public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTheater_name() {
			return theater_name;
		}

		public void setTheater_name(String theater_name) {
			this.theater_name = theater_name;
		}

		public int getTotalNumOfSeat() {
			return TotalNumOfSeat;
		}

		public void setTotalNumOfSeat(int totalNumOfSeat) {
			TotalNumOfSeat = totalNumOfSeat;
		}

		public int getMovie() {
			return movie;
		}

		public void setMovie(int movie) {
			this.movie = movie;
		}

		public int getRupees() {
			return rupees;
		}

		public void setRupees(int rupees) {
			this.rupees = rupees;
		}

		public City getCity() {
			return city;
		}

		public void setCity(City city) {
			this.city = city;
		}
	 
	  
	  
}
