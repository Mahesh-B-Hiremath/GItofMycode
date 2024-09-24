package practice2;

import java.util.Scanner;

public class AreaofCircle {
	
	
	

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Enter the value of r");
int r=sc.nextInt();
System.out.println("Enter the value of pi");
double pi= sc.nextDouble();
double Area=pi*r*r;
System.out.println(Area);
sc.close();


}
}
