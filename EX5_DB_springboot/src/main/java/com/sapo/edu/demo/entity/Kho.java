package com.sapo.edu.demo.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "kho")
public class Kho {  // Đổi tên lớp từ 'kho' thành 'Kho'
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Ma kho khong duoc de trong")
    @Column(name = "ma_kho", nullable = false)
    private String maKho;

    @NotBlank(message = "Ten kho khong duoc de trong")
    @Column(name = "ten_kho", nullable = false)
    private String tenKho;

    @NotBlank(message = "Dia diem khong duoc de trong")
    @Column(name = "dia_diem", nullable = false)
    private String diaDiem;

    @CreationTimestamp
    @Column(name = "ngay_tao", updatable = false)
    private LocalDateTime ngayTao;

    @UpdateTimestamp
    @Column(name = "ngay_sua")
    private LocalDateTime ngaySua;

    // Constructors
    public Kho() {}

    public Kho(String maKho, String tenKho, String diaDiem) {
        this.maKho = maKho;
        this.tenKho = tenKho;
        this.diaDiem = diaDiem;
        this.ngayTao = LocalDateTime.now();
        this.ngaySua = LocalDateTime.now();
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaKho() {
        return maKho;
    }

    public void setMaKho(String maKho) {
        this.maKho = maKho;
    }

    public String getTenKho() {
        return tenKho;
    }

    public void setTenKho(String tenKho) {
        this.tenKho = tenKho;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
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


