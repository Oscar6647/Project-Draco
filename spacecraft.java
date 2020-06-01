import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class Spacecraft {

	static JPanel frmSpacecraft;
	static JProgressBar OxygenBar; 
	static JProgressBar WaterBar;
	static JProgressBar EnergyBar;
	static JProgressBar FuelBar;
	static JProgressBar progressBar;
	/**
	 * Launch the application.
	 */

	public Spacecraft() {
		initialize();

	}
	private void initialize() {
		frmSpacecraft = new JPanel();
		frmSpacecraft.setLayout(new GridLayout(8,4));
		frmSpacecraft.setVisible(true);
		frmSpacecraft.setSize(400, 300);
		int max = 100;
		int min = 0;


		JLabel lblOxygen = new JLabel("Oxygen Used");
		lblOxygen.setBounds(10, 11, 102, 14);
		lblOxygen.setHorizontalAlignment(JLabel.CENTER);
		frmSpacecraft.add(lblOxygen);

		OxygenBar = new JProgressBar(min,max);
		OxygenBar.setValue(min);
		OxygenBar.setStringPainted(true);
		OxygenBar.setBounds(126, 11, 146, 14);
		frmSpacecraft.add(OxygenBar);

		JLabel lblWaterUsed = new JLabel("Water Used");
		lblWaterUsed.setBounds(282, 9, 102, 14);
		lblWaterUsed.setHorizontalAlignment(JLabel.CENTER);
		frmSpacecraft.add(lblWaterUsed);
		
		progressBar= new JProgressBar(min,max);
		progressBar = new JProgressBar(min,max);
		progressBar.setValue(min);
		progressBar.setStringPainted(true);
		progressBar.setBounds(349, 9, 146, 14);
		frmSpacecraft.add(progressBar);
		
		
		JLabel lblEnergy = new JLabel("Energy Used");
		lblEnergy.setBounds(10, 36, 102, 14);
		lblEnergy.setHorizontalAlignment(JLabel.CENTER);
		frmSpacecraft.add(lblEnergy);

		EnergyBar = new JProgressBar(min,max);
		EnergyBar = new JProgressBar(min,max);
		EnergyBar.setValue(min);
		EnergyBar.setStringPainted(true);
		EnergyBar.setBounds(126, 36, 146, 14);
		frmSpacecraft.add(EnergyBar);
		
		JLabel lblFuel = new JLabel("Fuel Used");
		lblFuel.setBounds(10, 61, 102, 14);
		lblFuel.setHorizontalAlignment(JLabel.CENTER);
		frmSpacecraft.add(lblFuel);
		
		FuelBar= new JProgressBar(min,max);
		FuelBar.setValue(0);
		FuelBar.setStringPainted(true);
		FuelBar.setBounds(126, 61, 146, 14);
		frmSpacecraft.add(FuelBar);
		
		WaterBar = new JProgressBar(min,max);
		
		JButton btnMonitorSpacecraftStatus = new JButton("Monitor Spacecraft Status");
		btnMonitorSpacecraftStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display info from data[]spacecraft
			}
		});
		btnMonitorSpacecraftStatus.setBounds(10, 94, 190, 23);
		frmSpacecraft.add(btnMonitorSpacecraftStatus);
		
		JButton btnRecycleOxygen = new JButton("Recycle Oxygen");
		btnRecycleOxygen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//if pressed 13 times must open popout, later explain
			}
		});
		btnRecycleOxygen.setBounds(10, 128, 190, 23);
		frmSpacecraft.add(btnRecycleOxygen);
		
		JButton btnTliBurn = new JButton("TLI BURN ");
		btnTliBurn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//should show slowly not inmediatly
				TLIBURN();
		    } 
		});
		btnTliBurn.setBounds(10, 157, 190, 23);
		frmSpacecraft.add(btnTliBurn);
		
		JButton btnNewButton = new JButton(new AbstractAction("Lunar descendt") {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				final SwingWorker worker = new SwingWorker() {

					@Override
					protected Object doInBackground() throws Exception {
						LunarDescent();
						return null;
					}
					};};});
		
		
		//new JButton("Lunar Descent");
		//btnNewButton.addActionListener(new ActionListener() {
		//	public void actionPerformed(ActionEvent e) {
				//should show slowly not inmediatly
		////		LunarDescent();
			//}
		//});
		btnNewButton.setBounds(210, 157, 190, 23);
		frmSpacecraft.add(btnNewButton);
		
		JButton btnSpacecraftPosition = new JButton("Spacecraft Position");
		btnSpacecraftPosition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display info from method on route if pressed 4 times must show info from lunardescent
			}
		});
		btnSpacecraftPosition.setBounds(210, 92, 190, 26);
		frmSpacecraft.add(btnSpacecraftPosition);
		
		JButton btnAbort = new JButton("Abort");
		btnAbort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//popout mission aborted must return back to homescreen
			}
		});
		btnAbort.setBounds(210, 128, 190, 26);
		
		
		JButton btnNewButton_1 = new JButton("Refuel Water");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//when pressed it must reset progress, also waterbar must show alert when at 80% used
				
			}
		});
		btnNewButton_1.setBounds(410, 94, 119, 23);

		JButton btnNewButton_2 = new JButton("Recharge Energy");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //resets energy bar progress to 0
            }
        });
		btnNewButton_2.setBounds(410, 128, 119, 23);
		frmSpacecraft.add(btnNewButton_2);

		frmSpacecraft.add(btnNewButton_1);

		frmSpacecraft.add(btnAbort);
		
		
		
		
	}
	public void TLIBURN() {
		int i = 0; 
        try { 
            while (i <= 50) { 
                // fill the menu bar 
                FuelBar.setValue(i + 10); 
  
                // delay the thread 
                Thread.sleep(1000); 
                i += 20; 
            } 
        } 
        catch (Exception e) { 
        } 
	}
	public void LunarDescent() {
		int i = 50; 
		int FuelBarStatus = 0;
       try{
		   FuelBar.setValue(50);
            //do  { 
                // fill the menu bar 
				//FuelBar.setValue(FuelBarStatus+10);
			 // delay the thread 
			// Thread.sleep(10); 
			//FuelBarStatus =+ 20; }while (FuelBarStatus < 100);
} catch(Exception e){
	JOptionPane.showMessageDialog(null, "valio pito");
}
}

}
