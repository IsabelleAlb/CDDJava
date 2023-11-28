package Fundamentos;
import java.util.Scanner;
public class desafio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um número: ");
		int resp = entrada.nextInt();
		if (resp > 0) {
			System.out.println("Número positivo");
		}else {
			System.out.println("Número negativo");
		}
	}

}
