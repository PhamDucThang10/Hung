package com.sapo.edu.demo.repository;

import com.sapo.edu.demo.entity.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SanPhamRepository extends JpaRepository<SanPham, Integer> {
}

