import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		String nome, senha;
		
		System.out.println("Nome: ");
		nome = read.nextLine();
		
		System.out.println("Senha: ");
		senha = read.nextLine();
		
		while(nome.equals(senha)) {
			System.out.println("Senha inavalida");
			System.out.println("Senha: ");
			senha = read.nextLine();
		}
		read.close();

	}

}
