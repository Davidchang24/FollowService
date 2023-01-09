package com.chessworkz.followingservice.controller;

import com.chessworkz.followingservice.model.Follow;
import com.chessworkz.followingservice.service.FollowService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/follow")
public class FollowController {
    private final FollowService followService;

    public FollowController(FollowService service) {
        this.followService = service;
    }

    @GetMapping("/all")
    public List<Follow> getAllFollows() {
        return followService.getAllFollows();
    }

    @GetMapping("/all/{email}")
    public List<Follow> getAllFollowsByEmail(@PathVariable String email){ return followService.getAllFollowsByEmail(email);}

    @PostMapping("/post")
    public ResponseEntity<String> postFollow(@RequestBody Follow follow) {
        ResponseEntity<String> newFollow = followService.postFollow(follow);
        return newFollow;
    }

}
