public class Android {	
	public String make;
	public String model;
	public int year;
	public int ram;
//-------------------------------------------------------------------

	Android (String thisMake, String thisModel, int thisYear, int thisRam) {
		make = thisMake;
		model = thisModel;
		year = thisYear;
		ram = thisRam;
	}
// Adds the data members make, model, year, and ram
	Android (String thisMake, String thisModel, int thisYear) {
		make = thisMake;
		model = thisModel;	
		year = thisYear;
	}
	// Says is already used the ram and needs to use the other three
	Android (String thisMake, String thisModel) {
		make = thisMake;	
		model = thisModel;
	}
//Used the year number
	Android (String thisMake) {
		make = thisMake;
	}
}
//Used the model number and will use the make when it is finished running
