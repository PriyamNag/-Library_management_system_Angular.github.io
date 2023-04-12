package com.xfactor.openlibrary.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xfactor.openlibrary.domain.Loan;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("loans")
public class LoanController {
    ArrayList<Loan> lLoans = new ArrayList<>();

    @PostMapping("/saveLoans")
    public Loan saveLoan(@RequestBody Loan loan) {
        lLoans.add(loan);
        return loan;
    }

    @GetMapping("/getAllLoans")
    public ArrayList<Loan> getAllLoans() {
        return lLoans;
    }
}