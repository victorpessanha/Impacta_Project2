package cap04lab02;

import java.util.Scanner;

public class VerificaDiasDoMesLab02 {

	public static void main(String[] args) {
		String month;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Choose a month: ");
		month = scan.next();
		
		switch (month) {
		case "january":
		case "march":
		case "may":
		case "july":
		case "august":
		case "october":
		case "december": System.out.println(month + ": Month with 31 days.");
			break;
		case "february": System.out.println(month + ": Month with 28 or 29 days.");
			break;
		case "april":
		case "june":
		case "september":
		case "november": System.out.println(month + ": Month with 30 days.");	
			break;

		default: System.out.println(month + ": Não é um valor válido.");
			break;
		}

	}

}
