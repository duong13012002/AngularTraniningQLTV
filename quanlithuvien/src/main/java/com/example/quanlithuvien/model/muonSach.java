package com.example.quanlithuvien.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "NG_DUONG_MUON_SACH")
public class muonSach {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "ID_BAN_DOC")
    private banDoc banDoc;

    @ManyToOne
    @JoinColumn(name = "ID_SACH")
    private Sach sach;

    @Column(name = "SO_LUONG")
    private int soLuong;

    @Column(name = "NGAY_MUON")
    private Date date_borrow;

    @Column(name = "NGAY_TRA")
    private Date date_return;

    @Column(name = "TRANG_THAI")
    private Integer trang_thai;

    @Column(name = "GHI_CHU")
    private String ghi_chu;

}
