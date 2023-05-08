package com.review2.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.review2.demo.model.Football;
@Repository
public interface FootballRepository extends JpaRepository <Football,Integer>
{
	List<Football> findByNameStartingWith(String prefix);
	List<Football> findByNameEndingWith(String suffix);
    List<Football> findByCountry(String country);
  //positional parameter,order should match
  		@Query("select f from Football f where f.country=?1 and f.name=?2")
  	     public List<Football> getPlayerByCountry(String country,String name);
  		
          //named parameter
          @Query("select f from Football f where f.country=:country")
  	    public List<Football> getPlayerByCountry(String country);
          
  		//DML
  		@Modifying
  		@Query("delete from Football f where f.name=?1")
  		public int deletePlayerByName(String name);
  		
          @Modifying
          @Query("update Football f set f.country=?1 where f.name=?2")
          public int updatePlayerByName(String country,String name);
          
          @Query(value="select * from Football f where f.country=?",nativeQuery=true)
          public List<Football> fetchPlayerByCount(String country);
          
         
}
