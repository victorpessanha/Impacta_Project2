package cap06lab01;

public class CalculadoraLab01 {
	
	static void soma(int valor1, int valor2) {
		int resultado = valor1 + valor2;
		System.out.println("SOMAR: Valor1 (" + valor1 + ") + Valor2 (" + valor2 + ") = " + resultado);
	}
	
	static void subtracao(int valor1, int valor2) {
		int resultado = valor1 - valor2;
		System.out.println("SUBTRAIR: Valor1 (" + valor1 + ") - Valor2 (" + valor2 + ") = " + resultado);
	}
	
	static void multiplicacao(int valor1, int valor2) {
		int resultado = valor1 * valor2;
		System.out.println("MULTIPLICAR: Valor1 (" + valor1 + ") * Valor2 (" + valor2 + ") = " + resultado);
	}
	
	static void divisao(int valor1, int valor2) {
		if (valor2 == 0) {
			System.out.println(valor1 + " não pode ser dividido por " + valor2);
		} else {
			int resultado = valor1 / valor2;
			System.out.println("DiVIDIR: Valor1 (" + valor1 + ") / Valor2 (" + valor2 + ") = " + resultado);
		}
	}

}
