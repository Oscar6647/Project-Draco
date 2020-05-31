public class Sustainability {
	/* With information of the ship or spacial base as parameter this program operates and determines wether if the base
	is sutainable for the correct finishing of the mission on time or if they will have some sort of problem with resources 
	during the mission. The program calculates how much time left they have to work with their resources while the base is still habitable*/
	private static int remainingMissionDays;
	static double sustainabilityShip, sustainabilityBase;
	public static double foodP;
	public static double sustainabilityBase2;
	public static double foodDLeft, waterDLeft, oxygenDLeft, fuelDLeft;

	public Sustainability(double foodPercentage, double waterPercentage, double oxygenPercentage, double fuelPercentage,
			double dailyFoodUsage, double dailyWaterUsage, double dailyOxygenUsage, double dailyFuelUsage,
			int remainingMissionDays) {
		double data[][] = new double[3][4];
		this.remainingMissionDays = remainingMissionDays;

		data[0][0] = foodPercentage;
		data[0][1] = waterPercentage;
		data[0][2] = oxygenPercentage;
		data[0][3] = fuelPercentage;

		data[1][0] = dailyFoodUsage;
		data[1][1] = dailyWaterUsage;
		data[1][2] = dailyOxygenUsage;
		data[1][3] = dailyFuelUsage;

		foodDLeft = data[0][0]/data[1][0] ;
		waterDLeft = data[0][1]/data[1][1];
		oxygenDLeft = data[0][2]/data[1][2];
		fuelDLeft = data[0][3]/data[1][3];

	}
	
	static double calculateBaseSustainability(double foodPercentage, double waterPercentage, double oxygenPercentage, double fuelPercentage) {

		sustainabilityBase= (foodPercentage * 0.25) + (waterPercentage * 0.25) + (oxygenPercentage* 0.40) + (fuelPercentage * 0.10);
		
		return sustainabilityBase * 100;
	}

}
