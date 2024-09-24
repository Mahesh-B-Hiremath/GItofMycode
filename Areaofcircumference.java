package practice2;

import java.util.Scanner;

public class Areaofcircumference {
	
	public static void main(String[] args) {

		int a= 2;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of pi");
		double pi=sc.nextDouble();
		
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter th value of r");
		int r=sc.nextInt();
		
		double circumference=a*pi*r;
		
		System.out.println("Area of Circumference is " +circumference);
		
		sc.close();
		sc1.close();
		
		
		
		
		
		
	}

}
