package com.praktikum.users;

public abstract class User {
    protected String nama;
    protected String nim;


    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public abstract boolean login(String inputNama, String inputNim);

    public void displayInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
    }

    public void displayInfo(String title) {
        System.out.println(title);
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
    }

    public abstract void dispLayAppMenu();
}