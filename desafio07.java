package Fundamentos;
import java.util.Scanner;
public class desafio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 0;
				
		Scanner entrada = new Scanner (System.in);
		System.out.println("Telefonou para a vitima? 1 = Sim 2 = Nao: ");
		int resp = entrada.nextInt();
		if (resp == 1) {
			contador = contador + 1;
		}
		
		System.out.println("Esteve no local do crime? 1 = Sim 2 = Nao:");
		resp = entrada.nextInt();
		if (resp == 1) {
			contador = contador + 1;
		}
		
		System.out.println("Mora perto da vitima? 1 = Sim 2 = Nao:");
		resp = entrada.nextInt();
		if (resp == 1) {
			contador = contador + 1;
		}
		
		System.out.println("Devia para a vitima? 1 = Sim 2 = Nao:");
		resp = entrada.nextInt();
		if (resp == 1) {
			contador = contador + 1;
		}
		
		System.out.println("Ja trabalhou com a vitima? 1 = Sim 2 = Nao:");
		resp = entrada.nextInt();
		if (resp == 1) {
			contador = contador + 1;
		}
		
		if (contador == 2) {
			System.out.println("Suspeito");
		}else if (contador == 3 || contador == 4) {
			System.out.println("Cumplice");
		}else if (contador == 5) {
			System.out.println("Culpado!");
		}else {
			System.out.println("Inocente");
		}	
		
	}

}
