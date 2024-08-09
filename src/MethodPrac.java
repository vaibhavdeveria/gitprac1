
public class MethodPrac {

	public static void firstmethod() {
		
		System.out.println("this is my first method");
	}
	
	public static void add() {
		int x = 5;
		int y = 10;
		int z = (x+y);
		System.out.println("Value of Z is " + z);
		
	}
	public static int multi(int i, int j) {
		int mult = (i*j);
		return (mult);
	}
	 static String multi(String k, String r) {
		 return (k+r);
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		firstmethod();
		add();
		System.out.println(multi(6,6));
		String name = multi("vaibhav ", "deveria ");
		System.out.println("my name is"+ " " +name);
		
		MethodPrac obj = new MethodPrac();
		int r = obj.multi(6, 9);
		System.out.println(r);
	}

}
