package com.sapo.edu.demo.repository;

import com.sapo.edu.demo.entity.LoaiDanhMuc;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LoaiDanhMucRepository {
    private final JdbcTemplate jdbcTemplate;

    public LoaiDanhMucRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Create
    public void addLoaiDanhMuc(LoaiDanhMuc loaiDanhMuc) {
        String sql = "INSERT INTO loai_danh_muc (ma_loai_danh_muc, ten_loai_danh_muc, mo_ta) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, loaiDanhMuc.getMaLoaiDanhMuc(), loaiDanhMuc.getTenLoaiDanhMuc(), loaiDanhMuc.getMoTa());
    }

    // Read all
    public List<LoaiDanhMuc> getAllLoaiDanhMuc() {
        String sql = "SELECT * FROM loai_danh_muc";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            LoaiDanhMuc loaiDanhMuc = new LoaiDanhMuc();
            loaiDanhMuc.setId(rs.getInt("id"));
            loaiDanhMuc.setMaLoaiDanhMuc(rs.getString("ma_loai_danh_muc"));
            loaiDanhMuc.setTenLoaiDanhMuc(rs.getString("ten_loai_danh_muc"));
            loaiDanhMuc.setMoTa(rs.getString("mo_ta"));
            loaiDanhMuc.setNgayTao(rs.getTimestamp("ngay_tao").toLocalDateTime());
            loaiDanhMuc.setNgaySua(rs.getTimestamp("ngay_sua").toLocalDateTime());
            return loaiDanhMuc;
        });
    }

    // Read by ID
    public LoaiDanhMuc getLoaiDanhMucById(Integer id) {
        String sql = "SELECT * FROM loai_danh_muc WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) -> {
            LoaiDanhMuc loaiDanhMuc = new LoaiDanhMuc();
            loaiDanhMuc.setId(rs.getInt("id"));
            loaiDanhMuc.setMaLoaiDanhMuc(rs.getString("ma_loai_danh_muc"));
            loaiDanhMuc.setTenLoaiDanhMuc(rs.getString("ten_loai_danh_muc"));
            loaiDanhMuc.setMoTa(rs.getString("mo_ta"));
            loaiDanhMuc.setNgayTao(rs.getTimestamp("ngay_tao").toLocalDateTime());
            loaiDanhMuc.setNgaySua(rs.getTimestamp("ngay_sua").toLocalDateTime());
            return loaiDanhMuc;
        });
    }

    // Update
    public void updateLoaiDanhMuc(LoaiDanhMuc loaiDanhMuc) {
        String sql = "UPDATE loai_danh_muc SET ma_loai_danh_muc = ?, ten_loai_danh_muc = ?, mo_ta = ? WHERE id = ?";
        jdbcTemplate.update(sql, loaiDanhMuc.getMaLoaiDanhMuc(), loaiDanhMuc.getTenLoaiDanhMuc(), loaiDanhMuc.getMoTa(), loaiDanhMuc.getId());
    }

    // Delete
    public void deleteLoaiDanhMuc(Integer id) {
        String sql = "DELETE FROM loai_danh_muc WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}
