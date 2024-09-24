package practice2;

import java.util.Scanner;

public class AreaofTriangle {

	public static void main(String[] args) {

double a= 0.5;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of base");
		double b=sc.nextDouble();
		
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter th value of Height");
		int h=sc.nextInt();
		
		double AreaofTriangle=a*b*h;
		
		System.out.println("Area of Triangle is " +AreaofTriangle);
		
		sc.close();
		sc1.close();
		
		
	}

}
