package com.springst.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springst.board.entity.RelatedSearchWordEntity;

@Repository
public interface RelatedSearchWordRepository extends JpaRepository<RelatedSearchWordEntity, Integer> {
    
}
