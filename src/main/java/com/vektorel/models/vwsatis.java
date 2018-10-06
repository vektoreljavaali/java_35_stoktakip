/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vektorel.models;

import java.util.Date;

/**
 *
 * @author vektorel
 */
public class vwsatis {
    
    private Long satisid;
    private String urunadi;
    private Date satistarihi;
    private int adet;
    private double toplamfiyat;

    public Long getSatisid() {
        return satisid;
    }

    public void setSatisid(Long satisid) {
        this.satisid = satisid;
    }

    public String getUrunadi() {
        return urunadi;
    }

    public void setUrunadi(String urunadi) {
        this.urunadi = urunadi;
    }

    public Date getSatistarihi() {
        return satistarihi;
    }

    public void setSatistarihi(Date satistarihi) {
        this.satistarihi = satistarihi;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public double getToplamfiyat() {
        return toplamfiyat;
    }

    public void setToplamfiyat(double toplamfiyat) {
        this.toplamfiyat = toplamfiyat;
    }
    
    
}
