package Fundamentos;
import java.util.Scanner;
public class desafio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite uma letra: ");
		char letra = entrada.next().charAt(0);
		
		if (letra == 'M' || letra == 'm') {
			System.out.println("Masculino");
		}else if (letra == 'F' || letra == 'f') {
			System.out.println("Femminino");
		}else {
			System.out.println("letra invalida");
		}
	}

}
