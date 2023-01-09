package com.chessworkz.followingservice.repository;

import com.chessworkz.followingservice.model.Follow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FollowRepository extends JpaRepository<Follow, Long> {
    List<Follow> findByEmail(String email);
}
