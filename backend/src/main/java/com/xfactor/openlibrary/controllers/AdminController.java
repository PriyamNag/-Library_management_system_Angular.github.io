package com.xfactor.openlibrary.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.xfactor.openlibrary.domain.Admin;

@RestController
@RequestMapping("admins")
public class AdminController {
    ArrayList<Admin> lAdmins = new ArrayList<>();

    @PostMapping("/saveAdmins")
    public Admin saveAdmin(@RequestBody Admin admin) {
        lAdmins.add(admin);
        return admin;
    }

    @GetMapping("/getAllAdmins")
    public ArrayList<Admin> getAllAdmins() {
        return lAdmins;
    }
}