package com.review2.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.review2.demo.model.Football;
@Repository
public interface FootballRepository extends JpaRepository <Football,Integer>
{
	List<Football> findByNameStartingWith(String prefix);
	List<Football> findByNameEndingWith(String suffix);
    List<Football> findByCountry(String country);
    Football findByusername(String username);
}
