import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		//Fazer um algoritmo que leia dois números e imprima uma mensagem dizendo se são iguais ou diferentes

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		int n1 = sc.nextInt();
		System.out.println("Digite o segundo número:");
		int n2 = sc.nextInt();

		if(n1==n2) {
			System.out.println("Os números são iguais");
		} else {
			System.out.println("Os números são diferentes");
		}
		sc.close();
	}
}
