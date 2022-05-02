package cap03lab02;

import java.util.Scanner;

public class ParImparLab2 {

	public static void main(String[] args) {
		int numero;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Type a number to verify: ");
		numero = scan.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("That's a even number");
		} else {
			System.out.println("That's a odd number");
		}

	}

}
