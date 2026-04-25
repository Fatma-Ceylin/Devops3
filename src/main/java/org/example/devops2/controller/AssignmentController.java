package org.example.devops2.controller;

import org.example.devops2.dto.AssignmentDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/assignments")
public class AssignmentController {

    // 1. Service bağımlılığını tamamen yorum satırı yaptık
    // private final AssignmentService assignmentService;

    // 2. Constructor'ı boşalttık
    public AssignmentController() {
    }

    @GetMapping
    public ResponseEntity<List<AssignmentDTO>> getAllAssignments() {
        // 3. Veritabanı yerine boş bir liste dönüyoruz (Uygulama çökmesin diye)
        return ResponseEntity.ok(new ArrayList<>());
    }

    // Sunumda göstermek için bu yeni metodu ekle!
    // Tarayıcıdan buna gideceğiz: http://54.198.27.230/api/assignments/status
    @GetMapping("/status")
    public String getStatus() {
        return "SWE304 DevOps Projesi: CI/CD Hattı ve AWS Yayını Başarılı! - Fatma Ceylin Ayçiçek";
    }

    // Diğer metotları da hata vermemesi için basitçe 'null' dönecek hale getirebilirsin
    @GetMapping("/get/{id}")
    public ResponseEntity<AssignmentDTO> getAssignmentById(@PathVariable Long id) {
        return ResponseEntity.ok(null);
    }
}