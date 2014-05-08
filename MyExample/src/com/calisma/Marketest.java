package com.calisma;

import java.util.ArrayList;
import java.util.Scanner;

public class Marketest {

	
	public static void main(String[] args) {
		ArrayList<MarketIslem> liste = new ArrayList<MarketIslem>();
		MarketIslem method = new MarketIslem();
		String cevap="e";
		int secim;
		int i = 0;
		Marketliste markt=new Marketliste();
		String uaguncel,ufguncel,usil;
		Scanner input=new Scanner(System.in);
		do{
			System.out.println("1.Sepete ürün ekle\n2.Sepetten ürün çıkar\n3.Sepeti güncelle\n4.Sepeti göster");
			secim=input.nextInt();
			
			switch (secim) {
			case 1:
				do{
					System.out.println("*****************");
					System.out.print((i+1)+".Ürün adı:");
					method.setUrunAdi(input.next());
					System.out.print((i+1)+".Ürün fiyatı:");
					method.setUrunFiyati(input.next());
					System.out.print((i+1)+".Ürün miktarı ");
					method.setUrunAdeti(input.next());
					markt.SepeteEkle(liste, method.getUrunAdi(),method.getUrunFiyati(),method.getUrunAdeti());
					System.out.println("Ürün eklemeye devam etmek istiyorsanız 'e' tuşuna basınız.");
					cevap=input.next();
					i++;
														
			}while(cevap.equalsIgnoreCase("e"));
				
				break;
			case 2:System.out.println("*****************");
				int sepet=0;
				System.out.println("Silmek istediğiniz ürün adını giriniz:");
				usil=input.next();
				for (int i1 = 0; i1 < liste.size(); i1++) {
					if (liste.get(i1).getUrunAdi().equals(usil)) {
						sepet = i1;
					}
					
				}
				liste = markt.SepettenCikar(liste, sepet);
				
				break;
			case 3:System.out.println("*****************");
				int sepet1=0;
			System.out.println("Güncellemek istediğiniz ürün adını giriniz:");
			uaguncel=input.next();
			for (int i1 = 0; i1 < liste.size(); i1++) {
				if (liste.get(i1).getUrunAdi().equals(uaguncel)) {
					sepet = i1;
				}
			}
				System.out.print("Yeni Ürün adı:");
				method.setUrunAdi(input.next());
				System.out.print("Yeni Ürün fiyatı:");
				method.setUrunFiyati(input.next());
				System.out.print("Yeni Ürün miktarı ");
				method.setUrunAdeti(input.next());
				markt.SepeteEkle(liste, method.getUrunAdi(),method.getUrunFiyati(),method.getUrunAdeti());
				
				break;
			case 4:
				System.out.println("******************");
				markt.SepetiGoster(liste);
				break;
			default:System.err.println("Yanlış seçim yaptınız :)");
				break;
			}
			
							
		}while((secim > 0 || secim < 4) && secim !=4);
		
		
		
	}

}
