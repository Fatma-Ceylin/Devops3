package org.example.devops2.controller;

import org.example.devops2.dto.VehicleDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    // 1. Service bağımlılığını yorum satırı yap
    // private final VehicleService vehicleService;

    // 2. Constructor'ı parametresiz yap
    public VehicleController() {
    }

    @GetMapping
    public ResponseEntity<List<VehicleDTO>> getAllVehicles() {
        // 3. Boş bir liste dön ki çökmesin
        return ResponseEntity.ok(new ArrayList<>());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<VehicleDTO> getVehicleById(@PathVariable Long id) {
        return ResponseEntity.ok(null);
    }
}