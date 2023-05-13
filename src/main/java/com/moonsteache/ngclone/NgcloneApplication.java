package com.moonsteache.ngclone;

import com.moonsteache.ngclone.dao.HumanRepository;
import com.moonsteache.ngclone.model.HumanEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class NgcloneApplication {
	@Autowired
	HumanRepository humanRepository;

	public static void main(String[] args) {
		SpringApplication.run(NgcloneApplication.class, args);
	}

	@GetMapping("/humans")
	List<HumanEntity> all() {
		humanRepository.save(HumanEntity.builder().name("Dormon").build());
		return humanRepository.findAll();
	}
}
