package com.carlos.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.carlos.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
