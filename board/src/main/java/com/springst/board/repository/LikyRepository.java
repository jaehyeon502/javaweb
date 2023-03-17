package com.springst.board.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springst.board.entity.LikyEntity;
import com.springst.board.entity.primaryKey.LikyPk;

@Repository
public interface LikyRepository extends JpaRepository<LikyEntity, LikyPk> {
    
    public List<LikyEntity> findByBoardNumber(int boardNumber);

}