import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		
		System.out.println("Ingresar un día de la semana:");
		Scanner sc = new Scanner(System.in);
		
		String day = sc.nextLine();
		
		switch (day) {
			case "lunes":
			case "martes":
			case "miercoles":
			case "jueves":
			case "viernes":
				System.out.println("El día " + day + " es un día laboral");
				break;
			case "sabado":
			case "domingo":
				System.out.println("El día " + day + " no es un día laboral");
				break;
			default:
				System.out.println("Ingresar día de la semana correcto");
				break;
		}
		
		sc.close();

	}

}
