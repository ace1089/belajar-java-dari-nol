// SWAP VARIABLE/MENGGANTI VARIABEL

public class Main {

	public static void main(String[] args) {
		
		String x = "air";
		String y = "sirup";
		String temp;
		
		temp = x;
		x=y;
		y=temp;
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}
}