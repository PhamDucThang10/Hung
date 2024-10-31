package com.sapo.edu.demo.controller;

import com.sapo.edu.demo.entity.SanPham;
import com.sapo.edu.demo.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

//@RestController
@RequestMapping("/sanPham")
public class SanPhamController {

//    @Autowired
    private SanPhamService sanPhamService;

    @GetMapping
    public List<SanPham> getAllSanPham() {
        return sanPhamService.getAllSanPham();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SanPham> getSanPhamById(@PathVariable Integer id) {
        return sanPhamService.getSanPhamById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public SanPham createSanPham(@Valid @RequestBody SanPham sanPham) {
        return sanPhamService.createSanPham(sanPham);
    }

    @PutMapping("/{id}")
    public SanPham updateSanPham(@PathVariable Integer id, @Valid @RequestBody SanPham sanPham) {
        return sanPhamService.updateSanPham(id, sanPham);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSanPham(@PathVariable Integer id) {
        sanPhamService.deleteSanPham(id);
        return ResponseEntity.noContent().build();
    }
}
