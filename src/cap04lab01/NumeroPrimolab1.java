package cap04lab01;

import java.util.Scanner;

public class NumeroPrimolab1 {

	public static void main(String[] args) {
		int numero;
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Type a number: ");
		numero = scan.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				count++;
			}
		}
		
		if (count == 2) {
			System.out.println("That's a prime number.");
		} else if (count < 2 || count > 2) {
			System.out.println("That's not a prime number.");
		}
	}
}
