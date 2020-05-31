
public class Astronaut {
	protected static final String resultado = null;
	String name;
	int exercise;
	int nutrition;
	int hydration;
	int sleep;
	int wounded;

	int interaction;
	int feeling;
	int hobby;
	int daysOnMission;
	static double mentalHealth;
	static double physicalHealth;
	double mentalHealthCalc;
	double physicalHealthCalc;
	static double health;
	static double result;

	public Astronaut(String name, int exercise, int nutrition, int sleep, int hydration, int feeling, int wounded,
			int interaction, int hobby) {
		this.name = name;
		this.physicalHealth = calculatePhysicalHealth(exercise, nutrition, sleep, hydration, feeling, wounded);
		this.mentalHealth = calculateMentalHealth(interaction, feeling, hobby,
				calculatePhysicalHealth(exercise, nutrition, sleep, hydration, feeling, wounded), sleep);
		this.health = (this.mentalHealth + this.physicalHealth) / 2;
		this.feeling = feeling;
	}

	public Astronaut() {
	}

	public double calculatePhysicalHealth(int exercise, int nutrition, int sleep, int hydration, int feeling,
			int wounded) {
		physicalHealthCalc = exercise * .20 + nutrition * .25 + sleep * .20 + hydration * .20 + feeling * .10
				+ wounded * .05;
		return physicalHealthCalc;
	}

	public double calculateMentalHealth(int interaction, int feeling, int hobby, double physicalHealth, int sleep) {
		mentalHealthCalc = interaction * .25 + feeling * .25 + hobby * .25 + physicalHealth * .15 + sleep * .10;
		return mentalHealthCalc;
	}

}
