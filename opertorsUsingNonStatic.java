package Practicepackage;

public class opertorsUsingNonStatic {
void addition()
{
	int a= 10;
	int b=20;
	int c= a+b;
	System.out.println(c);
	
	
}

void substraction()
{
	int p=200;
	int q= 150;
	int r= p-q;
	System.out.println(r);
	
	
}

void multiply()
{
	int g=12;
	int f=10;
	int h=g*f;
	System.out.println(h);
	
	
}

void devide()
{
	int t=3500;
	int u=35;
	int v=t*u;
	System.out.println(v);
}

void modulus()
{
	int k=12;
	int l=10;
	int m=k%l;
	System.out.println(m);
}

	public static void main(String[] args) {
		
		opertorsUsingNonStatic x= new opertorsUsingNonStatic();
x.addition();
x.substraction();
x.devide();
x.multiply();
x.modulus();
	}

}
