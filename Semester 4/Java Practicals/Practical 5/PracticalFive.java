import java.util.Scanner;

class PracticalFive
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int no = input.nextInt();
		int j = 2;
		int i = 2;
		int count = 0;
		while(count < no)
		{
			int	flag = 1;
			for(i=2;i<=j/2;i++)
			{
				if(j % i==0)
				{
					flag = 0;
					break;
				}
			}
			if(flag == 1)
			{
				System.out.print(" " + j);
				count++;
			}
			j++;
		}
	}
}