package com.cfs.SpringBootSecurityP03.controller;


import com.cfs.SpringBootSecurityP03.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BankController {


    @Autowired
    AccountService service;

    @GetMapping("/balance")
    public String getBalance(){
        return service.getBalance();

    }

    @PostMapping("/close")
    public String closeAccount(){

        return service.closeAccount();
    }

    @GetMapping("/about")
    public String about(){

        return "Hello Welcome...";
    }
    @GetMapping("/whoami")
    public String whoami(Authentication auth) {
        return "User: " + auth.getName() + " | Authorities: " + auth.getAuthorities();
    }

}
