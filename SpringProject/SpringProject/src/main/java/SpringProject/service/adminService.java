package SpringProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import SpringProject.model.City;
import SpringProject.model.admindetails;
import SpringProject.repository.adminRepository;

@Service
public class adminService 
{
	adminRepository ads;
	
	private static String username="Bookmyshow";
	private static String password="Bookmyshow123";

	
	public String addadmindetails(admindetails ad,String username1,String password1)
	{				
		
		if(username.equals(username1))
		{
			if(password.equals(password1))
			{
			     ads.save(ad);	
			     return "succefully saved";
			}
			else
			{
				return "invalid passwod";
			}
		}
		else
		{
			return "invalid username";

		}
	}
	
	public String  deleteadmin(admindetails ad,String username1,String password1)
	{
		
		if(username.equals(username1))
		{
			if(password.equals(password1))
			{
				
				ads.deleteById(ad.getId());
				
			     return "succefully saved";
			}
			else
			{
				return "invalid passwod";
			}
		}
		else
		{
			return "invalid username";

		}

		
	
	}


}
