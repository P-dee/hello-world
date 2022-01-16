import java.util.*;
public class Quesn19 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a number by the user :");
		int n = 4;
		
		int i,j,k;
		for(i=1;i<=n;i++)
		{
			for(k=1;k<=n-i;k++)
			{	
				System.out.print("");
			}
			for(j=1;j<=i;j++)
				System.out.print(i++);
			    System.out.print("");
			    
		}

	}

}
