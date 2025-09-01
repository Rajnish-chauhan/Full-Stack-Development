package com.cfs.SpringBootSecurityP03.service;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;


@Service
public class AccountService {

    @PreAuthorize("isAuthenticated")
    public String getBalance(){
        return "Fetch successfully 80000";
    }


@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String closeAccount(){
        return "Account Closed";
    }
}
