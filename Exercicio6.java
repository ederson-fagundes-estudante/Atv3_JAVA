import java.util.Scanner;
public class Exercicio6 {
	public static float inputFlo(String text) {
		System.out.print(text);
		Scanner sc = new Scanner(System.in);
		float value = sc.nextFloat();
		return value;
	}
	public static void main(String[] args) {
		float salarioMinimo = inputFlo("Valor salario minimo:");
		float salarioFuncionario = inputFlo("Valor que o funcionario ganha:");
		
		System.out.println("O funcionario ganha: "+(salarioFuncionario/salarioMinimo)+" salarios minimos");
	}

}
