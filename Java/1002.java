package uri;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159,raio, area; 
		raio = sc.nextDouble();
		area = pi * (raio * raio);
		System.out.printf("A=%.4f\n" ,area);

	}

}
