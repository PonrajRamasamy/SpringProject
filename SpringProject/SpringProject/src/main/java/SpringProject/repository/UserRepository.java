package SpringProject.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.stereotype.Repository;

import SpringProject.model.UserDetails;
import SpringProject.service.MovieDetailsService;


@Repository
public interface UserRepository extends JpaRepository<UserDetails,Integer>
{
	

}
