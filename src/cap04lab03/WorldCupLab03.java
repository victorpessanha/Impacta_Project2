package cap04lab03;

import java.util.Scanner;

public class WorldCupLab03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Print the current year: ");
		int currentYear = scan.nextInt();
		
		for (int i = 1930; i <= currentYear; i += 4) {
			if (i == 1942 | i == 1946) {
				System.out.println("World war");
			} 
			System.out.println("World cup " + i);
		}

	}

}
