package stringExamplePrograms;

import java.util.Scanner;

public class Test5 {

public static void main(String args[]) throws ShortException {
		
		String s1;
		Scanner a = new Scanner(System.in);
		System.out.println("enter string:");
		s1 = a.nextLine();
		System.out.println(s1);
		int c = s1.length();
	


		try {
			if (c<3) {
			ShortException b = new ShortException("short string");
				
				throw b;
			}
	
			for (int d = 0 ; d<c ; d++) {
				char g = s1.charAt(d);
	
	
			if (g>=10 && g<=47 || g>90 && g<=96) {
					SpecialCharException sz = new SpecialCharException("invalid string");
					throw sz;	
			}
	
			if ( g>=48 && g<=56) {
				NumException ne = new NumException("Number exception");
				throw ne;
			}
	       	         }	
		 }
		

		catch(ShortException b) {
			System.out.println(b.getMsg());
		}

		catch (SpecialCharException sz) {
			System.out.println(sz.getMsg());
		}
		
		catch (NumException ne) {
			System.out.println(ne.getMsg());
		}

	}
}
