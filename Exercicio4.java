import java.util.Scanner;
public class Exercicio4 {
	public static float inputFlo(String text) {
		System.out.print(text);
		Scanner sc = new Scanner(System.in);
		float value = sc.nextFloat();
		return value;
	}
	public static void main(String[] args) {
		float v1 = inputFlo("Preço gasolina:");
		
		System.out.println("Novo preço da gasolina: R$"+(v1*1.1));
	}

}
