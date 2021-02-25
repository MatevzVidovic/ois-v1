
import java.util.Scanner;

public class Gravitacija {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double nadmorskaVisina = sc.nextDouble();
		
		izpis(nadmorskaVisina, gravPospesek(nadmorskaVisina));
	}

	
	private static double gravPospesek(double nadmorskaVisina) {
		
		double pospesek = (6.674 * 5.972 * Math.pow(10, 13)) / Math.pow((6371000.0 + nadmorskaVisina), 2);
		
		return pospesek;
	}


	public static void izpis(double nadmorskaVisina, double gravitacijskiPospesek) {
		
		System.out.println(nadmorskaVisina);
		System.out.println(gravitacijskiPospesek);
	}


}