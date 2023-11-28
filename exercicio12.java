package looping;

public class exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int cont = 0;
			for (int i = 1; i<=100;i++) {
				if (i % 3 == 0) {
					System.out.print(i + " ");
					cont++;
				}
				
			}System.out.println("\n"+cont);

	}

}
