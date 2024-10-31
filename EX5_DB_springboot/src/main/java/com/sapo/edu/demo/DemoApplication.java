package com.sapo.edu.demo;

import java.util.Scanner;

import com.sapo.edu.demo.entity.Kho;
import com.sapo.edu.demo.entity.LoaiDanhMuc;
import com.sapo.edu.demo.entity.SanPham;
import com.sapo.edu.demo.service.KhoService;
import com.sapo.edu.demo.service.LoaiDanhMucService;
import com.sapo.edu.demo.service.SanPhamService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    private final KhoService khoService;
    private final LoaiDanhMucService loaiDanhMucService;
    private final SanPhamService sanPhamService;

    // Constructor injection
    public DemoApplication(KhoService khoService, LoaiDanhMucService loaiDanhMucService, SanPhamService sanPhamService) {
        this.khoService = khoService;
        this.loaiDanhMucService = loaiDanhMucService;
        this.sanPhamService = sanPhamService;
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println("hello everyone!");
//        // In danh sách các kho
////        System.out.println("Danh sach cac kho:");
////        List<Kho> listKhos = khoService.getAllKhos();
////        for (Kho kho : listKhos) {
////            System.out.println("ID: " + kho.getId() + ", Ma kho: " + kho.getMaKho() + ", Ten kho: " + kho.getTenKho() + ", Dia diem: " + kho.getDiaDiem());
////        }
////
////        // In danh sách loại danh mục
////        System.out.println("\nDanh sach loai danh muc:");
////        List<LoaiDanhMuc> listLoaiDanhMuc = loaiDanhMucService.getAllLoaiDanhMuc();
////        for (LoaiDanhMuc loaiDanhMuc : listLoaiDanhMuc) {
////            System.out.println("ID: " + loaiDanhMuc.getId() + ", Ma loai: " + loaiDanhMuc.getMaLoaiDanhMuc() + ", Ten loai: " + loaiDanhMuc.getTenLoaiDanhMuc());
////        }
////
////        // In danh sách sản phẩm
////        System.out.println("\nDanh sach san pham:");
////        List<SanPham> listSanPham = sanPhamService.getAllSanPham();
////        for (SanPham sanPham : listSanPham) {
////            System.out.println("ID: " + sanPham.getId() + ", Ma san pham: " + sanPham.getMaSanPham() + ", Ten san pham: " + sanPham.getTenSanPham() + ", Gia: " + sanPham.getGia());
////        }
//    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Quan ly Kho");
            System.out.println("2. Quản lý Loai Danh Muc");
            System.out.println("3. Quản lý San Pham");
            System.out.println("0. Thoat");
            System.out.print("Chon muc: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ newline

            switch (choice) {
                case 1:
                    khoMenu(scanner);
                    break;
                case 2:
                    loaiDanhMucMenu(scanner);
                    break;
                case 3:
                    sanPhamMenu(scanner);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    return;
                default:
                    System.out.println("Lua chon khong hop le! Vui long chon lai!.");
            }
        }
    }

    // Menu cho từng loại quản lý
    private void khoMenu(Scanner scanner) {
        System.out.println("=== Quan ly Kho ===");
        System.out.println("1. Them Kho");
        System.out.println("2. Cap nhat Kho");
        System.out.println("3. Xoa Kho");
        System.out.println("4. Xem danh sach Kho");
        System.out.print("Chon chuc nang: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
//                khoService.addKho();
                break;
            case 2:
//                khoService.updateKho();
                break;
            case 3:
                System.out.print("[+] Nhap id kho muon xoa: ");
//                khoService.deleteKho();
                break;
            case 4:
                khoService.getAllKhos();
                break;
            default:
                System.out.println("Lua chon khong hop le! Vui long chon lai!");
        }
    }

    private void loaiDanhMucMenu(Scanner scanner) {
        System.out.println("=== Quan ly Loai Danh Muc ===");
        System.out.println("1. Them Loai Danh Muc");
        System.out.println("2. Cap nhat Loai Danh Muc");
        System.out.println("3. Xoa Loai Danh Muc");
        System.out.println("4. Xem danh sach Loai Danh Muc");
        System.out.print("Chon chuc nang: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
//                loaiDanhMucService.addLoaiDanhMuc();
                break;
            case 2:
//                loaiDanhMucService.updateLoaiDanhMuc();
                break;
            case 3:
//                loaiDanhMucService.deleteLoaiDanhMuc();
                break;
            case 4:
                loaiDanhMucService.getAllLoaiDanhMuc();
                break;
            default:
                System.out.println("Lua chon khong hop le! Vui long chon lai!");
        }
    }

    private void sanPhamMenu(Scanner scanner) {
        System.out.println("=== Quan ly San Pham ===");
        System.out.println("1. Them San Pham");
        System.out.println("2. Cap nhat San Pham");
        System.out.println("3. Xoa San Pham");
        System.out.println("4. Xem danh sach San Pham");
        System.out.print("Chon chuc nang: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
//                sanPhamService.addSanPham();
                break;
            case 2:
//                sanPhamService.updateSanPham();
                break;
            case 3:
//                sanPhamService.deleteSanPham();
                break;
            case 4:
                sanPhamService.getAllSanPham();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
    }
}
