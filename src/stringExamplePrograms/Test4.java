package stringExamplePrograms;

import java.util.Scanner;

public class Test4 {

public static void main(String args[]) throws ShortException {
		
		String s1;
		Scanner a = new Scanner(System.in);
		System.out.println("enter string:");
		s1 = a.nextLine();
		System.out.println(s1);
		int c = s1.length();
	


		try {
			if (c<6) {
			ShortException b = new ShortException("short string");
				
				throw b;
			}
	
			for (int d = 0 ; d<c ; d++) {
				char g = s1.charAt(d);
	
	
			if (g>=10 && g<=47 || g>=58 && g<=63 || g>90 && g<=96) {
					SpecialCharException sz = new SpecialCharException("invalid string");
					throw sz;	
			}
	
			}
	       	      }	
		 
		

		catch(ShortException b) {
			System.out.println(b.getMsg());
		}

		catch (SpecialCharException sz) {
			System.out.println(sz.getMsg());
		}
		
	}
}
