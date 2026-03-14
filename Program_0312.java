package qa_java_program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Program_0312 {

	
	public static void max_min_Array() {
		
		int a[] = {10,5,40,20,30};
		
		int max = a[0];
		
		int min = a[0];
		
		for (int i =0;i<a.length;i++) {
			
			if(a[i]>max) {
				
				max =a[i];
			}
			else if (a[i]<min) {
				
				min = a[i];
			}
		}
		
		System.out.println("max value is " +max +" min values is " +min);
	}
	
	public static void odd_even_Array() {
		
		int a[] = {60,7,8,40,13};
		
		//ArrayList<Integer> al = new ArrayList<Integer>();
		
		
		for (int i =0;i<a.length;i++) {
			
			if(a[i]%2==0) {
				
				
				System.out.println("Number is Even " + a[i]);
			}
			else {
				
				System.out.println("Number is Odd " +a[i]);
				
				
			}
		}
			
		
	
	}
	
	//count duplicate character in array
	
	public static void duplicate_char() {
		
		String s = "madam";
		
		 char a [] = s.toCharArray();
		 
		 HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
		 
		 for( char  c:a) {
			 
			 if(hm.containsKey(c)) {
				 
				 hm.put(c, hm.get(c)+1);
			 }
			 
			 else {
				 
				 hm.put(c, 1);
			 }
			 
		 }
		 
		 System.out.println(hm);
		 
		 
		 
	}
	
	public static void countVowel() {
		
		String s = "abcdeiou";
		
		char a [] = s.toCharArray();
		
		for(char i:a) {
			
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*max_min_Array();
		odd_even_Array();
		duplicate_char();*/
		countVowel();
	}

}
