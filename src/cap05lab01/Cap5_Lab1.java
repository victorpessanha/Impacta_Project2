package cap05lab01;

import java.util.Scanner;

public class Cap5_Lab1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Nome: ");
		funcionario.nome = scan.next();
		
		System.out.println("sobrenome: ");
		funcionario.sobrenoe = scan.next();
		
		System.out.println("Cargo: ");
		funcionario.cargo = scan.next();
		
		System.out.println("Salario: ");
		funcionario.salario = scan.nextFloat();
				
		System.out.println("Nome: " + funcionario.nome);
		System.out.println("Sobrenome: " + funcionario.sobrenoe);
		System.out.println("Cargo: " + funcionario.cargo);
		System.out.printf("Salario: R$%.2f", funcionario.salario);
		
}

}
