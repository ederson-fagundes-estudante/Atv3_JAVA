import java.util.Scanner;
public class Exercicio1 {
	public static float inputFlo(String text) {
		System.out.print(text);
		Scanner sc = new Scanner(System.in);
		float value = sc.nextFloat();
		return value;
	}
	public static void main(String[] args) {
		float v1 = inputFlo("Valor 1:");
		float v2 = inputFlo("Valor 2:");
		
		System.out.println(v1*v2);
	}

}
