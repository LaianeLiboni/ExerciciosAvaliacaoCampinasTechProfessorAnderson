package ProfessorAnderson;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com o m�s: ");		
		int mes = scanner.nextInt();
		
		System.out.println("Entre com o ano: ");		
		int ano = scanner.nextInt();
		
		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
			System.out.println("� bissexto");	
	    	}else {
	    		System.out.println("N�o � bissexto");
	    	}
		
			if (mes == 2) {
				
			// teste de ano bissexto 
			if (ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0) {
				System.out.println("M�s com 29 dias"); 
			}else{
				System.out.println("M�s com 28 dias"); 
			}
			}else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				System.out.println("M�s com 31 dias"); 
			}else{
				System.out.println("M�s com 30 dias"); 
			}
			
			scanner.close();
		}	
	
	
}

