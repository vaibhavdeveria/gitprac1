
public class ConstrPrac {
	int c;

	public void withoutReturn() {
		System.out.println("This is test method without return type");
	}
	public String withStringReturn() {
		String name = "Return name --> John";
		
		return(name);
	}
	public int parampass(int x, int y) {
		
		return(x+y);
		
		
	}
	public ConstrPrac(int a, int b){
		 c = a+b;
		System.out.println("This is first method i.e. constructor" + " " + c);
		 System.out.println("Hello constructor");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstrPrac obj  = new ConstrPrac(6,10);
		obj.withoutReturn();
		System.out.println(obj.c);
		System.out.println(obj.withStringReturn());
		System.out.println(obj.parampass(10, 6));
		
	}

}
