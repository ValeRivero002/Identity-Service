package com.example.Identity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdentityController {

    @Autowired
    private IdentityService identityService;

    @GetMapping("/verify-ci")
    public boolean verifyCI(@RequestParam(value = "ci") String ci) {
        return identityService.verifyCI(ci);
    }
}
