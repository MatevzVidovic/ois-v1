

public class Gravitacija {
	
	public static void main (String[] args) {
		System.out.print("OIS je zakon!");
	}
	
	private static double gravPospesek(double nadmorskaVisina) {
		
		double pospesek = (6.674 * 5.972 * Math.pow(10, 13)) / Math.pow((6371000.0 + nadmorskaVisina), 2)
		
		return pospesek;
	}
}