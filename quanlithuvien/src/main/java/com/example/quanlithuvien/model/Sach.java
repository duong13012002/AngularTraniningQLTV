package com.example.quanlithuvien.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "NG_DUONG_SACH")
public class Sach {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int id;

    @Column(name = "MA")
    private int maSach;

    @Column(name = "TEN")
    private String name;

    @ManyToOne
    @JoinColumn(name = "ID_NXB")
    private nhaXuatBan nhaXuatBan;

    @ManyToOne
    @JoinColumn(name = "ID_TACGIA")
    private tacGia tacGia;

    @Column(name = "CHU_DE")
    private String content;

    @Column(name = "NAM_XUAT_BAN")
    private Date namxuatban;

    @Column(name = "MO_TA")
    private String mota;

    @Column(name = "SL_CON_LAI")
    private int soLuongConLai;
    @Column(name = "SL_DANG_MUON")
    private int soLuongDangMuon;

    @Column(name = "TONG_SACH")
    private int toTal;

}
