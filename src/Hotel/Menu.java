package Hotel;

import java.util.Scanner;

public class Menu {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Welcome to Fresh Point");
			System.out.println("Today's menu");
			System.out.println("(1) Pizza ");
			System.out.println("(2) Garlic bread");
			System.out.println("(3) Chichen Popcorn");
			System.out.println("(4) Nachos");
			System.out.println("(5) Coke");
			System.out.println("select your choice of Meal: ");
			int a=s.nextInt();
			switch(a)
			{
			case 1:
				System.out.println("you picked Pizza");
				System.out.println("(1) Medium Pizza = Rs.249");
				System.out.println("(2) Large Pizza = Rs.499");
				System.out.println("please select your type of pizza: ");
				int choice=s.nextInt();
				if(choice==1) {
					System.out.println("you picked Medium Pizza");
					System.out.println("Quantity: ");
					int quantity=s.nextInt();
					System.out.println("you have picked: "+quantity+" Medium Pizza");
					System.out.println("Total amount: "+(quantity*249));
				}else {
					System.out.println("you picked Large Pizza");
					System.out.println("Quantity: ");
					int quantity=s.nextInt();
					System.out.println("You have picked: "+quantity+" Large Pizza");
					System.out.println("Total amount: "+(quantity*499));
				}
				break;
				
			case 2:
				System.out.println("You picked Garlic Bread");
				System.out.println("(1) veg stuffed  = Rs.120");
				System.out.println("(2) Chicken stuffed = Rs.180");
				System.out.println("(3) pork stuffed = Rs.160");
				System.out.println("Please select your type of bread: ");
				int bread=s.nextInt();
				if(bread==1) {
					System.out.println("you picked veg stuffed bread ");
					System.out.println("Quantity: ");
					int quantity=s.nextInt();
					System.out.println("you have picked: "+quantity+" veg stuffed bread");
					System.out.println("Total amount: "+(quantity*120));
					}else if(bread==2) {
						System.out.println("you picked chicken stuffed bread ");
						System.out.println("Quantity: ");
						int quantity=s.nextInt();
						System.out.println("you have picked: "+quantity+" Chicken stuffed bread");
						System.out.println("Total amount: "+(quantity*180));
					}else {
						System.out.println("you picked Pork stuffed bread ");
						System.out.println("Quantity: ");
						int quantity=s.nextInt();
						System.out.println("you have picked: "+quantity+" Pork stuffed bread");
						System.out.println("Total amount: "+(quantity*160));
					}
				break;
			case 3:
				System.out.println("You picked Chicken Popcorn");
				System.out.println("(1) Small Chicken Popcorn  = Rs.199");
				System.out.println("(2) Medium Chicken Popcorn = Rs.399");
				System.out.println("(3) Large Chicken Popcorn = Rs.499");
				System.out.println("Which size do you preffer: ");
				int pop=s.nextInt();
				if(pop==1) {
					System.out.println("you picked Small Chicken Popcorn ");
					System.out.println("Quantity: ");
					int quantity=s.nextInt();
					System.out.println("you have picked: "+quantity+" Small Chicken Popcorn");
					System.out.println("Total amount: "+(quantity*199));
				}else if(pop==2) {
					System.out.println("you picked Medium Chicken Popcorn ");
					System.out.println("Quantity: ");
					int quantity=s.nextInt();
					System.out.println("you have picked: "+quantity+" Medium Chicken Popcorn");
					System.out.println("Total amount: "+(quantity*399));
					}else {
						System.out.println("you picked Large Chicken Popcorn ");
						System.out.println("Quantity: ");
						int quantity=s.nextInt();
						System.out.println("you have picked: "+quantity+" Large Chicken Popcorn");
						System.out.println("Total amount: "+(quantity*499));
						}
				break;
			case 4:
				System.out.println("You picked Nachos");
				System.out.println("(1) Corn Nachos = Rs.90");
				System.out.println("(2) Chicken Nachos = Rs.110");
				System.out.println("(3) Beef Nachos = Rs.130");
				System.out.println("Please select your type of Nachos: ");
				int nachos=s.nextInt();
				if(nachos==1) {
					System.out.println("you picked Corn Nachos ");
					System.out.println("Quantity: ");
					int quantity=s.nextInt();
					System.out.println("you have picked: "+quantity+" Corn Nachos");
					System.out.println("Total amount: "+(quantity*90));
				}else if(nachos==2) {
					System.out.println("you picked  Chicken Nachos");
					System.out.println("Quantity: ");
					int quantity=s.nextInt();
					System.out.println("you have picked: "+quantity+"  Chicken Nachos");
					System.out.println("Total amount: "+(quantity*110));
				}else {
					System.out.println("you picked  Beef Nachos");
					System.out.println("Quantity: ");
					int quantity=s.nextInt();
					System.out.println("you have picked: "+quantity+"  Beef Nachos");
					System.out.println("Total amount: "+(quantity*130));
				}
				break;
			case 5:
				System.out.println("You picked Coke");
				System.out.println("(1) Small Coke = $5.00");
				System.out.println("(2) Medium Coke = $7.00");
				System.out.println("(3) Large Coke = $9.00");
				System.out.println("Which size do you preffer: ");
				int coke=s.nextInt();
				if(coke==1) {
					System.out.println("you picked Small Coke ");
					System.out.println("Quantity: ");
					int quantity=s.nextInt();
					System.out.println("you have picked: "+quantity+" Small Coke");
					System.out.println("Total amount: "+(quantity*390));
				}else if(coke==2) {
					System.out.println("you picked  Medium Coke");
					System.out.println("Quantity: ");
					int quantity=s.nextInt();
					System.out.println("you have picked: "+quantity+"  Medium Coke");
					System.out.println("Total amount: "+(quantity*546));
				}else {
					System.out.println("you picked  Large Coke");
					System.out.println("Quantity: ");
					int quantity=s.nextInt();
					System.out.println("you have picked: "+quantity+"  Large Coke");
					System.out.println("Total amount: "+(quantity*702));
				}
				break;
			}
	 }
}
