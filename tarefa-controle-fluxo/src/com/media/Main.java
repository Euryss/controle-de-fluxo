package com.media;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String controle = "";
		do {
			System.out.print("\nInsira a primeira nota: ");
			double nota1 = input.nextDouble();
			System.out.print("\nInsira a segunda nota: ");
			double nota2 = input.nextDouble();
			System.out.print("\nInsira a terceira nota: ");
			double nota3 = input.nextDouble();
			System.out.print("\nInsira a quarta nota: ");
			double nota4 = input.nextDouble();
			
			double media = (nota1 + nota2 + nota3 + nota4) / 4;
			System.out.println("\nResultado: " + media);
			if(media <= 5 && media > 0) {
				System.out.println("Reprovado");
			}else if(media > 6 && media <= 8) {
				System.out.println("Recuperação ");
			}else {
				System.out.println("Aprovado");
			}
			
			System.out.print("Deseja continuar?");
			controle = input.next();
			
		}while(controle.equalsIgnoreCase("sim"));
		System.out.println("Finalizado com sucesso!");
	}
}
