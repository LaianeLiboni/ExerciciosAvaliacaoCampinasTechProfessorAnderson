package ProfessorAnderson;

import java.util.Scanner;

public class DiaUtil {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com um dia da semana (1-7): ");
		
		int diaSemana = scanner.nextInt();	
		
		switch(diaSemana) {
		case 2: 
		case 3: 
		case 4: 
		case 5: 
		case 6: System.out.println("Dia útil"); break;
		case 1:
		case 7: System.out.println("Fim de semana"); break;
		default: System.out.println("Não é um dia da semana válido");
		
		scanner.close();
		}
	}
}
