import java.util.Scanner;
public class Exercicio7 {
	public static int inputInt(String text) {
		System.out.print(text);
		Scanner sc = new Scanner(System.in); 
		int value = sc.nextInt();
		sc.close();
		return value;
	}
	public static void main(String[] args) {
		int v1 = inputInt("Valor para tabuada: ");

		System.out.println("Tabuada");
		for(int x = 1; x <= 10; x++) {
			System.out.println(v1+"x"+x+" = "+v1*x);
		}
	}

}
