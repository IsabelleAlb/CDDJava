package Fundamentos;
import java.util.Scanner;
public class desafio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada1 = new Scanner (System.in);
		System.out.println("Digite um numero: ");
		int resp1 = entrada1.nextInt();
		
		Scanner entrada2 = new Scanner (System.in);
		System.out.println("Digite mais um numero: ");
		int resp2 = entrada2.nextInt();
		
		Scanner entrada3 = new Scanner (System.in);
		System.out.println("Digite outro número: ");
		int resp3 = entrada3.nextInt();
		
		if (resp1 > resp2 && resp1 > resp3) {
			System.out.println("o primeiro numero e o maior");
				if (resp2 > resp3) {
					System.out.println("o terceiro numero e o menor");
				}else {
					System.out.println("o segundo numero e o menor");
				}
		}
		else if (resp2 > resp1 && resp2 > resp3) {
			System.out.println("o segundo numero e o maior");
			if (resp1 > resp3 ) {
				System.out.println("o terceiro numero e o menor");
			}else {
				System.out.println("o primeiro numero e o menor");
			}
		}
		else { 
			System.out.println("o terceiro numero e o maior");
			if (resp1 > resp2) {
				System.out.println("o segundo numero e o menor");
			}else 
				System.out.println("o primeiro numero e o menor");
		
		}
		
		
	}
		

}
