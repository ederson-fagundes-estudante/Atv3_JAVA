import java.util.Scanner;
public class Exercicio2 {
	public static float inputFlo(String text) {
		System.out.print(text);
		Scanner sc = new Scanner(System.in);
		float value = sc.nextFloat();
		return value;
	}
	public static void main(String[] args) {
		float v1 = inputFlo("Valor 1:");
		float v2 = inputFlo("Valor 2:");
		float v3 = inputFlo("Valor 3:");
		float v4 = inputFlo("Valor 4:");
		float v5 = inputFlo("Valor 5:");

		System.out.println((v1+v2+v3+v4+v5)/8);
	}

}
