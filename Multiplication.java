public class Multiplication {
	public static void main(String[] args) {	
		System.out.println("Multiplication Table");	
		for(int i=1; i<=12; i++) {
			for(int j=1; j<=12; j++) {
			int x = i*j;	
			System.out.print(x+ "\t");
			}
			System.out.println();
		}
	}
}
