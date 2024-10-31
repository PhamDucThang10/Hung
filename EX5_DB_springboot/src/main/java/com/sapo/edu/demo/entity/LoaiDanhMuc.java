package com.sapo.edu.demo.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "loai_danh_muc")
public class LoaiDanhMuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Khong duoc de trong ma loai danh muc")
    @Column(name = "ma_loai_danh_muc", nullable = false)
    private String maLoaiDanhMuc;

    @NotBlank(message = "Khong duoc de trong ten loai danh muc")
    @Column(name = "ten_loai_danh_muc", nullable = false)
    private String tenLoaiDanhMuc;

    @Column(name = "mo_ta")
    private String moTa;

    @CreationTimestamp
    @Column(name = "ngay_tao", updatable = false)
    private LocalDateTime ngayTao;

    @UpdateTimestamp
    @Column(name = "ngay_sua")
    private LocalDateTime ngaySua;

    // Constructors, getters, and setters
    public LoaiDanhMuc() {}

    public LoaiDanhMuc(String maLoaiDanhMuc, String tenLoaiDanhMuc, String moTa, LocalDateTime ngayTao, LocalDateTime ngaySua) {
        this.maLoaiDanhMuc = maLoaiDanhMuc;
        this.tenLoaiDanhMuc = tenLoaiDanhMuc;
        this.moTa = moTa;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
    }

    //Getter and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaLoaiDanhMuc() {
        return maLoaiDanhMuc;
    }

    public void setMaLoaiDanhMuc(String maLoaiDanhMuc) {
        this.maLoaiDanhMuc = maLoaiDanhMuc;
    }

    public String getTenLoaiDanhMuc() {
        return tenLoaiDanhMuc;
    }

    public void setTenLoaiDanhMuc(String tenLoaiDanhMuc) {
        this.tenLoaiDanhMuc = tenLoaiDanhMuc;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public LocalDateTime getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDateTime ngayTao) {
        this.ngayTao = ngayTao;
    }

    public LocalDateTime getNgaySua() {
        return ngaySua;
    }

    public void setNgaySua(LocalDateTime ngaySua) {
        this.ngaySua = ngaySua;
    }
}
