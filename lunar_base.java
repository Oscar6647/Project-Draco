import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class LunarBase {

	 static JPanel frmLunarbase;
	 static JProgressBar OxygenBar; 
	static JProgressBar WaterBar;
	static JProgressBar EnergyBar;
	static JProgressBar FuelBar;
	static JProgressBar Depressurized;
	static JProgressBar progressBar;
	static JProgressBar WaterUsed;
	static JProgressBar crew;
	static JProgressBar RoverStatus;
private SpacecraftControllers newControllers;
private JButton btnMonitorBaseStatus;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public LunarBase() {
			newControllers = new SpacecraftControllers(" ", 100.0, 100.0, 100.0, 100.0);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLunarbase = new JPanel();
		frmLunarbase.setBounds(100, 100, 624, 228);
        frmLunarbase.setLayout(new GridLayout(2,1));
        frmLunarbase.setVisible(true);
		int max = 100;
        int min = 0;
        
        Panel panel1 = new Panel();
        panel1.setLayout(new GridLayout(6,6));

        Panel panel2 = new Panel();
        panel2.setLayout(new GridLayout(3,3));


        JLabel lblOxygen = new JLabel("Oxygen Used");
		lblOxygen.setBounds(10, 11, 102, 14);
		panel1.add(lblOxygen);

		OxygenBar = new JProgressBar(min,max);
		OxygenBar.setValue(min);
		OxygenBar.setStringPainted(true);
		OxygenBar.setBounds(122, 13, 146, 14);
        panel1.add(OxygenBar);

        JLabel lblWaterUsed = new JLabel("Water Used");
		lblWaterUsed.setBounds(282, 11, 102, 14);
		panel1.add(lblWaterUsed);
		
		WaterUsed= new JProgressBar(min,max);
		WaterUsed = new JProgressBar(min,max);
		WaterUsed.setValue(min);
		WaterUsed.setStringPainted(true);
		WaterUsed.setBounds(404, 13, 146, 14);
		panel1.add(WaterUsed);

		
		JLabel lblEnergy = new JLabel("Energy Used");	
		lblEnergy.setBounds(10, 36, 102, 14);
		panel1.add(lblEnergy);
		
		EnergyBar = new JProgressBar(min,max);
		EnergyBar = new JProgressBar(min,max);
		EnergyBar.setValue(min);
		EnergyBar.setStringPainted(true);
		EnergyBar.setBounds(126, 36, 146, 14);
        panel1.add(EnergyBar);
        
        	
		JLabel lblRover = new JLabel("Rover Status");
		lblRover.setBounds(282, 36, 136, 14);
		panel1.add(lblRover);
		
		RoverStatus = new JProgressBar(0, 100);
		RoverStatus.setValue(max);
		RoverStatus.setStringPainted(true);
		RoverStatus.setBounds(404, 38, 146, 14);
        panel1.add(RoverStatus);

        JLabel lblFuel = new JLabel("Node Depressurized");
		lblFuel.setBounds(10, 61, 126, 14);
		panel1.add(lblFuel);
		
		Depressurized= new JProgressBar(min,max);
		Depressurized = new JProgressBar(min,max);
		Depressurized.setValue(min);
		Depressurized.setStringPainted(true);
		Depressurized.setBounds(136, 61, 146, 14);
        panel1.add(Depressurized);
        

		JLabel CrewBase = new JLabel("Crew in Base");
		CrewBase.setBounds(292, 61, 136, 14);
		panel1.add(CrewBase);
        
        crew = new JProgressBar(0, 100);
		crew.setValue(max);
		crew.setStringPainted(true);
		crew.setBounds(404, 63, 146, 14);
		panel1.add(crew);

        
		JButton btnMonitorBaseStatus = new JButton("Monitor Base Status");
		btnMonitorBaseStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display info from data[]sustainability
				displayDataSpacecraftArray();
			}
		});
		btnMonitorBaseStatus.setBounds(10, 94, 190, 23);
		panel2.add(btnMonitorBaseStatus);
		
		JButton btnRecycleOxygen = new JButton("Recycle Oxygen");
		btnRecycleOxygen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//sets Oxygen bar progress to 0
			}
		});
		btnRecycleOxygen.setBounds(10, 128, 190, 23);
		panel2.add(btnRecycleOxygen);
		
		JButton btnTliBurn = new JButton("Depressurize Hab Node");
		btnTliBurn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//should show slowly not inmediatly
				Depressure();
		    } 
		});
		btnTliBurn.setBounds(10, 157, 190, 23);
		panel2.add(btnTliBurn);
		
		JButton btnNewButton = new JButton("Start EVA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Depressurized.getValue()==100 && crew.getValue()!=0) {
					JOptionPane.showMessageDialog(Depressurized, "GO for EVA!");
					crew.setValue(crew.getValue()-25);
				}
				else if(Depressurized.getValue()!=100) {
					JOptionPane.showMessageDialog(null, "NO GO FOR EVA, NODE is still Pressurized", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				else if(crew.getValue()==0) {
					JOptionPane.showMessageDialog(null, "NO GO FOR EVA, All of the Crew Members are outside", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
			}		
		});
		btnNewButton.setBounds(210, 157, 190, 23);
		panel2.add(btnNewButton);
		
		JButton btnRover = new JButton("Rover");
		btnRover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//display optimal signs but if pressed 17 times should appear damged fender if pressed 25 times
				//show must give maintiance. give short instructions
			if (RoverStatus.getValue()>=75) {
					JOptionPane.showMessageDialog(null, "Rover is in Optimal Condition! Drive Safely!");
					RoverStatus.setValue(RoverStatus.getValue()-5);
			}else if(RoverStatus.getValue()>=50 && RoverStatus.getValue()<=75) {
				JOptionPane.showMessageDialog(null, "Rover is A little bit damaged! I will provide Instructions shortly");
				JOptionPane.showMessageDialog(null, "Inspect Fenders, looks like we have dmaged a little bit, Keep dust away from"
						+ " camara it apears that the picture is blurry");
				RoverStatus.setValue(RoverStatus.getValue()-10);
			} else if(RoverStatus.getValue()>=25 && RoverStatus.getValue()<=50) {
				JOptionPane.showMessageDialog(null, "Rover is damaged considerly! I will provide Instructions shortly");
				JOptionPane.showMessageDialog(null, "Inspect Tires, as it appears to have damged, Oxygen Rover is low start"
						+ " refulling it with base oxygen supply.");
				RoverStatus.setValue(RoverStatus.getValue()-15);
			}else {
				JOptionPane.showMessageDialog(null, "ROVER TOO DAMAGED", "DAMAGED ROVER", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Inspect Tires, as it appears to have damged, Oxygen Rover is low start"
						+ " refulling it with base oxygen supply.");
				JOptionPane.showMessageDialog(null, "Inspect Fenders, looks like we have dmaged a little bit, Keep dust away from"
						+ " camara it apears that the picture is blurry");
				JOptionPane.showMessageDialog(null, "DONŽT Forget Leak Checking");
				RoverStatus.setValue(max);
			}
			}
		});
		btnRover.setBounds(210, 92, 190, 26);
		panel2.add(btnRover);
		
		JButton btnAbort = new JButton("Abort");
		btnAbort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Mission has comenced ABORT PROTOCOL A-01", "ABORTED", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnAbort.setBounds(210, 128, 190, 26);
		panel2.add(btnAbort);
		
		JButton btnNewButton_1 = new JButton("Refuel Water");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//when pressed it must reset progress, also waterbar must show alert when at 80% used
			}
		});
		JButton btnNewButton_2 = new JButton("Recharge Energy");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//resets energy bar progress to 0
			}
		});
		btnNewButton_2.setBounds(410, 128, 190, 23);
		panel2.add(btnNewButton_2);
		btnNewButton_1.setBounds(410, 94, 188, 23);
		panel2.add(btnNewButton_1);
		
		
	
		
		
		
		JButton btnRepressurizeHabNode = new JButton("Repressurize Hab Node");
		btnRepressurizeHabNode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Resets Depressure to 0
			}
		});
		btnRepressurizeHabNode.setBounds(410, 157, 190, 23);
        panel2.add(btnRepressurizeHabNode);
        
        frmLunarbase.add(panel1);
        frmLunarbase.add(panel2);
		
	}
	public void Depressure() {
		int i = 0; 
        try { 
            while (i <= 100) { 
                // fill the menu bar 
                Depressurized.setValue(i + 10); 
                // delay the thread 
                Thread.sleep(30); 
                i += 20; 
            } 
        } 
        catch (Exception e) { 
        } 
	}
	private void displayDataSpacecraftArray() {
        String[] dataName = new String[] {"Oxygen", "Energy", "Rover", "Water"};
        double[] newDataSpacecraft = newControllers.getDataSpacecraft();
        String out = "";
        for (int i = 0 ; i < newDataSpacecraft.length ; i++) {
            out += dataName[i] + ": " + String.valueOf(newDataSpacecraft[i]) + "\n";
        }
        JOptionPane.showMessageDialog(btnMonitorBaseStatus, out);

    }
}
