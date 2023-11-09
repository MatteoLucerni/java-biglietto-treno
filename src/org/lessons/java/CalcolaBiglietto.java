package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Chilometri che intendi percorrere (numero): ");
		if(!in.hasNextInt()) {
			System.out.println("Devi inserire un valore numerico. Riparti");
			return;
		}
		int km = Integer.valueOf(in.nextLine());
		
		System.out.print("La tua età (numero): ");
		if(!in.hasNextInt()) {
			System.out.println("Devi inserire un valore numerico. Riparti");
			return;
		}
		int age = Integer.valueOf(in.nextLine());
		
		in.close();
		
		float PRICE_PER_KM = 0.21f;
		
		float discount = 0;
		
		if (age < 18) {
			discount = 0.2f;
		} else if(age > 64) {
			discount = 0.4f;
		}
		
		float fullPrice = PRICE_PER_KM*km;
		
		float discountedPrice = fullPrice-(fullPrice*discount);
		
		System.out.println("Sconto applicato: " + (int)(discount*100) + "%");
		System.out.println("Prezzo biglietto finale: " + discountedPrice + "€");
	}
}
