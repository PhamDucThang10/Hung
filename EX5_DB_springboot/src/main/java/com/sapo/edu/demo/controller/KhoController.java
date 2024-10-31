package com.sapo.edu.demo.controller;
import com.sapo.edu.demo.entity.Kho;
import com.sapo.edu.demo.service.KhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@RestController
//@RequestMapping("/khos")
public class KhoController {
//    @Autowired
    private KhoService khoService;

    @GetMapping
    public List<Kho> getAllKhos() {
        return khoService.getAllKhos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Kho> getKhoById(@PathVariable Integer id) {
        Optional<Kho> kho = khoService.getKhoById(id);
        return kho.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Kho addKho(@RequestBody Kho kho) {
        return khoService.addKho(kho);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Kho> updateKho(@PathVariable Integer id, @RequestBody Kho kho) {
        return ResponseEntity.ok(khoService.updateKho(id, kho));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteKho(@PathVariable Integer id) {
        khoService.deleteKho(id);
        return ResponseEntity.noContent().build();
    }
}
