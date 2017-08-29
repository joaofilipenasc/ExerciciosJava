import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		// Fazer um algoritmo para imprimir os preços de um menu.

		int opcao = -1;
		Scanner sc = new Scanner(System.in);

		while(opcao !=0) {
			mostrarMenu();
			System.out.println("Escolha uma das opções:");
			System.out.println("1 - Pizza \n 2 - Macarrão \n 3 - Churrasco");
			System.out.println("0 - SAIR");

			opcao =sc.nextInt();

			switch(opcao) {
			case 1: 
				System.out.println("Pizza - R$ 24,99");
				break;
			case 2:
				System.out.println("Macarrão - R$ 14,99");
				break;
			case 3:
				System.out.println("Churrasco - R$ 44,99");
				break;
			}
		}

	}
	public static void mostrarMenu() {
		System.out.println("Escolha uma das opções:");
		System.out.println("1 - Pizza \\n 2 - Macarrão \\n 3 - Churrasco");
		System.out.println("0 - SAIR");
	}
}
