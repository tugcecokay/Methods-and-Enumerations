package com.tugce;

import java.util.Scanner;

public class OpertaionsTest {

	public static void main(String[] args) {
		int secim = 0;
		int sayi1 = 0, sayi2 = 0;
		double sayi3 = 0, sayi4=0;	
	do{	System.out.println("Yapmak istediğiniz işlemi seçin.");
		System.out.println("1.Tam katı sorusu\n2.Hipotenüs sorusu\n3.Kare çizdirme sorusu\n4.Sayıyı tersten yazdırma sorusu\n5.Yazı-Tura sorusu\n6.Çıkış");
		
		Scanner input = new Scanner(System.in);
		
		try {secim = input.nextInt();
		} 
		catch (Exception e) {
			System.out.println("Yanlış tuşlama");
		} 
				
		if (secim == 1) {
			System.out.println("1.sayıyı giriniz:");
		
		try{sayi1 = input.nextInt();}
			catch (Exception e) {
				System.out.println("Yanlış tuşlama");
			} 
			System.out.println("2.sayıyı giriniz:");
		try{sayi2 = input.nextInt();}
		catch (Exception e) {
			System.out.println("Yanlış tuşlama");
		} 
			if (Operations.inMultiple(sayi1, sayi2))
				System.out.println("Tam katıdır");
			else
				System.out.println("Tam katı değildir.");
		} 
		else if (secim == 2) {
				System.out.println("1.kenarı giriniz:");
			try{	sayi1 =input.nextInt();}
			catch (Exception e) {
				System.out.println("Yanlış tuşlama");
			} 
				System.out.println("2.kenarı giriniz:");
			try{	sayi2=input.nextInt();}
			catch (Exception e) {
				System.out.println("Yanlış tuşlama");
			} 
				System.out.println(Operations.Hypotenuse(sayi3, sayi4));		
		
		}
		else if (secim == 3) {
			System.out.println("Karenin kenar uzunluğunu giriniz:");
			try{sayi1=input.nextInt();}
			catch (Exception e) {
				System.out.println("Yanlış tuşlama");
			} 
			Operations.squareOfAsterisks(sayi1);
		} 
		else if (secim == 4) {
			System.out.println("Tersini görmek istediğiniz sayıyı giriniz:");
			try{sayi1=input.nextInt();}
			catch (Exception e) {
				System.out.println("Yanlış tuşlama");
			} 
			System.out.println(+sayi1 +"=>" +Operations.ReversingDigits(sayi1));
		} 
		else if (secim == 5) {
			
				Operations.menu();
			}
		
				
	} while(secim!=6);{
		System.out.println("Çıkış işleminiz başarıyla gerçekleşti.");
	}
}
	

}

