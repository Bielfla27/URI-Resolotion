package uri;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			int[] hrs = new int[2];
			int[] min = new int[2];
			hrs[0] = sc.nextInt();
			min[0] = sc.nextInt();
			hrs[1] = sc.nextInt();
			min[1] = sc.nextInt();
			int totalhoras = hrs[1] - hrs[0];
			int totalminutos = min[1] - min[0];
			
			if (totalhoras < 0) {
				totalhoras = 24 + (hrs[1] - hrs[0]);
			}
			
			if (totalminutos < 0) {
				totalminutos = 60 + (min[1] - min[0]);
				totalhoras--;
			}
			
			if (hrs[0] == hrs[1] && min[0] == min[1]) {
				System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
			}
			else {
				System.out.println("O JOGO DUROU "+ totalhoras+ " HORA(S) E " + totalminutos + " MINUTO(S)");
			}
			
	    }	

}
