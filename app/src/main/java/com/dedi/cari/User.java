package com.dedi.cari;

class Users {

    public String nama, img, posisi;

    public Users(){

    }

    public String getName() {
        return nama;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public String getImage() {
        return img;
    }

    public void setImage(String img) {
        this.img = img;
    }

    public String getStatus() {
        return posisi;
    }

    public void setStatus(String posisi) {
        this.posisi = posisi;
    }

    public Users(String nama, String img, String posisi) {
        this.nama = nama;
        this.img = img;
        this.posisi = posisi;
    }
}
