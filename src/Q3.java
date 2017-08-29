import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		//Fazer um algoritmo que leia dois pontos de um plano cartesiano(x1 e y1; x2 e y2 e imrpima a distância entre os pontos

		Scanner sc = new Scanner(System.in);
		int x1, x2, y1, y2;
		System.out.println("Digite x1:");
		x1 = sc.nextInt();
		System.out.println("Digite x2:");
		x2 = sc.nextInt();
		System.out.println("Digite y1:");
		y1 = sc.nextInt();
		System.out.println("Digite y2:");
		y2 = sc.nextInt();

		double l1,l2;

		l1 = Math.pow((x1-x2),2);
		l2 = Math.pow((y1-y2), 2);

		double h = Math.sqrt(l1+l2);

		System.out.println("A distância é:" + h);

		sc.close();

	}
}
