package Fundamentos;

public class exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int idade = 15;
		if (idade < 18) {
			System.out.println("Não pode entrar!");
		}else {
			System.out.println("Pode entrar");
		}*/
		int idade = 15;
		boolean amigoDoDono = true;
		if (idade < 18 && amigoDoDono == false) {
			System.out.println("Não pode entrar!");
		}else {
			System.out.println("Pode entrar");
		}
	}

}
