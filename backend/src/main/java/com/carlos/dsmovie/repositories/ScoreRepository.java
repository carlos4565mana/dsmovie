package com.carlos.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.dsmovie.entities.Score;
import com.carlos.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
