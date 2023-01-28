package Programmonbatch_progeam;

import java.util.Scanner;

public class gretestoftwonumber { 
	public static void main(String[] args) {
		Scanner s =new Scanner (System.in);
		System.out.println("enter the number 1");
		int a = s.nextInt();
		System.out.println("enter the no 2");
		int b= s.nextInt();
		System.out.println("the gretest no is "+greast(a,b));
	}
		
		public static int greast(int a, int b)
		{
			int res=a>b?a:b;
			return res;
		}
		
		
	}


