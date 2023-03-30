package SpringProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SpringProject.model.MovieDetails;

@Repository
public interface MovieDetailsRepository extends JpaRepository<MovieDetails,Integer>
{

	
}
