import java.util.Scanner;


public class Assignment4 {

	public static void main(String[]str)
	{	
		Scanner reader = new Scanner(System.in); 		
		System.out.print("Please Enter Month No:");
		int month = reader.nextInt();
		
		switch(month)
		{
			case 1:			
				System.out.println("31 days in January.");
				break;
			case 2:			
				System.out.println("28/29 days in February.");
				break;
			case 3:			
				System.out.println("31 days in March.");
				break;
			case 4:			
				System.out.println("30 days in April.");
				break;
			case 5:			
				System.out.println("31 days in May.");
				break;
			case 6:			
				System.out.println("30 days in June.");
				break;
			case 7:			
				System.out.println("31 days in July.");
				break;
			case 8:			
				System.out.println("31 days in August.");
				break;
			case 9:			
				System.out.println("30 days in September.");
				break;
			case 10:			
				System.out.println("31 days in October.");
				break;
			case 11:			
				System.out.println("30 days in November.");
				break;
			case 12:			
				System.out.println("31 days in December.");
				break;
			default:
				System.out.println("Invalid Month.");
				break;
		}
	}
}
