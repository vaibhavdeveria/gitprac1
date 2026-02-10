package qa_java_program;

public class StringTest {

	public static String s1 = "vaibhav";
	public String s2 = "RAM";
	public String s3 = "ABC";
	
	public static void main(String[]args) {
		
		System.out.println(s1);
		if(s1.contains("b")) {
			System.out.println("Test is passed" );
		}
	}
}
