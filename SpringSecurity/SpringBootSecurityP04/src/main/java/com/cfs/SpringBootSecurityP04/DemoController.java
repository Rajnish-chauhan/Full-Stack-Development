package com.cfs.SpringBootSecurityP04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class DemoController {

    @Autowired
    private UserService service;


    @PostMapping("/addUsers")
    public String addUsers(@RequestBody UserListRequest request)
    {
        service.saveUsers(request.getUsers());
        return "Users Added Successfully";
    }

    @GetMapping("/public")
    public String publicMethod(){
        return "This is public method";
    }
    @GetMapping("/admin")
    public String adminMethod(){
        return "This is admin method";
    }

    @GetMapping("/user")
    public String userMethod(){
        return "This is user method";
    }
}
