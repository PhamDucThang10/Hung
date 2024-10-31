package com.sapo.edu.demo.service;

import com.sapo.edu.demo.entity.SanPham;
import com.sapo.edu.demo.repository.SanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
public class SanPhamService {

    @Autowired
    private SanPhamRepository sanPhamRepository;

    public List<SanPham> getAllSanPham() {
        return sanPhamRepository.findAll();
    }

    public Optional<SanPham> getSanPhamById(Integer id) {
        return sanPhamRepository.findById(id);
    }

    public SanPham createSanPham(@Valid SanPham sanPham) {
        // Validate dữ liệu trước khi lưu
        if (sanPham.getTenSanPham() == null || sanPham.getTenSanPham().isEmpty()) {
            throw new IllegalArgumentException("Tên sản phẩm không được để trống");
        }
        return sanPhamRepository.save(sanPham);
    }

    public SanPham updateSanPham(Integer id, @Valid SanPham sanPham) {
        if (!sanPhamRepository.existsById(id)) {
            throw new IllegalArgumentException("Sản phẩm không tồn tại với ID: " + id);
        }
        sanPham.setId(id);
        return sanPhamRepository.save(sanPham);
    }

    public void deleteSanPham(Integer id) {
        if (!sanPhamRepository.existsById(id)) {
            throw new IllegalArgumentException("Sản phẩm không tồn tại với ID: " + id);
        }
        sanPhamRepository.deleteById(id);
    }
}

