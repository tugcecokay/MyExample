package com.calisma;

public class MarketIslem {
	private String urunAdi;
	private String urunFiyati;
	private String urunAdeti;
	
	public MarketIslem(String urunAdi,String urunFiyati,String urunAdeti){
		this.urunAdi=urunAdi;
		this.urunFiyati=urunFiyati;
		this.urunAdeti=urunAdeti;
	}

	public MarketIslem() {
		// TODO Auto-generated constructor stub
	}

	public String getUrunAdi() {
		return urunAdi;
	}

	public void setUrunAdi(String urunAdi) {
		this.urunAdi = urunAdi;
	}

	public String getUrunFiyati() {
		return urunFiyati;
	}

	public void setUrunFiyati(String urunFiyati) {
		this.urunFiyati = urunFiyati;
	}

	public String getUrunAdeti() {
		return urunAdeti;
	}

	public void setUrunAdeti(String urunAdeti) {
		this.urunAdeti = urunAdeti;
	}
}
