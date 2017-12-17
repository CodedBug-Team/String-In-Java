package stringExamplePrograms;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String args[]) {	
		String s1;
		Scanner a = new Scanner (System.in);
		System.out.println("enter number of names you want to print:");
		int n = a.nextInt();	
		String names[] = new String [n];
		System.out.println("enter"+" "+n+" "+"names");

		for(int i = 0 ; i < names.length ; i++) {
		
			names[i] = a.nextLine();
		}
		System.out.println("names having ending letter h:");
		
		for (String i : names) {
			boolean b1 = i.endsWith("h");
			
			if ( b1 == true ) 
				System.out.println(i);
			
			boolean b2 = i.endsWith("H");

			if(b2 == true) 
				System.out.println(i);
		}			
	}

}
