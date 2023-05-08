package com.review2.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.review2.demo.model.PlayerParent;

@Repository
public interface PlayerParentRepo extends JpaRepository<PlayerParent,Long>{

}
