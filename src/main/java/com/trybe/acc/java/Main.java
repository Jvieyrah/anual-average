package com.trybe.acc.java;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual é o seu nome?");
		String nome = scan.next();
		System.out.println("Avaliação 1:");
		String avaliacao1 = scan.next();
		System.out.println("Avaliação 2:");
		String avaliacao2 = scan.next();
		System.out.println("Avaliação 3:");
		String avaliacao3 = scan.next();
		System.out.println("Avaliação 4:");
		String avaliacao4 = scan.next();
		scan.close();
		
		double avaliacao1f = Double.parseDouble(avaliacao1);
		double avaliacao2f = Double.parseDouble(avaliacao2);
		double avaliacao3f = Double.parseDouble(avaliacao3);
		double avaliacao4f = Double.parseDouble(avaliacao4);
		
		Nota geramedia = new Nota();
		
		double average = geramedia.calcularMedia( avaliacao1f, avaliacao2f, avaliacao3f, avaliacao4f);
		
		System.out.println( "Olá " + nome + ", sua média é " + average);

	}

}
