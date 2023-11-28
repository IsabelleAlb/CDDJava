package Fundamentos;
import java.util.Scanner;
public class desafio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um número: ");
		int resp = entrada.nextInt();
		System.out.println(resp > 0 ? "Positivo": resp < 0 ? "Negativo" : "Neutro");
	}

}
