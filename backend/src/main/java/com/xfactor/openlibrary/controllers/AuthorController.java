package com.xfactor.openlibrary.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xfactor.openlibrary.domain.Author;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("authors")
public class AuthorController {
    ArrayList<Author> lAuthors = new ArrayList<>();

    @PostMapping("/saveAuthors")
    public Author saveAuthor(@RequestBody Author author) {
        lAuthors.add(author);
        return author;
    }

    @GetMapping("/getAllAuthors")
    public ArrayList<Author> getAllAuthors() {
        return lAuthors;
    }
}