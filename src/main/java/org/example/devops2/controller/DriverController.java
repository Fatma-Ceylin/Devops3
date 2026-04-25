package org.example.devops2.controller;

import org.example.devops2.dto.DriverDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/drivers")
public class DriverController {

    // 1. DriverService bağımlılığını yorum satırı yapıyoruz
    // private final DriverService driverService;

    // 2. Constructor'ı parametresiz hale getiriyoruz
    public DriverController() {
    }

    @GetMapping
    public ResponseEntity<List<DriverDTO>> getAllDrivers() {
        // 3. Servis çağrısı yerine boş liste dönüyoruz
        return ResponseEntity.ok(new ArrayList<>());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<DriverDTO> getDriverById(@PathVariable Long id) {
        return ResponseEntity.ok(null);
    }

    // Diğer metotları da benzer şekilde sadeleştirebilirsin...
}