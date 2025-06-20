import java.util.Scanner;
public class baseconvert
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a base 10 number : ");
		int num = sc.nextInt();
		System.out.print("Enter new base (2-9) : ");
		int b = sc.nextInt();
		int max = b*b*b*b-1;
		int rem = 0;
		String x = "";
		int rem1 = 0;
		
		if(b > max)
		{
			System.out.println("Number too large to fit in 4 digits of base " + b);
		}
        else
		{
			for(int i=1;i<=4;i++)
			{
				rem = num%b;
				num = num/b;
				x = rem+x;
				
				
			}
			System.out.println(x);
			
		}
		
	}
}