import java.util.Scanner;
public class Exercicio10 {
	public static float inputFlo(String text) {
		System.out.print(text);
		Scanner sc = new Scanner(System.in);
		float value = sc.nextFloat();
		return value;
	}
	public static void main(String[] args) {
		float dinheiroReais = inputFlo("Dinheiro em reais: ");

		System.out.println("Convers�o para dolar australiano: "+(dinheiroReais*0.2826));
		System.out.println("Convers�o para bitcoin: "+(dinheiroReais*0.0000051));
		System.out.println("Convers�o para libra esterlina: "+(dinheiroReais*0.1518));
	}
}
