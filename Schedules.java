public class Schedules {
	private String wakeUp = "Wake Up";
	private String breakfast = "Breakfast";
	private String exercise = "Exercise";
	private String cleanUp = "Clean Up";
	private String inBaseResearch = "In Base Research";
	private String inventoryCheck = "Inventory Check";
	private String launch = "Launch";
	private String inbaseTestingHardware = "In-base Testing Hardware";
	private String inbaseInspection = "In-base Inspection";
	private String inbaseResearch = "In-base Research";
	private String EVAResearch = "EVA Research";
	private String EVATestingHardware = "EVA Testing Hardware";
	private String EVAInspection = "EVA Inspection";
	private String EVAExploration = "EVA Exploration";
	private String freeTime = "Free Time";
	private String dinner = "Dinner";
	private String preSleep = "Pre-Sleep";
	private String sleep = "Sleep";
	private static String[] Schedule1;
	private String[] Schedule2;
	private String[] Schedule3;
	private String[] Schedule4;
	
	public Schedules() {
		Schedule1 = new String[] {wakeUp, breakfast, exercise, cleanUp, inbaseResearch, 
				inventoryCheck, launch, inbaseTestingHardware, inbaseInspection, EVAResearch, 
				EVATestingHardware, EVAExploration, freeTime,  dinner, preSleep, sleep};
		
		Schedule2 = new String[] {wakeUp, cleanUp, inventoryCheck, breakfast, 
				inbaseResearch, inbaseTestingHardware, inbaseInspection, launch, freeTime, 
				EVATestingHardware, EVAResearch, EVAExploration, dinner, preSleep, sleep};
		
		Schedule3 = new String[] {wakeUp, inventoryCheck, inbaseInspection, cleanUp, breakfast, 
				inbaseResearch, freeTime, inbaseTestingHardware, launch, EVAExploration,  
				EVATestingHardware, EVAResearch, dinner, preSleep, sleep};
		
		Schedule4 = new String[] {wakeUp, inbaseInspection, inventoryCheck, breakfast, freeTime, inbaseResearch, inbaseTestingHardware, launch, EVATestingHardware, EVAResearch, EVAExploration, dinner, cleanUp, preSleep, sleep};
	}

	public static String[] getSchedule1() {
		printStringArr(Schedule1);
		return Schedule1;
	}

	public String[] getSchedule2() {
		printStringArr(Schedule2);
		return Schedule2;
	}

	public String[] getSchedule3() {
		printStringArr(Schedule3);
		return Schedule3;
	}

	public String[] getSchedule4() {
		printStringArr(Schedule4);
		return Schedule4;
	}

	static String printStringArr(String[] arr) {
		String line="";
		for (int i = 0 ; i < arr.length ; i++) {
			line= line +arr[i]+" ";
		}
		return line;
	}
}
