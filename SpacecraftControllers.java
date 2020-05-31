package Draco;

public class SpacecraftControllers {
	private String controllerPosition;
	private double[] dataSpacecraft;
	private double oxygenSpacecraft;
	private double energySpacecraft;
	private double fuelSpacecraft;
	private double waterSpacecraft;
	private boolean abort;
	
	public SpacecraftControllers(String controllerPosition, double oxygenSpacecraft, double energySpacecraft, double fuelSpacecraft, double waterSpacecraft) {
		this.oxygenSpacecraft = oxygenSpacecraft;
		this.energySpacecraft = energySpacecraft;
		this.fuelSpacecraft = fuelSpacecraft;
		this.waterSpacecraft = waterSpacecraft;
		dataSpacecraft = new double[] {oxygenSpacecraft, energySpacecraft, fuelSpacecraft, waterSpacecraft};
		this.controllerPosition = controllerPosition;
	}
	
	public void onRoute() {
		String out = "The spacecraft is now on route." + "\n" + 
					"ControllerPosition: " + controllerPosition + "\n" + 
					"Oxygen in the spacecraft: " + dataSpacecraft[0] + "\n" +
					"Energy in the spacecraft: " + dataSpacecraft[1] + "\n" +
					"Fuel in the spacecraft: " + dataSpacecraft[2] + "\n" +
					"Water in the spacecraft: " + dataSpacecraft[3] + "\n";
		System.out.println(out);
	}
	
	public void lunarDescent() {
		String out = "The spacecraft is now descending on the moon." + "\n" + 
				"ControllerPosition: " + controllerPosition + "\n" + 
				"Oxygen in the spacecraft: " + dataSpacecraft[0] + "\n" +
				"Energy in the spacecraft: " + dataSpacecraft[1] + "\n" +
				"Fuel in the spacecraft: " + dataSpacecraft[2] + "\n" +
				"Water in the spacecraft: " + dataSpacecraft[3] + "\n";
		System.out.println(out);
	}
	
	public boolean abort(boolean abort) {
		if (abort == true) {
			System.out.println("Mission aborted!");
			return true;
		} else {
			return false;
		}
	}
}
