package com.mclabs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mclabs.model.Person;

@Repository
public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {

}
