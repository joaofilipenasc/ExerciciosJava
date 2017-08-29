import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		// Efetuar a leitura de cinco números e identificar o maior e o menor valor.

		Scanner sc = new Scanner(System.in);
		int maior, menor, numero;
		System.out.println("Digite um número:");
		maior = menor = numero = sc.nextInt();

		for (int i = 0; i < 4; i++) {
			numero = sc.nextInt();
			if (numero > maior)
				maior = numero;

			if (numero < menor)
				menor = numero;
		}
		System.out.println("O maior número é:" + maior);
		System.out.println("O menor número é:" + menor);

		sc.close();
	}
}
