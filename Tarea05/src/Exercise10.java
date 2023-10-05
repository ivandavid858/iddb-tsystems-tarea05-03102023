import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numSales = sc.nextInt();
		//sc.close();
		
		int acumSales = 0;
		for (int i = 0; i < numSales; i++) {
			System.out.println("Ingresa una venta: ");
			int sale = sc.nextInt();
			acumSales += sale;
		}
		
		System.out.println("Num total de sales: " + acumSales);

	}

}
