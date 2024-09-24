package practice2;

public class NonstatmethodOverloading
{

	void Add(int aa, int bb)
	{
		int ll=aa+bb;
	}
	void Add(int aa, int bb, int cc)
	{
	int kk= aa+bb+cc;
	
	System.out.println(kk);
	
	}
	void substract(int aa, int bb)
	{
		int cc=(aa-bb);
		
		System.out.println(cc);
	}
	void substract(int aa, int bb, int dc)
	{
		int dd=(aa-bb-dc);
		
		System.out.println(dd);
	}
	
	
	
	
	public static void main(String[] args) 
	{
		NonstatmethodOverloading gg= new NonstatmethodOverloading();
		
		gg.Add(101, 220, 123);
		gg.substract(150, 50, 10);
		
		
	}

}
