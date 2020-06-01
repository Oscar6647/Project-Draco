import java.awt.Button;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class AstroSchedules {

	 JPanel frame;
     JProgressBar MissionDay;
     Panel panel1, panel2;
     

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public AstroSchedules() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JPanel();
		frame.setBounds(100, 100, 521, 351);
        frame.setLayout(new GridLayout(3,1));
        
        panel1 = new Panel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 0));

        panel2 = new Panel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 0));
        
        JLabel lblMissionDayProgress = new JLabel("Mission Day Progress");
		lblMissionDayProgress.setBounds(10, 11, 146, 14);
        panel1.add(lblMissionDayProgress);

		MissionDay = new JProgressBar();
		MissionDay.setValue(0);
		MissionDay.setStringPainted(true);
		MissionDay.setBounds(166, 11, 329, 14);
		panel1.add(MissionDay);
		
		JButton btnStart = new JButton("START");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Should start filling mission day bar slowly& overall stay slower than mission day
				
			}
		});
		btnStart.setBounds(10, 36, 89, 23);
		panel2.add(btnStart);
		
		JLabel lblOverallStayProgress = new JLabel("Overall Stay Progress");
		lblOverallStayProgress.setBounds(109, 36, 146, 14);
		panel2.add(lblOverallStayProgress);
		
		JProgressBar Overrall = new JProgressBar();
		Overrall.setValue(0);
        Overrall.setStringPainted(true);
		Overrall.setBounds(227, 36, 268, 14);
        panel2.add(Overrall);

        frame.add(panel1);
        frame.add(panel2);
        
        JTextPane textPane = new JTextPane();
		//displays schedule
		textPane.setToolTipText("");
		textPane.setBounds(20, 70, 475, 231);
		frame.add(textPane);
		
		JButton btnNewButton = new JButton("Start EVA");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                    JOptionPane.showInputDialog(e, Schedules.printStringArr(Schedules.getSchedule1()));
              
                }
            });
        
	}
}
