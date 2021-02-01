package ProfessorAnderson;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a string que será invertida: ");
		
		String paraInverter = scanner.nextLine();
		
		String invertida = "";
		
		for(int i = paraInverter.length() - 1; i >= 0; i--) {
			invertida = invertida + paraInverter.charAt(i);
		}
		System.out.println(invertida);
		
		scanner.close();
		
	}

}
