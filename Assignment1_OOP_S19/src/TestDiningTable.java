// Name: Mushfique Ahmed
// R#: 11486497
// Group number: 19
// Q#0 (Common to all Groups)
/***********************************************/
/* Create a class DiningTable with attributes cost,
weight, length and width. Provide methods that
calculate the Table’s perimeter and area. It has set and
get methods for weight, length and width. The set
methods should verify that weight, length and width
are all floating-point numbers larger than 0.0 and less
than 20.0. Also provide the cost method which
generates the cost of DiningTable in dollars using the
formula:
cost = weight * length * height.
Write a class TestDiningTable to test the class
DiningTable. In the TestDiningTable class, use a
‘while’ loop to call each method of DiningTable class
using input from keyboard (using Scanner class). If
the values are not correct input again and show the
results in a formatted manner using JOptionPane.
Program stops if there is no more test data. Data
encapsulation required. */
/***********************************************/
import java.util.Scanner;

public class TestDiningTable {

	public static void main(String[] args) {
//		DiningTable dt = new DiningTable();
//		Scanner reader = new Scanner(System.in);
//		boolean run = true;
//		while(run) {
//			System.out.println("Enter length: ");
//			double lengthInput = reader.nextDouble();
//			System.out.println("Enter width: ");
//			double widthInput = reader.nextDouble();
//			System.out.println("Enter weight: ");
//			double weightInput = reader.nextDouble();
//			try {
//				dt.setLength(lengthInput);
//				dt.setWeight(weightInput);
//				dt.setWidth(widthInput);				
//			}
//			catch(IllegalArgumentException e) {
//				System.out.println(e.getMessage()+". Please enter the numbers again");	
//				continue;
//			}			
//			System.out.println("Your cost is: " + dt.getCost());
//			System.out.println("Do you want to quit? Press n for no and y for yes.");
//			String r = reader.next().toLowerCase();
//			run = !r.contentEquals("y");
//		}	
//		reader.close();
		int [ ] num = {1, 2, 3};
		testingArray(num);
		System.out.println("num[0] = " + num[0] + "\n num[1] = " + num[1] + "\n num[2] =" + num[2]);		

	}
	public static void testingArray( int[ ] value){
		value[0] = 4;
		value[1] = 5;
		value[2] = 6;
	}


}
