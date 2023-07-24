package com.dibits.aviva.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dibits.aviva.domain.Promotor;

@Repository
public interface PromotorRepository extends JpaRepository<Promotor, Integer>{

}
