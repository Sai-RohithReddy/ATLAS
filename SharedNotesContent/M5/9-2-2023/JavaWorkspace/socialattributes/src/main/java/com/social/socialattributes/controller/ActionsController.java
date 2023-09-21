package com.social.socialattributes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.social.socialattributes.entity.Actions;
import com.social.socialattributes.repository.SocialRepo;

@RestController
public class ActionsController {

    @Autowired
    private SocialRepo socialRepo;

    @PostMapping("/social")
    public Actions savePost(@RequestBody Actions social) {
        return socialRepo.save(social);
    }

    @GetMapping("/social/{id}")
    public Actions getpost(@PathVariable("id") String postId) {
        return socialRepo.getpostbyId(postId);
    }

    @DeleteMapping
    public String deletepost(@PathVariable("id") String postId) {
        return socialRepo.delete(postId);
    }

    @PutMapping
    public String updateAction(@PathVariable("id") String postId, @RequestBody Actions social) {
        return socialRepo.update(postId, social);
    }

}
