package com.calisma;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Personel> pers = new ArrayList<Personel>();
		System.out.println("**Personel listesi**");
		System.out.println();
		pers.add(new Personel("Melike","Yıl","12000tl","05112223344","TÜRKİYE"));
		pers.add(new Personel ("Sözdar", "Dere", "12000tl", "05223338899", "TÜRKİYE"));
		pers.add(new Personel ("Ahmet", "Temel", "12000tl", "05213221010", "TÜRKİYE"));
		pers.add(new Personel ("Tuğçe", "Çokay", "12000tl", "05213221019", "TÜRKİYE"));
		
		
		System.out.println(pers.get(0).getAd()+" "+pers.get(0).getSoyad()+" "+pers.get(0).getMaas()+" "+pers.get(0).getTelno()+" "+pers.get(0).getAdres());
		System.out.println(pers.get(1).getAd()+" "+pers.get(1).getSoyad()+" "+pers.get(1).getMaas()+" "+pers.get(1).getTelno()+" "+pers.get(1).getAdres());
		System.out.println(pers.get(2).getAd()+" "+pers.get(2).getSoyad()+" "+pers.get(2).getMaas()+" "+pers.get(2).getTelno()+" "+pers.get(2).getAdres());
		System.out.println(pers.get(3).getAd()+" "+pers.get(3).getSoyad()+" "+pers.get(3).getMaas()+" "+pers.get(3).getTelno()+" "+pers.get(3).getAdres());
		
		System.out.println();
		System.out.println("--Personel Sayisi="+" "+pers.size()+"--");
	
		System.out.println();
		pers.remove(3);
		System.out.println("Bir eleman işten çıkartılıyor...");
		System.out.println("--Yeni Personel Sayisi="+" "+pers.size()+"--");
	
		System.out.println();
		System.out.println("**Güncel personel listesi**");
		System.out.println();
		System.out.println(pers.get(0).getAd()+" "+pers.get(0).getSoyad()+" "+pers.get(0).getMaas()+" "+pers.get(0).getTelno()+" "+pers.get(0).getAdres());
		System.out.println(pers.get(1).getAd()+" "+pers.get(1).getSoyad()+" "+pers.get(1).getMaas()+" "+pers.get(1).getTelno()+" "+pers.get(1).getAdres());
		System.out.println(pers.get(2).getAd()+" "+pers.get(2).getSoyad()+" "+pers.get(2).getMaas()+" "+pers.get(2).getTelno()+" "+pers.get(2).getAdres());
		
		System.out.println("1.indisli eleman aranıyor....");
		System.out.println(pers.contains(pers.get(1)));
		

	}

	}
