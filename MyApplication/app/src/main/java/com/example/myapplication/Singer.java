package com.example.myapplication;


public class Singer {
    private String Ten;
    private String MoTa;
    private int Hinh;

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String moTa) {
        MoTa = moTa;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }

    public Singer(String ten, String moTa, int hinh){
        Ten = ten;
        MoTa = moTa;
        Hinh =hinh;


    }
}
