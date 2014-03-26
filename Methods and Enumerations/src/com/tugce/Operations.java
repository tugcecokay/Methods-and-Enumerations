package com.tugce;

import java.util.Random;
import java.util.Scanner;

public class Operations {
	public static boolean inMultiple(int x, int y) {

		if (x % y == 0) {
			return true;
		}

		else
			return false;

	}

	public static double Hypotenuse(double x, double y) {
		double h = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
		return h;

	}

	public static void squareOfAsterisks(int x) {

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

	public static int ReversingDigits(int x) {
		int ayrac;
		int gecici = 0;
		int sayi = x;
		while (sayi != 0) {
			ayrac = sayi % 10;
			gecici = gecici * 10 + ayrac;
			sayi = sayi / 10;

		}

		return gecici;
	}

	public enum Yazıtura {
		YAZI, TURA
	};

	public static Yazıtura fırlat() {
		Random rd = new Random();
		int girdi = rd.nextInt(2);
		if (girdi == 0) {
			return Yazıtura.YAZI;
		} else {
			return Yazıtura.TURA;
		}

	}

	public static void menu() {
		int sec=0, yazi = 0, tura = 0;
		do {
			System.out.println("1->Parayı at\n2->Yazı-tura miktarını göster\n3->Çıkış");
			Scanner input = new Scanner(System.in);
		try{	sec = input.nextInt();}
		catch (Exception e) {
			System.out.println("Yanlış tuşlama");
		} 
			switch (sec) {
			case 1:
				System.out.println("Yazı mı? tura mı? :)");
				if (Operations.fırlat() == Yazıtura.YAZI) {
					System.out.println("***Yazııı***");
					++yazi;
				} else if (Operations.fırlat() == Yazıtura.TURA) {
					System.out.println("***Turaaaa***");
					++tura;
				}
				break;
			case 2:
				System.out.println("Toplam Yazı miktarı="+ yazi	+"\nToplam tura miktarı=" + tura);
				break;
			case 3:
				System.out.println("Çıkış yaptınız.");
				
				break;
			default:
				break;
			}
		} while (sec != 3);

	}
}

