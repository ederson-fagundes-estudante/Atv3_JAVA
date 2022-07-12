import java.util.Scanner;
public class Exercicio11 {
	public static float inputFlo(String text) {
		System.out.print(text);
		Scanner sc = new Scanner(System.in);
		float value = sc.nextFloat();
		return value;
	}
	public static void main(String[] args) {
		float hora = inputFlo("Horas: ");
		float minuto = inputFlo("Minutos: ");
		
		float horaEmMinuto = hora*60;

		System.out.println("Hora em minutos: "+(horaEmMinuto));
		
		float minutosTotal = horaEmMinuto+minuto;

		System.out.println("Hora e minutos em minutos: "+(minutosTotal));
		
		System.out.println("Hora e minutos em segundos: "+(minutosTotal*60));
	}
}
