import java.util.Scanner;
import java.lang.String;
public class Ex3 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String nome;
		char sexo, estado;
		int id;
		Float sal;
		
		do {
			System.out.println("Informe nome:");
			nome = read.nextLine();
		} while(nome.length() < 4);
		do {
			System.out.println("Idade:");
			id = read.nextInt();
		} while(id>150 && id>0);
		do {
			System.out.println("Salario:");
			sal = read.nextFloat();
		} while(sal>0);
		do {
			System.out.println("Sexo M ou F");
			sexo = read.nextLine().charAt(0);
		} while(sexo == 'M' || sexo == 'F');
		do {
			System.out.println("Estado Civil");
			estado = read.nextLine().charAt(0);
		} while(estado == 'S' || estado == 'C' || estado == 'V' || estado == 'D');
		
		
		read.close();
	}
}
