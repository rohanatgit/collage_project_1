import java.util.Scanner;
public class que_3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter gender: ");
		String gender = sc.nextLine();
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		if(gender.equals("Female"))
		{
			if(age<59&&age>0)
			{
				System.out.println("the percentage of interest is 8.2%.");
			}
			else if(age<101&&age>58)
			{
				System.out.println("the percentage of interest is 9.2%.");
			}
			
		}
		else if(gender.equals("Male"))
		{
			if(age<59&&age>0)
			{
				System.out.println("the percentage of interest is 8.4%.");
			}
			else if(age<101&&age>58)
			{
				System.out.println("the percentage of interest is 10.5%.");
			}
		}
	}

}
