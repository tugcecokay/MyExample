package com.calisma;

import java.util.ArrayList;

public class Marketliste {

	public ArrayList<MarketIslem> SepeteEkle(ArrayList<MarketIslem>list,String urunAdi,String urunFiyati,String urunAdeti){
		list.add(new MarketIslem (urunAdi,urunFiyati,urunAdeti));
		return list;
	}
	public ArrayList<MarketIslem> SepettenCikar(ArrayList<MarketIslem>list,int sepet){
		if(sepet<0){
			System.out.println("Ürün sepette yok.");
		}
		
		list.remove(sepet);
		
		return list;
		}
	
	public ArrayList<MarketIslem> SepetYenile(ArrayList<MarketIslem>list,int sepet,String urunAdi,String urunFiyati,String urunAdeti){
		if(sepet<0){
			System.out.println("Ürün sepette yok.");
		}
		
		list.set(sepet, new MarketIslem(urunAdi,urunFiyati,urunAdeti));
		return list;
	}
	public void SepetiGoster(ArrayList<MarketIslem> list){
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getUrunAdi()+"\n"+list.get(i).getUrunFiyati()+"\n"+list.get(i).getUrunAdeti()+"\n");
		}
	System.out.println("Sepetinizde toplam"+" " +list.size()+" " +"ürün bulunmaktadır.");
	
	}
}

