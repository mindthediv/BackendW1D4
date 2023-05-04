package com.epicode;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class W1D4 {

	public static void main(String[] args) {
	System.out.println("/|/|/|//|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/");
	stringaPariDispari();
	annoBisestile();
	System.out.println("/|/|/|//|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/");
	switchPrint();
	System.out.println("/|/|/|//|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/");
	tillQ();
	System.out.println("/|/|/|//|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/");
	countDown();
	System.out.println("/|/|/|//|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/|/");
	}
 static public Scanner input = new Scanner(System.in);
 
	public static void stringaPariDispari() {
		System.out.println("Scrivi una parola, se il numero dei suoi caratteri è pari avrai true, altrimenti false.");
		String str = input.nextLine();
		if(str.length()%2==0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
	public static void annoBisestile() {
		System.out.println("Scrivi un anno, a numero, se bisestile avrai true, altrimenti false.");
		int year = input.nextInt();
		if(year%4==0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
	////////////////
	public static void switchPrint() {
		System.out.println("Digita un numero da 1 a 3, esso verrà stampato in caratteri qui in basso. ");
		int num = input.nextInt();
		if(num<=3) {
			switch(num) {
			case 1:
				System.out.println("Uno");
				break;
			case 2:
				System.out.println("Due");
				break;
			case 3:
				System.out.println("Tre");
				break;
			}
		} else if (num<1 || num>3) {
			System.out.println("Dovresti digitare un numero da 1 a 3.");
			switchPrint();
		}
	}
	////////////////
	public static void tillQ() {	
		System.out.println("Scrivi una parola, verrà scomposta in caratteri. Per uscire dal programma digita :q");
		final Scanner newInput = new Scanner(System.in);
		String str = newInput.nextLine();
		if (str.equals(":q")) {
			System.out.println("Programma terminato.");
		}
		else {
			int i = 0;
			while(i<=(str.length()-1)) {
				System.out.print(str.charAt(i)+",");
				i=i+1;
			}
			System.out.println("");
			tillQ();
		}
	}
	/////////////////
	public static void countDown() {
		System.out.println("Digita un numero per avviarne il conto alla rovescia.");
		final Scanner num = new Scanner(System.in);
		int counter = num.nextInt();
		for (int i = counter; i>=1; i-- ) {
			try {
				  Thread.sleep(1000);
				} catch (InterruptedException e) {
				  Thread.currentThread().interrupt();
				}
			counter = counter - 1; 
			System.out.println(counter);
			
		}
	}

}
