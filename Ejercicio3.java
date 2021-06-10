import java.util.*;
public class Ejercicio3{
	public static void main(String[] args) {
		int valorN;
		int factorial;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		valorN = scan.nextInt();
		factorial = valorN;
		for (int i = 1; i < valorN ; i++ ) {
			factorial *= (valorN-i);
		}
		System.out.println("El factorial de " + valorN + " es " + factorial);
	}
}