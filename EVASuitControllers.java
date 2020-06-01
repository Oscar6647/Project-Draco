package Draco;

public class EVASuitControllers {
	private static double dataSuit[];
	private double oxygenSuit;
	private double energySuit;
	private double waterSuit;
	
	public EVASuitControllers(double oxygensuit, double energySuit, double waterSuit) {
		dataSuit = new double[] {oxygenSuit, energySuit, waterSuit};
	}
	
	public void status(double[] dataSuit) {
		String out = "The EVA suit status is:" + "\n" + 
				"Oxygen of the suit: " + dataSuit[0] + "\n" +
				"Energy of the suit: " + dataSuit[1] + "\n" +
				"Water of the suit: " + dataSuit[2];
		System.out.println(out);
	}

	public static int getDataSuit(int i) {
		
		return (int) dataSuit[i];
	}

	
	
}
