import java.util.*;
import java.util.regex.*;

public class UserRegistration{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Name: ");
		String firstName = sc.next();
		while(!Pattern.matches("[A-Z]{1}[a-z]{2,}",firstName)){
			System.out.println("Ivalid input. Enter the First Name: ");
			firstName = sc.next();
		}
		
		System.out.println("Enter the Last Name: ");
		String lastName = sc.next();
		while(!Pattern.matches("[A-Z]{1}[a-z]{2,}",lastName)){
			System.out.println("Ivalid input. Enter the Last Name: ");
			lastName = sc.next();
		}
		
		System.out.println("Enter the Email: ");
		String email = sc.next();
		while(!Pattern.matches("^[A-Za-z0-9]+(\\.[A-Za-z0-9-]+)?@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)?(\\.[A-Za-z]{2,})$",email)){
			System.out.println("Ivalid input. Enter the Email: ");
			email = sc.next();
		}
			
		System.out.println("Enter the Phone Number: ");
		String phone = sc.next();
		while(!Pattern.matches("^[0-9]{2}\\s[0-9]{10}$",phone)){
			System.out.println("Ivalid input. Enter the Phone Number: ");
			phone = sc.nextLine();
		}
		
	}
}
