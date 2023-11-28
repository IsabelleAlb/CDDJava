package Fundamentos;
import java.util.Scanner;
public class desafio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um numero: ");
		int dia = entrada.nextInt();
		
		if (dia == 1) {
			System.out.println("Domingo");
		}else if (dia == 2) {
			System.out.println("Segunda-feira");
		}else if (dia == 3) {
			System.out.println("Terça-Feira");
		}else if (dia == 4) {
			System.out.println("Quarta-feira");
		}else if (dia == 5) {
			System.out.println("Quinta-feira");
		}else if (dia == 6) {
			System.out.println("Sexta-feira");
		}else if (dia == 7) {
			System.out.println("Sabado");
		}else {
			System.out.println("Numero invalido!");
		}
		
	}

}
