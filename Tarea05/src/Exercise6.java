import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		
		double IVA = 0.21;

		Scanner sc = new Scanner(System.in);
		
		double precio = sc.nextInt();
		
		double precioFinal = precio + precio*IVA;
		System.out.println(precioFinal);
		
	}

}
