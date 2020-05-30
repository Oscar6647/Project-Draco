package Draco;

public class Astronaut {
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
	
	double mentalHealth;
	double physicalHealth;
	double health;
	
	public Astronaut(String name, double mentalHealth, double physicalHealth, int feeling) {
		this.name=name;
		this.mentalHealth=mentalHealth;
		this.physicalHealth=physicalHealth;
		this.health=((mentalHealth+physicalHealth)/2;
		this.feeling= feeling;
	}
	
	public double calculatephysicalHealth(int exercise, int nutrition, int sleep, int hydration, int feeling, int wounded) {
		physicalHealth=exercise*.15+nutrition*.20+sleep*.15+hydration*.20+feeling*10+wounded*5;
		return physicalHealth;
	}
	
	public double calculateMentalHealth(int interaction, int feeling, int hobby, double physicalHealth){
		mentalHealth= interaction*.25+feeling*.25+hobby*.25+physicalHealth*.15+ sleep*10;
		return mentalHealth;
	}

}
