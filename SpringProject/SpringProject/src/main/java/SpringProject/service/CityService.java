package SpringProject.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.model.City;
import SpringProject.repository.CityRepository;


@Service
public class CityService 
{
	@Autowired
	CityRepository tdr;

	public List<City> Theaters()
	{			
		List<City> city=(List<City>) tdr.findAll();	
		    return city;
		  			
	}

	public String addthearter(City l)
	{			
		
		//Optional<City> city=tdr.findById(l.getId());
		
		     tdr.save(l);		  
		return "succefully saved";
	}

	
}
