import java.util.Scanner;

class Apple {
	String type;
	String age;
	String doe;
	double cost;
}

class Banana {
	String state;
	String age;
	String doe;
	double cost;
}

public class FruitMarket {
	
	public static void main(String[] args) {
		Apple apple1 = new Apple();
		apple1.type = "Green";
		apple1.age = "Slightly Wrinkly";
		apple1.doe = "20.3.";
		apple1.cost = 2.50;
		
		Apple apple2 = new Apple();
		apple2.type = "Red";
		apple2.age = "Very good";
		apple2.doe = "25.3.";
		apple2.cost = 3;
		
		Banana banana1 = new Banana();
		banana1.state = "Slightly damaged";
		banana1.age = "30% black";
		banana1.doe = "22.3.";
		banana1.cost = 1.75;
		
		Banana banana2 = new Banana();
		banana2.state = "Slightly unripe";
		banana2.age = "20% green";
		banana2.doe = "28.3.";
		banana2.cost = 2.85;
		
		Banana banana3 = new Banana();
		banana3.state = "Ripe";
		banana3.age = "5% black";
		banana3.doe = "30.3.";
		banana3.cost = 3.20;
		
		
		Scanner input = new Scanner(System.in);		
		System.out.println("Welcome,type ? for list of fruit on stock");		
		loop: while(input.hasNext()){
			String userinput = input.nextLine();
		
		switch(userinput) {
		case "?":
			System.out.println("Currently on stock: Apple,Banana");	
			break;
		
		case "Apple": 
			System.out.println("Apples in stock: 2");
			System.out.println("Preview apple? (Enter apple1,apple2..): ");
			break;
		
		case "Banana":
			System.out.println("Bananas in stock: 3");
			System.out.println("Preview banana? (Enter banana1,banana2..): ");
			break;
			
		case "banana1":
			System.out.println("State: " + banana1.state);
			System.out.println("Age: " + banana1.age);
			System.out.println("Date of expiration: " + banana1.doe);
			System.out.println("Cost: " + banana1.cost + "$");
			System.out.println("Buy this banana? (Y/N)");
			break;
			
		case "banana2":
			System.out.println("State: " + banana2.state);
			System.out.println("Age: " + banana2.age);
			System.out.println("Date of expiration: " + banana2.doe);
			System.out.println("Cost: " + banana2.cost + "$");
			System.out.println("Buy this banana? (Y/N)");
			break;
			
		case "banana3":
			System.out.println("State: " + banana3.state);
			System.out.println("Age: " + banana3.age);
			System.out.println("Date of expiration: " + banana3.doe);
			System.out.println("Cost: " + banana3.cost + "$");
			System.out.println("Buy this banana? (Y/N)");
			break;
			
		case "apple1":
			System.out.println("Type: " + apple1.type);
			System.out.println("Age: " + apple1.age);
			System.out.println("Date of expiration: " + apple1.doe);
			System.out.println("Cost: " + apple1.cost + "$");
			System.out.println("Buy this apple? (Y/N)");
			break;
			
		case "apple2":
			System.out.println("Type: " + apple2.type);
			System.out.println("Age: " + apple2.age);
			System.out.println("Date of expiration: " + apple2.doe);
			System.out.println("Cost: " + apple2.cost + "$");
			System.out.println("Buy this apple? (Y/N)");
			break;
			
			
		case "Y":
			System.out.println("Thank you please come again!");
			break loop;
			
		case "N":
			System.out.println("Welcome,type ? for list of fruit on stock");
			continue;
			
		case "reset":
			System.out.println("Welcome,type ? for list of fruit on stock");
			continue;
			
		default:
			System.out.println("Invalid input,please try again(Type reset to restart)");
			continue;
			
			}
		}
	}	
}