package Programmonbatch_progeam;

import java.util.Scanner;

public class greastofthreeno {
	public static void main(String[] args) {
		
		Scanner s =new Scanner (System.in);
		System.out.println("enter the no 1");
		int num1 = s.nextInt();
		System.out.println("enter the no 2");
		int num2= s.nextInt();
		System.out.println("enter the no 3");
		int num3 = s.nextInt();
		System.out.println(" The greatest of 3 numbers is : "+greatest(num1, num2, num3));
	}
		
		public static int greatest(int a,int b,int c)
		{
			int temp = a>b?a:b;
			int res =c>temp?c:temp;
			return res;
		}
		
	}


