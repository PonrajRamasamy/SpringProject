package SpringProject.Controller;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import SpringProject.model.TheaterDetails;
import SpringProject.model.UserDetails;
import SpringProject.model.admindetails;
import SpringProject.model.City;
import SpringProject.model.MovieDetails;
import SpringProject.service.UserService;
import SpringProject.service.adminService;
import jakarta.annotation.PostConstruct;
import SpringProject.repository.MovieDetailsRepository;
import SpringProject.service.CityService;
import SpringProject.service.MovieDetailsService;


@RestController
@RequestMapping("/booking")
public class BookingMovieTickets
{
	  @Autowired
	  UserService ss;

	  @Autowired
	  MovieDetailsService mds;
	  
	  @Autowired
	  CityService cs;
	  
	  @Autowired 
	  adminService as;
	  
	
	@GetMapping("/admin/getmoviedetails")
	public ResponseEntity<List<MovieDetails>> movies()
	{
		List<MovieDetails> md=mds.getmovies1();
		return new ResponseEntity<List<MovieDetails>>(md,HttpStatus.OK);
	}
	
	@PostMapping("/admin/addmovie")
	public  String moviedetails(@RequestBody MovieDetails md)
	{
		   return mds.moviesadd(md);
	}
	
	@DeleteMapping("/admin/{movie_id}")
	public String deletemovies(@PathVariable int movie_id)
	{
		  String delete=mds.deletemovie(movie_id);
		return delete;
	}
	
	
	@PostMapping("/user/signin")
	public  String Signin(@RequestBody UserDetails signin)
	{
		   String s=(String) ss.signin(signin);
		return s;
	}
	
	@PostMapping("/admin/signin/{username}/{password}")
	public  String Signin(@RequestBody admindetails signin,@PathVariable String username,@PathVariable String password)
	{
		   String s=(String) as.addadmindetails(signin,username,password);
		   
		return s;
	}
	
	
	
	@GetMapping
	public ResponseEntity<List<City>> theaters()
	{
		List<City> md=(List<City>) cs.Theaters();
		return new ResponseEntity<List<City>>(md,HttpStatus.OK);
	}

	
	@PostMapping
	public String theater(@RequestBody City place)
	{
		String md=(String)cs.addthearter(place);
		return md;
	}
	
	@PostMapping
	public ResponseEntity<admindetails> addadmin(@RequestBody admindetails adm)
	{
		admindetails ad=as.addadmindetails(adm);
		return new ResponseEntity<admindetails>(ad,HttpStatus.OK);
	}


	
		
}