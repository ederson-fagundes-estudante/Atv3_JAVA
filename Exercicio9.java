import java.util.Scanner;
public class Exercicio9 {
	public static float inputFlo(String text) {
		System.out.print(text);
		Scanner sc = new Scanner(System.in);
		float value = sc.nextFloat();
		return value;
	}
	public static void main(String[] args) {
		float hTrabalhadas = inputFlo("Horas trabalhadas: ");
		float salarioMinimo = inputFlo("Valor salario minimo: ");
		float hExtras = inputFlo("Horas extras: ");
		
		// 1/6 salario mínimo
		float salarioTrabalhado = (salarioMinimo/6)*hTrabalhadas;
		// 1/3 salario minimo
		float salarioExtra = (salarioMinimo/3)*hExtras;
		
		System.out.println("Salario bruto: "+(salarioTrabalhado+salarioExtra));
	}

}