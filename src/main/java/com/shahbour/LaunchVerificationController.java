package com.shahbour;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaunchVerificationController {

    @RequestMapping("/")
    public String verifyLaunch() {
        return "Launched";
    }

}
