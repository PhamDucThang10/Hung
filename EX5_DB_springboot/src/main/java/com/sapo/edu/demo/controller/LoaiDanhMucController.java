package com.sapo.edu.demo.controller;

import com.sapo.edu.demo.entity.LoaiDanhMuc;
import com.sapo.edu.demo.service.LoaiDanhMucService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@RequestMapping("/loaiDanhMuc")
public class LoaiDanhMucController {
    private final LoaiDanhMucService loaiDanhMucService;

    public LoaiDanhMucController(LoaiDanhMucService loaiDanhMucService) {
        this.loaiDanhMucService = loaiDanhMucService;
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody LoaiDanhMuc loaiDanhMuc) {
        loaiDanhMucService.addLoaiDanhMuc(loaiDanhMuc);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<LoaiDanhMuc>> getAll() {
        List<LoaiDanhMuc> list = loaiDanhMucService.getAllLoaiDanhMuc();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LoaiDanhMuc> getById(@PathVariable Integer id) {
        LoaiDanhMuc loaiDanhMuc = loaiDanhMucService.getLoaiDanhMucById(id);
        return new ResponseEntity<>(loaiDanhMuc, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody LoaiDanhMuc loaiDanhMuc) {
        loaiDanhMuc.setId(id);
        loaiDanhMucService.updateLoaiDanhMuc(loaiDanhMuc);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        loaiDanhMucService.deleteLoaiDanhMuc(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
