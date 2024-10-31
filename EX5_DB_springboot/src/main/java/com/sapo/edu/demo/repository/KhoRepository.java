package com.sapo.edu.demo.repository;

import com.sapo.edu.demo.entity.Kho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface KhoRepository extends JpaRepository<Kho, Integer> {

    // Tìm tất cả kho (sẽ được cung cấp bởi JpaRepository)
    @Override
    List<Kho> findAll();

    // Tìm kho theo ID (sẽ được cung cấp bởi JpaRepository)
    @Override
    Optional<Kho> findById(Integer id);

    // Lưu kho mới hoặc cập nhật kho (sẽ được cung cấp bởi JpaRepository)
    @Override
    <S extends Kho> S save(S entity);

    // Xóa kho theo ID (sẽ được cung cấp bởi JpaRepository)
    @Override
    void deleteById(Integer id);

    // Tìm kho theo mã kho
    List<Kho> findByMaKho(String maKho);

    // Tìm kho theo tên kho
    List<Kho> findByTenKho(String tenKho);

    // Tìm kho theo địa điểm
    List<Kho> findByDiaDiem(String diaDiem);
}
