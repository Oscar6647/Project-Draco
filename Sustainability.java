package Draco;

public class Sustainability {
	private int remainingMissionDays;
	private double sustainability;

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

		calculateSustainability(data);
	}

	private double calculateShipSustainability(double[][] data) {
		for (int i = 0; i < data[0].length; i++) {
			data[2][i] = data[0][i] - (data[1][i] * remainingMissionDays);
		}
		sustainability = (data[2][0] * 0.25) + (data[2][1] * 0.25) + (data[2][2] * 0.40) + (data[2][3] * 0.10);
		return sustainability * 100;
	}
	private double calculateBaseSustainability(double[][] data) {
		for (int i = 0; i < data[0].length-1; i++) {
			data[2][i] = data[0][i] - (data[1][i] * remainingMissionDays);
		}
		sustainability = (data[2][0] * 0.30) + (data[2][1] * 0.30) + (data[2][2] * 0.40);
		return sustainability * 100;
	}

	public double getSustainability() {
		return sustainability;
	}
}
