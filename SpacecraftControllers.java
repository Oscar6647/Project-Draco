package Draco;

public class SpacecraftControllers {
	private String controllerPosition;
	private double[] dataSpacecraft;
	private boolean abort;
	
	public SpacecraftControllers(String controllerPosition, double oxygenSpacecraft, double energySpacecraft, double fuelSpacecraft, double waterSpacecraft) {
		dataSpacecraft = new double[] {oxygenSpacecraft, energySpacecraft, fuelSpacecraft, waterSpacecraft};
		this.controllerPosition = controllerPosition;
	}
	
	public String onRoute() {
		String out = "The spacecraft is now on route." + "\n" + 
					"ControllerPosition: " + controllerPosition + "\n" + 
					"Oxygen in the spacecraft: " + dataSpacecraft[0] + "\n" +
					"Energy in the spacecraft: " + dataSpacecraft[1] + "\n" +
					"Fuel in the spacecraft: " + dataSpacecraft[2] + "\n" +
					"Water in the spacecraft: " + dataSpacecraft[3] + "\n";
		return out;
	}
	
	public String lunarDescent() {
		String out = "The spacecraft is now descending on the moon." + "\n" + 
				"ControllerPosition: " + controllerPosition + "\n" + 
				"Oxygen in the spacecraft: " + dataSpacecraft[0] + "\n" +
				"Energy in the spacecraft: " + dataSpacecraft[1] + "\n" +
				"Fuel in the spacecraft: " + dataSpacecraft[2] + "\n" +
				"Water in the spacecraft: " + dataSpacecraft[3] + "\n";
		return out;
	}
	
	public void setAbort(boolean abort) {
		this.abort = abort;
		abort(this.abort);
	}

	public String abort(boolean abort) {
		String returnAbort;
		if (abort == true) {
			returnAbort = "Abort Mission!";
			return returnAbort;
		} else { 
			return "";
		}
	}

	public double[] getDataSpacecraft() {
		return dataSpacecraft;
	}
}
