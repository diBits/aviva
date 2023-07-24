package com.dibits.aviva;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dibits.aviva.domain.Promotor;
import com.dibits.aviva.domain.Ranking;
import com.dibits.aviva.repositories.PromotorRepository;
import com.dibits.aviva.repositories.RankingRepository;

@SpringBootApplication
public class AvivaApplication implements CommandLineRunner {

	
	@Autowired
	private PromotorRepository promotorRepository;
	
	@Autowired
	private RankingRepository rankingRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(AvivaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		LocalDate data = LocalDate.now();
		
		
		Promotor prom1 = new Promotor(null, "Diogo Martins", 50, 27, "HP"); 
		Promotor prom2 = new Promotor(null, "Marcos Vinicius", 75, 5, "HP"); 
		Promotor prom3 = new Promotor(null, "Jeferson Xavier", 90, 85, "HP");
		
		Ranking cs = new Ranking(null, "Clientes em Sala", data);
		Ranking cv = new Ranking(null, "Vendas", data);
		Ranking ef = new Ranking(null, "Eficiência", data);
		
		prom1.getRankings().addAll(Arrays.asList(cs,cv,ef));
		prom2.getRankings().addAll(Arrays.asList(cs,cv,ef));
		prom3.getRankings().addAll(Arrays.asList(cs,cv,ef));
		
		cs.getPromotores().addAll(Arrays.asList(prom1,prom2,prom3));
		cv.getPromotores().addAll(Arrays.asList(prom1,prom2,prom3));
		ef.getPromotores().addAll(Arrays.asList(prom1,prom2,prom3));
		
		
		promotorRepository.saveAll(Arrays.asList(prom1, prom2, prom3));
		rankingRepository.saveAll(Arrays.asList(cs, cv, ef));
		
		
	}

}
