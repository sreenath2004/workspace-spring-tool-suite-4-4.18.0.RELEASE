package com.review2.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.review2.demo.model.PlayerChild;

@Repository
public interface PlayerChildRepo extends JpaRepository<PlayerChild,Long> {

}
