import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		int limmax = 10;
		int limmin = 0;
		int val;
		Scanner read = new Scanner(System.in);
		do {
			System.out.println("Informe um valor de 0 a 10: ");
			val = read.nextInt();
		} while(val>=limmax && val<=limmin);
		read.close();
	}
}
