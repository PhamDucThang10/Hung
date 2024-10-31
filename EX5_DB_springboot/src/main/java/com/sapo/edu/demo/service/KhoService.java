package com.sapo.edu.demo.service;
import com.sapo.edu.demo.entity.Kho;
import com.sapo.edu.demo.repository.KhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KhoService {
    @Autowired
    private KhoRepository khoRepository;

    // Lấy tất cả các kho
    public List<Kho> getAllKhos() {
        return khoRepository.findAll();
    }

    // Lấy kho theo ID
    public Optional<Kho> getKhoById(Integer id) {
        return khoRepository.findById(id);
    }

    // Thêm kho mới
    public Kho addKho(Kho kho) {
        return khoRepository.save(kho);
    }

    // Cập nhật kho
    public Kho updateKho(Integer id, Kho kho) {
        kho.setId(id);
        return khoRepository.save(kho);
    }

    // Xóa kho
    public void deleteKho(Integer id) {
        khoRepository.deleteById(id);
    }
}
