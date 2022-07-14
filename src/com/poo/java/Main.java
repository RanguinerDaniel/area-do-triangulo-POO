package com.poo.java;

import java.util.Locale;
import java.util.Scanner;

import com.entities.java.Triangle;


public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double p; 
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite as medidas do triângulo X: ");
		x.a = sc.nextFloat();
		x.b = sc.nextFloat();
		x.c = sc.nextFloat();

		System.out.println("Digite as medidas do triângulo Y: ");
		y.a = sc.nextFloat();
		y.b = sc.nextFloat();
		y.c = sc.nextFloat();

		p = (x.a + x.b + x.c) / 2;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

		p = (y.a + y.b + y.c) / 2;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

		System.out.printf("Área do triângulo X: %.4f", areaX);
		System.out.printf("Área do triângulo Y: %.4f", areaY);

		if (areaX > areaY) {
			System.out.println("o triângulo X possui a maior área.");
		} else if (areaX == areaY) {
			System.out.println("Os triângulos X e Y possuem áreas iguais.");
		} else {
			System.out.println("O triângulo Y possui a maior área.");
		}
		sc.close();

	}
}
