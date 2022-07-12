import java.util.Scanner;
public class Exercicio5 {
	public static float inputFlo(String text) {
		System.out.print(text);
		Scanner sc = new Scanner(System.in);
		float value = sc.nextFloat();
		return value;
	}
	public static void main(String[] args) {
		float salario = inputFlo("Salario fixo:");
		float vendas = inputFlo("Valor das vendas:");
		
		System.out.println("Valor total final: R$"+(salario+vendas*0.04));
	}

}
