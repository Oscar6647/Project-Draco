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
	double mentalHealthCalc;
	double physicalHealthCalc;
	double health;
	
	public Astronaut(String name, int exercise, int nutrition, int sleep, int hydration, int feeling, int wounded, int interaction, int hobby) {
		this.name=name;
		this.physicalHealth=calculatePhysicalHealth(exercise, nutrition, sleep, hydration, feeling, wounded)*10;
		this.mentalHealth=calculateMentalHealth(interaction, feeling, hobby, calculatePhysicalHealth(exercise, nutrition, sleep, hydration, feeling, wounded))*10;
		this.health=(this.mentalHealth+this.physicalHealth)/2;
		this.feeling= feeling;
	}
	
	public double calculatePhysicalHealth(int exercise, int nutrition, int sleep, int hydration, int feeling, int wounded) {
		physicalHealthCalc=exercise*.20+nutrition*.25+sleep*.20+hydration*.20+feeling*.10+ wounded*.05;
		return physicalHealthCalc;
	}
	
	public double calculateMentalHealth(int interaction, int feeling, int hobby, double physicalHealth){
		mentalHealthCalc= interaction*.25+feeling*.25+hobby*.25+physicalHealth*.15+ sleep*.10;
		return mentalHealthCalc;
	}
	
	 public  void resultado(Double physicalHealth, Double mentalHealt) {
        Astronaut.result = (physicalHealth * 0.50) + (mentalHealth * 0.50);
    }

}
