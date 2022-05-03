package cap06lab02;

public class CalculadoraLab02 {
	
	static void subtrair(double valor1, double valor2) {
		double resultado = valor1 - valor2;
		System.out.println("SUBTRAIR: Valor1 (" + valor1 + ") - Valor2 (" + valor2 + ") = " + resultado);
	}
	
	static void subtrair(double valor1, int valor2) {
		double resultado = valor1 - valor2;
		System.out.println("SUBTRAIR: Valor1 (" + valor1 + ") - Valor2 (" + valor2 + ") = " + resultado);
	}
	
	static void subtrair(int valor1, double valor2) {
		double resultado = valor1 - valor2;
		System.out.println("SUBTRAIR: Valor1 (" + valor1 + ") - Valor2 (" + valor2 + ") = " + resultado);
	}

}
