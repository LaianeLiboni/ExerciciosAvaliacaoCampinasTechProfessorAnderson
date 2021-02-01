package ProfessorAnderson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Ex15 {
	
	public static void main(String[] args) {
		
		System.out.println("Informe uma lista de números separado por ';' ");
		Scanner in = new Scanner(System.in);
		String lista = in.nextLine();
		
		String[] listaString = lista.split(";");
		int [] listaNumeros = new int[listaString.length];
		for (int i = 0; i < listaString.length; i++) {
			listaNumeros[i] = Integer
					.parseInt(String.valueOf(listaString[i]));
		}
		
		Arrays.sort(listaNumeros);
		
		for (int numero : listaNumeros) {
			System.out.println(numero +";");
		}
		
		in.close();
	}
}