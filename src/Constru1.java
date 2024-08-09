//print hello using constr.
public class Constru1 {

	public Constru1(int a, int b) {
		int c = a+b;
		System.out.println("additoon is" +" " +c);
	}
	public Constru1(int a, int b, int c) {
		int d = a+b+c;
		System.out.println("additoon is" +" " +d);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constru1 obj  = new Constru1(5,6,7);
		
	}

}
