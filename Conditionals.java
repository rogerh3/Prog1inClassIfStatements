import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in); 
		
		System.out.print("What is your first name?"); 
		//String from Keybaord
		String firstName = keyboard.next(); 
		//Output their name
//		System.out.print("Hi " + firstName + ",");
	
//		System.out.print(" What is your age? ");
		//Asking for persons age then storing it
//		int age = keyboard.nextInt();
		
//		int myAge = 21; 
//		System.out.print("Hi " + firstName + "," + " your age is " + age);

//		if (10 > 5) {
//		    System.out.println("10 is greater than 5");
//	}
//		 if ( myAge > 21) {
//			 System.out.println("Older than 21");
//		 }else {
//			 System.out.println("Less than 21");
//		 }
		    
	//Above we just messed with using conditionals	
		// Below we do conditionals with scanner
//		if ( age >= 21) {
//			 System.out.println("You can drink");
//		 }else {
//			 System.out.println("You can't drink");
//		 }		
		
//		int grade = 87;
		char letterGrade = 'a'; 
		
//		if (grade >= 93) {
//			System.out.println("A");
//		} 
//		if (grade >= 85 && grade < 93)  {
//			System.out.println("B");
//		}else {
//			System.out.println("F");
//			}
		
//		if (true) {
			
//		}
		//switch(userChoice)
			//case 1:
				//result = number 1 + number 2
		
		switch (letterGrade) {
		case'A':
		case 'a':
			System.out.println("You got an A");
			break;
		case 'B':
		case 'b':
			System.out.println("You got a B");
			break;
		case 'C':
		case 'c':
			System.out.println("You got a C");
			break;
		case 'D':
		case 'd':
			System.out.println("You got a D");
			break;
		default:
			System.out.println("You failed");
			break;
		}
		
		
		
		
		
		
		 
		
	}

}
