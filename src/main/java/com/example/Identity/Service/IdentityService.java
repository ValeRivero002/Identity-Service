package com.example.Identity.Service;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class IdentityService {

    // Simulación de una base de datos con un conjunto de CIs válidos
    private Set<String> validCIs;

    public IdentityService() {
        validCIs = new HashSet<>();
        // Agregar algunos CIs válidos a la simulación
        validCIs.add("12345678");
        validCIs.add("87654321");
        validCIs.add("11223344");
    }

    // Método para verificar si un CI existe
    public boolean verifyCI(String ci) {
        return validCIs.contains(ci);
    }
}
