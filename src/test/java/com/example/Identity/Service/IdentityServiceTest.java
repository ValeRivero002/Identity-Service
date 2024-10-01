package com.example.Identity.Service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
public class IdentityServiceTest {

    @Autowired
    private IdentityService identityService;

    @Test
    public void testVerifyCI() {
        assertTrue(identityService.verifyCI("12345678"));
        assertFalse(identityService.verifyCI("87654321"));
    }
}
