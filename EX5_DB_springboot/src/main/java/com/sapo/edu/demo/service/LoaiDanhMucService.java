package com.sapo.edu.demo.service;

import com.sapo.edu.demo.entity.LoaiDanhMuc;
import com.sapo.edu.demo.repository.LoaiDanhMucRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoaiDanhMucService {
    private final LoaiDanhMucRepository loaiDanhMucRepository;

    public LoaiDanhMucService(LoaiDanhMucRepository loaiDanhMucRepository) {
        this.loaiDanhMucRepository = loaiDanhMucRepository;
    }

    public void addLoaiDanhMuc(LoaiDanhMuc loaiDanhMuc) {
        loaiDanhMucRepository.addLoaiDanhMuc(loaiDanhMuc);
    }

    public List<LoaiDanhMuc> getAllLoaiDanhMuc() {
        return loaiDanhMucRepository.getAllLoaiDanhMuc();
    }

    public LoaiDanhMuc getLoaiDanhMucById(Integer id) {
        return loaiDanhMucRepository.getLoaiDanhMucById(id);
    }

    public void updateLoaiDanhMuc(LoaiDanhMuc loaiDanhMuc) {
        loaiDanhMucRepository.updateLoaiDanhMuc(loaiDanhMuc);
    }

    public void deleteLoaiDanhMuc(Integer id) {
        loaiDanhMucRepository.deleteLoaiDanhMuc(id);
    }
}
