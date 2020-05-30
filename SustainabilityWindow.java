package Draco;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SustainabilityWindow {

	private JFrame frame;
	private JTextField foodPer;
	private JTextField waterPer;
	private JTextField oxygenPer;
	private JTextField fuelPer;
	private JTextField foodDaily;
	private JTextField waterDaily;
	private JTextField oxygenDaily;
	private JTextField fuelDaily;
	private JTextField remainingDays;
	private JButton btnNewButton;
	private JLabel lblSustainability;
	private JLabel lblRemainingMissionDays;
	private double foodP;
	private double waterP;
	private double oxygenP;
	private double fuelP;
	private double foodD;
	private double waterD;
	private double oxygenD;
	private double fuelD;
	private int remainingD;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SustainabilityWindow window = new SustainabilityWindow();
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
	public SustainabilityWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 875, 180);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Food");
		lblNewLabel.setBounds(266, 0, 31, 16);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblWater = new JLabel("Water");
		lblWater.setBounds(430, 0, 35, 16);
		lblWater.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		frame.getContentPane().add(lblWater);
		
		JLabel lblOxygen = new JLabel("Oxygen");
		lblOxygen.setBounds(589, 0, 48, 16);
		lblOxygen.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		frame.getContentPane().add(lblOxygen);
		
		JLabel lblFuel = new JLabel("Fuel");
		lblFuel.setBounds(768, 0, 26, 16);
		lblFuel.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		frame.getContentPane().add(lblFuel);
		
		JLabel lblPercentage = new JLabel("Percentage");
		lblPercentage.setBounds(67, 26, 68, 16);
		lblPercentage.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		frame.getContentPane().add(lblPercentage);
		
		foodPer = new JTextField();
		foodPer.setBounds(202, 21, 160, 26);
		frame.getContentPane().add(foodPer);
		foodPer.setColumns(10);
		
		waterPer = new JTextField();
		waterPer.setBounds(367, 21, 161, 26);
		frame.getContentPane().add(waterPer);
		waterPer.setColumns(10);
		
		oxygenPer = new JTextField();
		oxygenPer.setBounds(533, 21, 160, 26);
		frame.getContentPane().add(oxygenPer);
		oxygenPer.setColumns(10);
		
		fuelPer = new JTextField();
		fuelPer.setBounds(698, 21, 166, 26);
		frame.getContentPane().add(fuelPer);
		fuelPer.setColumns(10);
		
		JLabel lblDailyUsage = new JLabel("Daily Usage");
		lblDailyUsage.setBounds(64, 57, 74, 16);
		lblDailyUsage.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		frame.getContentPane().add(lblDailyUsage);
		
		foodDaily = new JTextField();
		foodDaily.setBounds(202, 52, 160, 26);
		frame.getContentPane().add(foodDaily);
		foodDaily.setColumns(10);
		
		waterDaily = new JTextField();
		waterDaily.setBounds(367, 52, 161, 26);
		waterDaily.setColumns(10);
		frame.getContentPane().add(waterDaily);
		
		oxygenDaily = new JTextField();
		oxygenDaily.setBounds(533, 52, 160, 26);
		oxygenDaily.setColumns(10);
		frame.getContentPane().add(oxygenDaily);
		
		fuelDaily = new JTextField();
		fuelDaily.setBounds(698, 52, 166, 26);
		fuelDaily.setColumns(10);
		frame.getContentPane().add(fuelDaily);
		
		btnNewButton = new JButton("Calculate Sustainability");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSustainabilityPressed();
			}
		});
		btnNewButton.setBounds(6, 113, 191, 29);
		frame.getContentPane().add(btnNewButton);
		
		lblSustainability = new JLabel("Sustainability %:");
		lblSustainability.setBounds(231, 119, 102, 16);
		frame.getContentPane().add(lblSustainability);
		
		lblRemainingMissionDays = new JLabel("Remaining Mission Days:");
		lblRemainingMissionDays.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblRemainingMissionDays.setBounds(532, 118, 161, 16);
		frame.getContentPane().add(lblRemainingMissionDays);
		
		remainingDays = new JTextField();
		remainingDays.setColumns(10);
		remainingDays.setBounds(698, 113, 166, 26);
		frame.getContentPane().add(remainingDays);
	}
	
	private void btnSustainabilityPressed() {
		foodP = Double.valueOf(foodPer.getText());
		waterP = Double.valueOf(waterPer.getText());
		oxygenP = Double.valueOf(oxygenPer.getText());
		fuelP = Double.valueOf(fuelPer.getText());
		foodD = Double.valueOf(foodDaily.getText());
		waterD = Double.valueOf(waterDaily.getText());
		oxygenD = Double.valueOf(oxygenDaily.getText());
		fuelD = Double.valueOf(fuelDaily.getText());
		remainingD = Integer.valueOf(remainingDays.getText());
		
		Sustainability mission = new Sustainability(foodP, waterP, oxygenP, fuelP, foodD, waterD, oxygenD, fuelD, remainingD);
		lblSustainability.setText(String.valueOf(mission.getSustainability()));
	}
}
