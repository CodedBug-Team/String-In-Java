package stringExamplePrograms;

import java.util.Scanner;

public class Test2 {
	
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
		System.out.println("names containing he");
		for (String i : names)
			if (i.indexOf("he")!=-1)
				System.out.println(i);
	}

}
