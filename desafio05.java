package Fundamentos;
import java.util.Scanner;
public class desafio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		
	
		System.out.println("Digite a primeira nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2)/ 2;
		System.out.println(media);
		
		if (media < 7) {
			if (media >= 5) {
				System.out.println("Aluno em recuperação");
			}else {
				System.out.println("Aluno reprovado");
			}
		}else
			System.out.println("Aluno aprovado!");
	}

}
