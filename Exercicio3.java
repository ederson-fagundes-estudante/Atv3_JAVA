import java.util.Scanner;
public class Exercicio3 {
	public static float inputFlo(String text) {
		System.out.print(text);
		Scanner sc = new Scanner(System.in);
		float value = sc.nextFloat();
		return value;
	}
	public static void returnMain() {
		main(null);
	}
	public static void main(String[] args) {
		float v1 = inputFlo("Valor 1:");
		
		if(v1 == 0) {
			System.out.println("Valor 1 não pode ser nulo");
			main(null);
			return;
		}
		
		float v2 = inputFlo("Valor 2:");
		
		System.out.println(v1%v2);
	}

}