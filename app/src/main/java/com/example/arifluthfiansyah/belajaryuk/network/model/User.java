package com.example.arifluthfiansyah.belajaryuk.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Arif Luthfiansyah on 29/10/2017.
 */

public class User implements Serializable{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("nama")
    @Expose
    private String nama;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("no_telp")
    @Expose
    private String noTelp;
    @SerializedName("alamat")
    @Expose
    private String alamat;
    @SerializedName("foto")
    @Expose
    private String foto;
    @SerializedName("bio")
    @Expose
    private String bio;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("kecamatan")
    @Expose
    private String kecamatan;
    @SerializedName("kota")
    @Expose
    private String kota;
    @SerializedName("registered")
    @Expose
    private String registered;
    @SerializedName("pertanyaan")
    @Expose
    private Pertanyaan pertanyaan;
    @SerializedName("jawaban")
    @Expose
    private Jawaban jawaban;
    @SerializedName("aktivitas")
    @Expose
    private Aktivitas aktivitas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }

    public Pertanyaan getPertanyaan() {
        return pertanyaan;
    }

    public void setPertanyaan(Pertanyaan pertanyaan) {
        this.pertanyaan = pertanyaan;
    }

    public Jawaban getJawaban() {
        return jawaban;
    }

    public void setJawaban(Jawaban jawaban) {
        this.jawaban = jawaban;
    }

    public Aktivitas getAktivitas() {
        return aktivitas;
    }

    public void setAktivitas(Aktivitas aktivitas) {
        this.aktivitas = aktivitas;
    }

}
