package SpringProject.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringProject.model.UserDetails;
import SpringProject.repository.UserRepository;


@Service
public class UserService
{
	@Autowired
	UserRepository sr;
	
	public String signin(UserDetails signin)
	{
	  	
	  Optional<UserDetails> signindetails=sr.findById(signin.getId());
		
	  
	  if(signindetails.isPresent())
	  {
		  return "change username";
	  }
	  else
	  {
		   sr.save(signin);
	    return "Successfully signed";
	  }
	  	 
		
	}
	
	
	
	
}
