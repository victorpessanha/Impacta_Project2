package cap03lab01;

import java.util.Scanner;

public class CalculadoraLab01 {
	public static void main(String[] args) {
		int valor1;
		int valor2;
		int resultado;
		
		//Starting a new object to catch information from the keyboard
		Scanner scan = new Scanner(System.in);
		System.out.println("Type the first number: ");
		//Inputing the first number
		valor1 = scan.nextInt();
		
		System.out.println("Type the second number: ");
		//Inputing the second number
		valor2 = scan.nextInt();
		
		resultado = valor1 + valor2;
		System.out.println("The sum from " + valor1 + " + " + valor2 + "is: " + resultado);
		
	}

}
