package uri;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0,b = 0,c = 0,d = 0,e = 0,f = 0,g =0, numero;
		numero = sc.nextInt();
		System.out.printf("%d\n",numero);
		while (numero != 0) {
			if(numero >= 100) {numero -= 100; a += 1;}
			else if(numero >= 50 && numero < 100) {numero -= 50; b += 1;}
			else if(numero >= 20 && numero < 50) {numero -= 20; c += 1;}
			else if(numero >= 10 && numero < 20) {numero -= 10; d += 1;}
			else if(numero >= 5 && numero < 10) {numero -= 5; e += 1;}
			else if(numero >= 2 && numero < 5) {numero -= 2; f += 1;}
			else if(numero >= 1 && numero < 2) {numero -= 1; g += 1;}
		}
		System.out.printf("%d nota(s) de R$ 100.00\n" ,a);
		System.out.printf("%d nota(s) de R$ 50.00\n" ,b);
		System.out.printf("%d nota(s) de R$ 20.00\n" ,c);
		System.out.printf("%d nota(s) de R$ 10.00\n" ,d);
		System.out.printf("%d nota(s) de R$ 5.00\n" ,e);
		System.out.printf("%d nota(s) de R$ 2.00\n" ,f);
		System.out.printf("%d nota(s) de R$ 1.00\n" ,g);
	}

}
