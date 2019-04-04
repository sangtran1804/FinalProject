package com.example.finalproject;

import java.io.Serializable;

public class thuvien implements Serializable {
    private String tensach;
    private String theloai;
    private String soluong;
    private String tacgia;
    private String nxb;
    private int id;

    public thuvien(String tensach, String theloai, String soluong, int id, String tacgia, String nxb ) {
        this.tensach = tensach;
        this.theloai = theloai;
        this.soluong = soluong;
        this.id = id;
        this.tacgia = tacgia;
        this.nxb = nxb;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }
}
