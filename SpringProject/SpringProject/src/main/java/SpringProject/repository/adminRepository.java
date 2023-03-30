package SpringProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SpringProject.model.admindetails;

@Repository
public interface adminRepository extends JpaRepository<admindetails,Integer>
{
	

}
