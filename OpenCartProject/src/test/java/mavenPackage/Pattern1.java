package mavenPackage;

public class Pattern1 {

	static int n=4;
	
public static void main(String[] args) {
		
		pattern1(n);
	
	}
	
static void pattern1(int n) {
		
		for (int row=1; row<=n; row++)
			
		{
			for(int col=1; col<=n;col++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
}
