package ProfessorAnderson;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		int num = scanner.nextInt();
		
		boolean primo = true;
				
		for (int i = 2; i < num; i++) {
			if(num % i == 0) {
			System.out.println(" Não é primo");
			primo = false;
			}
		}
		
		if (primo) {
			System.out.println("É número primo");
			
		}
		scanner.close();

	}

}
