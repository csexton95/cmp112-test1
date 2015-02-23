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

	Android (String thisMake, String thisModel, int thisYear) {
		make = thisMake;
		model = thisModel;	
		year = thisYear;
	}
	
	Android (String thisMake, String thisModel) {
		make = thisMake;	
		model = thisModel;
	}

	Android (String thisMake) {
		make = thisMake;
	}
}
