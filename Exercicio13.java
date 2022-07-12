import java.util.Scanner;
public class Exercicio13 {
	public static float inputFlo(String text) {
		System.out.print(text);
		Scanner sc = new Scanner(System.in);
		float value = sc.nextFloat();
		return value;
	}
	public static void main(String[] args) {
		float pesoRacao = inputFlo("Peso do saco de ração: ");
		float racaoGato = inputFlo("Quantidade de ração por gato: ");

		System.out.println("Em cinco dias restara: "+(pesoRacao-((racaoGato*2)*5)));
	}
}
