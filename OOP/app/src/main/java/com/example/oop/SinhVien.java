package com.example.oop;

public class SinhVien {
  private String name;
  private String diachi;
  private int namsinh;


    public SinhVien(String name, String diachi, int namsinh) {
        this.name = name;
        this.diachi = diachi;
        this.namsinh = namsinh;
    }

    public SinhVien() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (namsinh > 2002){
            namsinh = 2002;
        }
        this.name = name;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }
}
