import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int R = sc.nextInt();
		double circleArea = Math.PI*Math.pow(R, 2);
		
		System.out.println(circleArea);
	}

}
