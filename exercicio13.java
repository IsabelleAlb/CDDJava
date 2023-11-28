package looping;
import java.util.Scanner;
public class exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um numero: ");
		int num = entrada.nextInt();
		if (num % 2 == 0) {
			num = num/2;
			System.out.println(num);
		}else {
			num = 3 * num + 1;
			System.out.println(num);
		}
	}

}
