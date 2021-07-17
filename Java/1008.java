package uri;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero , hora ; 
		double salario; 
		numero = sc.nextInt();
		hora = sc.nextInt();
		salario =  sc.nextDouble();
		System.out.printf("NUMBER = %d\n" , numero);
		System.out.printf("SALARY = U$ %.2f\n" , hora * salario);
		
	}

}
