package com.cfs.SpringBootSecurityP02.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    @GetMapping("/contactus")
    public String contactUs() {
        return "Contact us at:9127603275";
    }


    @GetMapping("/transfer")
    public String transfer() {
        return "Contact us at:9127603275";
    }


    @GetMapping("/admin")
    public String admin() {
        return "Welcome Admin";
    }


    @GetMapping("/about")
    public String about() {
        return "SBI bank";
    }
}

