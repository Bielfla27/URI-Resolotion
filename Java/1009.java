package uri;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		double salario , vendas, bonus;
		nome = sc.next();
		salario = sc.nextDouble();
		vendas = sc.nextDouble();
		bonus = 0.15 * vendas;
		System.out.printf("TOTAL = R$ %.2f\n", bonus + salario);
		
	}

}
