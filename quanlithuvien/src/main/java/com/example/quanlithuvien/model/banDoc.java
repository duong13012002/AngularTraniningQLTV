package com.example.quanlithuvien.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "NG_DUONG_BAN_DOC")
public class banDoc {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int id;

    @Column(name = "MA")
    private int maBanDoc;
    @Column(name = "TEN")
    private String name;
    @Column(name = "DIA_CHI")
    private String address;

    @Column(name = "SDT")
    private String phone;

    @Column(name = "NGAY_TAO")
    private Date date_of_account;

    @Column(name = "NGAY_SINH")
    private Date date_of_birth;

    @Column(name = "HANG")
    private Integer rank;

}
