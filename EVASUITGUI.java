import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import java.awt.Panel;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class EVASUIT {

    static JPanel frmEvaSuit;
    Panel panel1, panel2, panel3;
	static JProgressBar OxygenBar; 
	static JProgressBar WaterBar;
	static JProgressBar EnergyBar;
	static JProgressBar FuelBar;
	static JProgressBar progressBar;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public EVASUIT() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEvaSuit = new JPanel();
		frmEvaSuit.setBounds(100, 100, 433, 193);
		int max = 100;
        int min = 0;
        
        panel1 = new Panel();
        panel1.setLayout(new GridLayout(3,3));

        panel2 = new Panel();
        panel2.setLayout(new GridLayout(2,1));

        panel3 = new Panel();
        panel3.setLayout(new GridLayout(1,1));

        JLabel lblOxygen = new JLabel("Oxygen Used");
		lblOxygen.setBounds(10, 11, 102, 14);
		panel1.add(lblOxygen);

		OxygenBar = new JProgressBar(min,max);
		OxygenBar.setValue(min);
		OxygenBar.setStringPainted(true);
		OxygenBar.setBounds(126, 11, 146, 14);
        panel1.add(OxygenBar);
        
		
		
		JLabel lblEnergy = new JLabel("Energy Used");
		
		lblEnergy.setBounds(10, 36, 102, 14);
		panel1.add(lblEnergy);
		
		EnergyBar = new JProgressBar(min,max);
		EnergyBar = new JProgressBar(min,max);
		EnergyBar.setValue(min);
		EnergyBar.setStringPainted(true);
		EnergyBar.setBounds(126, 36, 146, 14);
        panel1.add(EnergyBar);
        
        JLabel lblWaterUsed = new JLabel("Water Used");
		lblWaterUsed.setBounds(10, 61, 102, 14);
		panel1.add(lblWaterUsed);
		
		progressBar= new JProgressBar(min,max);
		progressBar = new JProgressBar(min,max);
		progressBar.setValue(min);
		progressBar.setStringPainted(true);
		progressBar.setBounds(126, 61, 146, 14);
		panel1.add(progressBar);
		
		FuelBar= new JProgressBar(min,max);
		
		WaterBar = new JProgressBar(min,max);
		
		JButton btnMonitorSpacecraftStatus = new JButton("Monitor EVA Suit Status");
		btnMonitorSpacecraftStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display info from data[]spacecraft
			}
		});
		btnMonitorSpacecraftStatus.setBounds(10, 94, 190, 23);
		panel2.add(btnMonitorSpacecraftStatus);
		
		JButton btnRecycleOxygen = new JButton("EVA Completed");
		btnRecycleOxygen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"EVA Finished, Refilling HabNode");
				JOptionPane.showMessageDialog(null,"HabNode Refuled, EVA SUIT must be stored back to refuel it");
			}
		});
		btnRecycleOxygen.setBounds(10, 128, 397, 23);
		panel3.add(btnRecycleOxygen);
		
		
		
		JButton btnEvaSuitLeak = new JButton("EVA Suit Leak check");
		btnEvaSuitLeak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if pressed display message: suit optimal  no leaks reported
				//on 30th pressed display message: small suit leak detected, comence safe procedure 
			}
		});
		btnEvaSuitLeak.setBounds(210, 94, 190, 23);
        panel2.add(btnEvaSuitLeak);
        
        frmEvaSuit.setLayout(new GridLayout(3,1));
        frmEvaSuit.add(panel1);
        frmEvaSuit.add(panel2);
        frmEvaSuit.add(panel3);

        frmEvaSuit.setVisible(true);
		
	}
}
