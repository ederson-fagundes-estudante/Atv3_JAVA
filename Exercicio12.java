import java.util.Scanner;
public class Exercicio12 {
	public static float inputFlo(String text) {
		System.out.print(text);
		Scanner sc = new Scanner(System.in);
		float value = sc.nextFloat();
		return value;
	}
	public static void main(String[] args) {
		float cShow = inputFlo("Custo de um show musical: ");
		float pIngresso = inputFlo("Preço do ingresso desse evento: ");

		System.out.println("Você deve vender pelo menos "+(cShow/pIngresso)+" ingressos");
	}
}
