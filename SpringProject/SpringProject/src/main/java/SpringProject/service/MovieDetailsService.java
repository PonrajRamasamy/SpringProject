package SpringProject.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.model.MovieDetails;
import SpringProject.repository.MovieDetailsRepository;


@Service
public class MovieDetailsService 
{

	
	@Autowired
	MovieDetailsRepository  mdr;
	
	
	public String moviesadd(MovieDetails md)
	{
		Optional<MovieDetails> mds=mdr.findById(md.getMovie_id());

	
		if(mds.isPresent())
		{
			return "already id is exsit";
		}
		else
		{
			 mdr.save(md);
			 return "successfully added";
		}
		
	}
	
	
	
	public String deletemovie(int id)
	{
		Optional<MovieDetails> delete=mdr.findById(id);
		
		if(delete.isPresent())
		{
			mdr.deleteById(id);
			return "successfully deleted";
		}
		else
		{
		    return "movie id is not found";
		}
	}
	
	
	public List<MovieDetails> getmovies1()
	{
		List<MovieDetails> employees=mdr.findAll();
		
		if(employees.size()>0)
		{
			return employees;
		}
		else
		{
			return new ArrayList<MovieDetails>();
		}
			
	}
	
	
	
	public List<MovieDetails> showingdetails()
	{
		
		return (List<MovieDetails>) mdr.findAll();
		
	}


	
	

}
