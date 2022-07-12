import java.util.Scanner;
public class Exercicio14 {
	public static float inputFlo(String text) {
		System.out.print(text);
		Scanner sc = new Scanner(System.in);
		float value = sc.nextFloat();
		return value;
	}
	public static void main(String[] args) {
		float salarioMinimo = inputFlo("Salario minimo: ");
		float kW = inputFlo("Quilowatts consumida: ");
		
		float kWValor = salarioMinimo/6;

		System.out.println("Valor Quilowatts: "+(kWValor));
		
		float valorASerPago = kW*kWValor;
		
		System.out.println("Valor a ser pago: "+(valorASerPago));
		
		System.out.println("Valor a ser pago com desconto de 18%: "+(valorASerPago*0.82));
	}
}
