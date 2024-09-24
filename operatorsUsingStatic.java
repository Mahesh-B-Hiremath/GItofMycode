package Practicepackage;

public class operatorsUsingStatic {
	
	static void addition()
	{
		int a= 10;
		int b=20;
		int c= a+b;
		System.out.println(c);
	}
	
	static void substraction()
	{
		int p=200;
		int q= 150;
		int r= p-q;
		System.out.println(r);
	}
		
	static	void multiply()
		{
			int e=12;
			int f=10;
			int h=e*f;
			System.out.println(h);
		}
			
		static	void devide()
			{
				int t=3500;
				int u=35;
				int v=t*u;
				System.out.println(v);
			}

		static	void modulus()
			{
				int k=12;
				int l=10;
				int m=k%l;
				System.out.println(m);
			}

	public static void main(String[] args) {
		addition();
		substraction();
		multiply();
		devide();
		modulus();
		
	}

}
