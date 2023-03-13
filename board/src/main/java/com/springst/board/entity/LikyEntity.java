package com.springst.board.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.springst.board.entity.primaryKey.LikyPK;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Liky")
@Table(name="Liky")
public class LikyEntity {

    @EmbeddedId
    private LikyPK userEmail;

    private String userProfileUrl;
    private String userNickname;
}
