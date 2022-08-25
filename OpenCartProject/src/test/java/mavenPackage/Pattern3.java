package mavenPackage;

public class Pattern3 {

	static int n=4;
	
public static void main(String[] args) {
		
		pattern3(n);
		pattern31(n);
	
	}
	
static void pattern3(int n) {
		
		for (int row=1; row<=n; row++)
			
		{
			for(int col=n; col>=row;col--)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	

static void pattern31(int n) {
	
	for (int row=1; row<=n; row++)
		
	{
		for(int col=1; col<=n-row+1;col++)
		{
			System.out.print("* ");
		}
		System.out.println("");
	}
}
}

