package SpringProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MovieDetails
{	
	    @Id
		private int movie_id;
		private String moviename;
		private String heroname;
	    private int rating; 
	   
	    
	    public MovieDetails() {
			super();
		}
	    
	 
	    public MovieDetails(int movie_id, String moviename, String heroname, int rating) {
			super();
			this.movie_id = movie_id;
			this.moviename = moviename;
			this.heroname = heroname;
			this.rating = rating;
		}
	    
	    
	public int getMovie_id() {
		return movie_id;
	}


	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
   	}


	public String getMoviename() {
		return moviename;
	}


	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}


	public String getHeroname() {
		return heroname;
	}


	public void setHeroname(String heroname) {
		this.heroname = heroname;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


   
	        
}
