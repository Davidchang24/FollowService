package com.chessworkz.followingservice.service;

import com.chessworkz.followingservice.model.Follow;
import com.chessworkz.followingservice.repository.FollowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FollowService {
    @Autowired
    private FollowRepository followRepository;

    public List<Follow> getAllFollows() {return followRepository.findAll();}

    public ResponseEntity<String> postFollow(Follow follow) {
        if(followRepository.save(follow) == follow) {
            return new ResponseEntity<String>("Follow has been saved", HttpStatus.OK);
        } else
            return new ResponseEntity<String>("Follow hasn't been saved", HttpStatus.OK);
    }

    public List<Follow> getAllFollowsByEmail(String email) {    return followRepository.findByEmail(email); }
}
