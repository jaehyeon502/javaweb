package com.springst.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springst.board.entity.SearchWordLogEntity;

@Repository
public interface SearchWordLogRepository extends JpaRepository<SearchWordLogEntity, Integer> {
    
}
