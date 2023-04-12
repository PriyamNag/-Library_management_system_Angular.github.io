package com.xfactor.openlibrary.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xfactor.openlibrary.domain.Publisher;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("publishers")
public class PublisherController {
    ArrayList<Publisher> lPublishers = new ArrayList<>();

    @PostMapping("/savePublishers")
    public Publisher savePublisher(@RequestBody Publisher publisher) {
        lPublishers.add(publisher);
        return publisher;
    }

    @GetMapping("/getAllPublishers")
    public ArrayList<Publisher> getAllPublishers() {
        return lPublishers;
    }
}