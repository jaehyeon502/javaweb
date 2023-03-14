package com.springst.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springst.board.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
    
    public boolean existsByEmail(String email);
    public boolean existsBytelNumber(String telNumber);

}
