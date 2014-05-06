package com.calisma;

public class Personel {

	String ad, soyad, maas, telno,adres;
	
	public Personel(String AD, String SOYAD, String MAAS, String TELEFON, String ADRES)
	{
		ad=AD;
		soyad=SOYAD;
		maas=MAAS;
		telno=TELEFON;
		adres=ADRES;
		
	
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getMaas() {
		return maas;
	}

	public void setMaas(String maas) {
		this.maas = maas;
	}

	public String getTelno() {
		return telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}
	
	
	
	
}
