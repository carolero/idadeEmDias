package com.br.exercicio.dois;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int controle = 1;
		
		while (controle > 0) {
		
			System.out.println("Quantos anos você tem?");
			int anos = scan.nextInt();
			
			System.out.println("Quantos meses?");
			int meses = scan.nextInt();
			
			System.out.println("E quantos dias?");
			int dias = scan.nextInt();
			
			//--------------------
			
			int idadeTotalDias = (((anos * 365) + meses * 30) + dias);
			
			System.out.println("Sua idade é: " + idadeTotalDias + " dias");
			
			System.out.println("Digite 1 para continuar no programa ou -1 para sair");
			controle = scan.nextInt();
			
		}
		
	}

}
