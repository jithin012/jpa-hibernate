package com.mclabs.jpahybernet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.mclabs.repository.PersonSpringDataRepository;

//import com.mclabs.repository.PersonJpaRepository;

@SpringBootApplication
@EntityScan("com.mclabs.model")
//@ComponentScans({ @ComponentScan("com.mclabs.repository") })
@EnableJpaRepositories("com.mclabs.repository")
public class JpaHybernetApplication implements CommandLineRunner {

	@Autowired
	PersonSpringDataRepository personJpaRepository;
	// PersonJpaRepository personJpaRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaHybernetApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("launch as soon as application Context is ready");
		System.out.println("User id 10001: get " + personJpaRepository.findById(10001));
//		System.out.println("Inserting " + personJpaRepository.save(new Person("Rob", "Kerala", new Date())));
//		System.out.println("Updating " + personJpaRepository.save(new Person(4, "Kevin", "India", new Date())));
//		personJpaRepository.deleteById(5);
		System.out.println("all users " + personJpaRepository.findAll());
	}

}
