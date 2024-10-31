package com.sapo.edu.demo.entity;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "san_pham")
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Khong duoc de trong ma san pham")
    @Column(name = "ma_san_pham", nullable = false)
    private String maSanPham;

    @ManyToOne
    @JoinColumn(name = "id_danh_muc")
    private LoaiDanhMuc loaiDanhMuc;

    @ManyToOne
    @JoinColumn(name = "id_kho")
    private Kho kho;

    @NotBlank(message = "Khong duoc de trong ten san pham")
    @Column(name = "ten_san_pham", nullable = false)
    private String tenSanPham;

    @NotNull(message = "Giá không được để trống")
    @DecimalMin(value = "0.0", inclusive = false, message = "Giá phải lớn hơn 0")
    @Column(name = "gia", nullable = false)
    private BigDecimal gia;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "duong_dan_anh")
    private String duongDanAnh;

    @Column(name = "so_luong",nullable = false, columnDefinition = "int default 0")
    private Integer soLuong = 0;

    @Column(name = "so_luong_da_ban", nullable = false, columnDefinition = "int default 0")
    private Integer soLuongDaBan = 0;


    @CreationTimestamp
    @Column(name = "ngay_tao", updatable = false)
    private LocalDateTime ngayTao;

    @UpdateTimestamp
    @Column(name = "ngay_sua")
    private LocalDateTime ngaySua;

    // Constructors, getters, and setters

    public SanPham() {}

    // Constructor with fields
    public SanPham(String maSanPham, LoaiDanhMuc loaiDanhMuc, Kho kho, String tenSanPham, BigDecimal gia,
                   String moTa, String duongDanAnh, Integer soLuong, Integer soLuongDaBan,
                   LocalDateTime ngayTao, LocalDateTime ngaySua) {
        this.maSanPham = maSanPham;
        this.loaiDanhMuc = loaiDanhMuc;
        this.kho = kho;
        this.tenSanPham = tenSanPham;
        this.gia = gia;
        this.moTa = moTa;
        this.duongDanAnh = duongDanAnh;
        this.soLuong = soLuong;
        this.soLuongDaBan = soLuongDaBan;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
    }

    // Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public LoaiDanhMuc getLoaiDanhMuc() {
        return loaiDanhMuc;
    }

    public void setLoaiDanhMuc(LoaiDanhMuc loaiDanhMuc) {
        this.loaiDanhMuc = loaiDanhMuc;
    }

    public Kho getKho() {
        return kho;
    }

    public void setKho(Kho kho) {
        this.kho = kho;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public BigDecimal getGia() {
        return gia;
    }

    public void setGia(BigDecimal gia) {
        this.gia = gia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getDuongDanAnh() {
        return duongDanAnh;
    }

    public void setDuongDanAnh(String duongDanAnh) {
        this.duongDanAnh = duongDanAnh;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Integer getSoLuongDaBan() {
        return soLuongDaBan;
    }

    public void setSoLuongDaBan(Integer soLuongDaBan) {
        this.soLuongDaBan = soLuongDaBan;
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
