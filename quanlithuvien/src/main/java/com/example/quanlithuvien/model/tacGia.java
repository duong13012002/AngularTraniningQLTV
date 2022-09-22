package com.example.quanlithuvien.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "NG_DUONG_TAC_GIA")
public class tacGia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int id;

    @Column(name = "MA")
    private int maTacGia;

    @Column(name = "TEN")
    private String name;

    @Column(name = "DIA_CHI")
    private String address;

    @Column(name = "SDT")
    private String phone;

    @Column(name = "MO_TA")
    private String mota;

}
