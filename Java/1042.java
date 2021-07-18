package uri;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			int[] vetor = new int[3];
			vetor[0] = sc.nextInt();
			vetor[1] = sc.nextInt();
			vetor[2] = sc.nextInt();
			int[] clone = vetor.clone();
			Arrays.sort(vetor);
			for(int i = 0; i <vetor.length; i++) {
				System.out.printf("%d\n" ,vetor[i]);
			}
			System.out.println();
			for(int i = 0; i <vetor.length; i++) {
				System.out.printf("%d\n" ,clone[i]);
			}
	    }	

}
