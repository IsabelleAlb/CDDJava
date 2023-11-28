package looping;
import java.util.Scanner;
public class exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		System.out.println("Quantos alunos tem na sua sala?");
		int nalunos = entrada.nextInt();
		double media = 0;
		double soma = 0;
		
		int cont = 0;
		while (cont < nalunos) {
			System.out.println("Digite a nota do aluno: ");
			double nota = entrada.nextDouble();
			soma = soma + nota;
			cont++;
		}
		media = soma/nalunos;
		System.out.println(media);
	}

}
