import java.util.*;

class HCF
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int hf = 0;

		System.out.print("\n\t\t\tEnter first number : ");
			int a = sc.nextInt();
		System.out.print("\n\t\t\tEnter second number : ");
			int b = sc.nextInt();
		System.out.println("\n\t\t\t===========================");

		int i = 1;

		while(i<=a || i<=b)
		{
			if(a%i==0)
			{
				if(b%i==0)
					hf = i;
			}	
			
			i++;
		}
			System.out.println("\n\t\t\tHCF of two number is : "+hf);

	}
}