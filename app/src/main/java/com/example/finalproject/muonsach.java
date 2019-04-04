package com.example.finalproject;

import java.io.Serializable;

public class muonsach implements Serializable
{
    private String tennguoimuon;
    private String tensachmuon;
    private String soluong;

    public muonsach(String tennguoimuon, String tensachmuon, String soluong) {
        this.tennguoimuon = tennguoimuon;
        this.tensachmuon = tensachmuon;
        this.soluong = soluong;
    }

    public String getTennguoimuon() {
        return tennguoimuon;
    }

    public void setTennguoimuon(String tennguoimuon) {
        this.tennguoimuon = tennguoimuon;
    }

    public String getTensachmuon() {
        return tensachmuon;
    }

    public void setTensachmuon(String tensachmuon) {
        this.tensachmuon = tensachmuon;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }
}
