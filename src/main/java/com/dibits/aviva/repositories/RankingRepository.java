package com.dibits.aviva.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dibits.aviva.domain.Ranking;

@Repository
public interface RankingRepository extends JpaRepository<Ranking, Integer>{

}
