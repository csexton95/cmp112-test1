public class Car {
	public String make;
	public int year;

/* ----------------------------------------------------------------- */

Car () {
	make = "Unknown";
	year = 2015;
	}
// Adds the two class descriptors to teh object car
Car (String thisMake) {
	this();
	make = thisMake;
	}
// Uses this to refer to the object that is calling the method 
Car (String thisMake, int thisYear) {
	make = thisMake;
	year = thisYear;
	}
// Uses this to call both methods, make and year, to make them refer to the object
public String toString() {
	String desc = "Make: " + make + " Year: " + year;
	return desc;
	}
}
// Prints out the data
