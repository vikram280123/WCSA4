package Programmonbatch_progeam;

import java.util.Scanner;

public class leapyear {
	private void mian() {
		 Scanner s = new Scanner(System.in);
		 System.out.println("enter the year : ");
		 int year = s.nextInt();
		 
		// if((year%4==0)&&(year%100 !=0)) ||(year%400 == 0)
		 {
			 
			 System.out.println("year is leap year");
	   	} 
//	else
			
			System.out.println("the yeat is not leap year");

		}

}
