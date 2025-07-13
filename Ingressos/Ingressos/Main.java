package Ingressos;

import java.util.Scanner;

import models.Ingresso;
import models.IngressoFamilia;
import models.MeiaEntrada;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Escolha o tipo de ingresso você deseja comprar:");
			System.out.println("1 - Ingresso comum");
			System.out.println("2 - Ingresso meia-entrada");
			System.out.println("3 - Ingresso família");
			System.out.println("4 - Sair");
			int escolha = sc.nextInt();
			switch(escolha) {
			case 1:
				System.out.println("Digite o nome do filme:");
				sc.nextLine();
				String nomeFilme = sc.nextLine();
				System.out.println("Digite o tipo de áudio do filme:");
				String audio = sc.next();
				System.out.println("Valor do ingresso:");
				double valor = sc.nextDouble();
				System.out.println(new Ingresso(valor, nomeFilme, audio));
				break;
			case 2:
				System.out.println("Digite o nome do filme:");
				sc.nextLine();
				nomeFilme = sc.nextLine();
				System.out.println("Digite o tipo de áudio do filme:");
				audio = sc.next();
				System.out.println("Valor do ingresso:");
				valor = sc.nextDouble();
				System.out.println(new MeiaEntrada(valor, nomeFilme, audio));
				break;
			case 3:
				System.out.println("Digite o nome do filme:");
				sc.nextLine();
				nomeFilme = sc.nextLine();
				System.out.println("Digite o tipo de áudio do filme:");
				audio = sc.next();
				System.out.println("Valor do ingresso:");
				valor = sc.nextDouble();
				System.out.println("Número de pessoas:");
				int pessoas = sc.nextInt();
				System.out.println(new IngressoFamilia(valor, nomeFilme, audio, pessoas));
				break;
			case 4:
				System.out.println("Programa encerrado");
				System.exit(0);
				break;
				default:
					System.out.println("Valor inválido! Escolha outra opção");
			}
		}
	}
}
