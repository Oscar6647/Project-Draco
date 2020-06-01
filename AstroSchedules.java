package Draco;

import java.awt.Button;
import java.awt.EventQueue;

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AstroSchedules window = new AstroSchedules();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

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
		frame = new JFrame();
		frame.setBounds(100, 100, 521, 351);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getRootPane().setLayout(null);
		
		MissionDay = new JProgressBar();
		MissionDay.setValue(0);
		MissionDay.setStringPainted(true);
		MissionDay.setBounds(166, 11, 329, 14);
		frame.getRootPane().add(MissionDay);
		
		JLabel lblMissionDayProgress = new JLabel("Mission Day Progress");
		lblMissionDayProgress.setBounds(10, 11, 146, 14);
		frame.getRootPane().add(lblMissionDayProgress);
		
		JButton btnStart = new JButton("START");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Should start filling mission day bar slowly& overall stay slower than mission day
				
			}
		});
		btnStart.setBounds(10, 36, 89, 23);
		frame.getRootPane().add(btnStart);
		
		JTextPane textPane = new JTextPane();
		//displays schedule
		textPane.setToolTipText("");
		textPane.setBounds(20, 70, 475, 231);
		frame.getRootPane().add(textPane);
		
		JLabel lblOverallStayProgress = new JLabel("Overall Stay Progress");
		lblOverallStayProgress.setBounds(109, 36, 146, 14);
		frame.getRootPane().add(lblOverallStayProgress);
		
		JProgressBar Overrall = new JProgressBar();
		Overrall.setValue(0);
		Overrall.setStringPainted(true);
		Overrall.setBounds(227, 36, 268, 14);
		frame.getRootPane().add(Overrall);
		
		JButton btnNewButton = new JButton("Start EVA");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                    JOptionPane.showInputDialog(e, Schedules.printStringArr(Schedules.getSchedule1()));
              
                }
            });
        
	}
}

