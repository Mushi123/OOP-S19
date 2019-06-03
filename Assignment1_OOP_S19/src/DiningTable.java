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
public class DiningTable {
	private double weight;
	private double cost;
	private double length;
	private double width;
	
	
	public DiningTable() {
		weight = 0.0;
		cost = 0.0;
		length = 0.0;
		width = 0.0;
	}
	public double getWeight() {
		return this.weight;
	}
	public double getLength() {
		return this.length;
	}
	public double getWidth() {
		return this.width;
	}
	public void setWeight(double wt) {
		if(wt > 0.0 && wt < 20.0)
			this.weight = wt;
		else
			throw new IllegalArgumentException("Weight has to be greater than 0.0 and less than 20.0");
	}
	public void setLength(double l) {
		if(l > 0.0 && l < 20.0)
			this.length = l;
		else
			throw new IllegalArgumentException("Length has to be greater than 0.0 and less than 20.0");
	}
	public void setWidth(double wd) {
		if(wd > 0.0 && wd < 20.0)
			this.width = wd;
		else
			throw new IllegalArgumentException("Width has to be greater than 0.0 and less than 20.0");
	}
	public double getCost() {
		this.cost = this.weight*this.length*this.width; 
		return this.cost;
		
	}
	

}
