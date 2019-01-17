import java.util.Scanner;

public class calcAdd
{
	public static void main (String args[])
	{
		float a,b,res;
		char choice , ch;
		Scanner scan = new Scanner(System.in);

		do
		{
			System.out.println("1. ADD");
			System.out.println("2. EXIT\n");
			System.out.println("3. SUBRACT");
			System.out.print("Enter Your Choice: " );
			choice = scan.next().charAt(0);

			switch(choice)
			{
				case '1' :
					System.out.print("Enter Two Number : ");
					a = scan.nextFloat();
					b = scan.nextFloat();
					res = a + b;
					System.out.println("Result = "+res);
					break;

				case '3' :
					System.out.print("Enter Two Number : ");
					a = scan.nextFloat();
					b = scan.nextFloat();
					res = a * b;
					System.out.println("Result = "+res);
					break;

				case '2' :
					System.exit(0);
					break;

				default : 
					System.out.print("INVALID");
					break;
			}

			System.out.println("----------------------------------------");
		}

		while(choice != '2');
	}
}