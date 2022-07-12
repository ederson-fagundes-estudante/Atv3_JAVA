import java.util.Scanner;
public class Exercicio8 {
	public static float inputFlo(String text) {
		System.out.print(text);
		Scanner sc = new Scanner(System.in);
		float value = sc.nextFloat();
		return value;
	}
	public static void main(String[] args) {
		float salario = inputFlo("Salario:");
		float c1 = inputFlo("Conta 1:");
		float c2 = inputFlo("Conta 2:");
		
		System.out.println("O restante do salario é: "+(salario-((c1*0.95)+(c2*0.95))));
	}

}
