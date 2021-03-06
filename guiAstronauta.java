
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class guiAstronauta {

    private JLabel ejercicio;
    private JLabel nutricion;
    private JLabel hidratacion;
    private JLabel sueño;
    private JLabel heridas;
    private JLabel interaccion;
    private JLabel sentimiento;
    private JLabel pasatiempo;
    private JLabel diasMision;

    static JFrame main;

    private static JTextField exercise;
    private static JTextField nutrition;
    private static JTextField hidratation;
    private static JTextField sleep;
    private static JTextField wounds;
    private static JTextField interaction;
    private static JTextField feeling;
    private static JTextField hobby;
    private static JTextField dayMission;

    private JButton calcular;

    static JPanel dunno;

    private Panel general1, general2, general3, general4;

    private GridLayout layout;

    static int exerciseI;
    static int nutritionI;
    static int hidratationI;
    static int sleepI;
    static int woundsI;
    static int interactionI;
    static int feelingI;
    static int hobbyI;
    private static int dayMissionI;

    public guiAstronauta() {

        main = new JFrame();
        main.setLayout(null);

        setDunno(new JPanel());
        layout = new GridLayout();
        layout.setColumns(2);
        layout.setRows(3);

        general1 = new Panel();
        general1.setLayout(new GridLayout(1, 4));

        general2 = new Panel();
        general2.setLayout(new GridLayout(1, 4));

        general3 = new Panel();
        general3.setLayout(new GridLayout(1, 4));

        general4 = new Panel();
        general4.setLayout(new GridLayout(1, 4));

        ejercicio = new JLabel("    % ejercicio");
        nutricion = new JLabel("    % nutricion");
        hidratacion = new JLabel("  % hidratacion");
        sueño = new JLabel("    % sueño");
        heridas = new JLabel("    % heridas");
        interaccion = new JLabel("  % interaccion");
        sentimiento = new JLabel("  ¿como te sientes?");
        pasatiempo = new JLabel("   pasatiempo");
        diasMision = new JLabel("   Dias mision");
        JLabel sppace = new JLabel();

        exercise = new JTextField();
        nutrition = new JTextField();
        hidratation = new JTextField();
        sleep = new JTextField();
        wounds = new JTextField();
        interaction = new JTextField();
        feeling = new JTextField();
        hobby = new JTextField();
        dayMission = new JTextField();
        

        calcular = new JButton(new AbstractAction("add") {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                conversor();
                JOptionPane.showMessageDialog(null, Astronaut.health);
            }

        
        }
        );



        getDunno().setLayout(new GridLayout(4, 1, 6, 6));

        general1.add(exercise, null);
        general1.add(nutrition, null);
        general1.add(hidratation, null);
        general1.add(sleep, null);
        general1.add(wounds, null);

        general2.add(ejercicio, null);
        general2.add(nutricion, null);
        general2.add(hidratacion, null);
        general2.add(sueño, null);
        general2.add(heridas, null);

        general3.add(interaction, null);
        general3.add(feeling, null);
        general3.add(hobby, null);
        general3.add(dayMission, null);
        general3.add(sppace, null);

        general4.add(interaccion, null);
        general4.add(sentimiento, null);
        general4.add(pasatiempo, null);
        general4.add(diasMision, null);
        general4.add(calcular,null);

        getDunno().add(general1);
        getDunno().add(general2);
        getDunno().add(general3);
        getDunno().add(general4);


        getDunno().setVisible(true);


    }

    public static JPanel getDunno() {
		return dunno;
	}

	public void setDunno(JPanel dunno) {
		this.dunno = dunno;
	}

	public static void conversor() {

        exerciseI = Integer.valueOf(exercise.getText());
        nutritionI = Integer.valueOf(nutrition.getText());
        hidratationI = Integer.valueOf(hidratation.getText());
        sleepI = Integer.valueOf(sleep.getText());
        woundsI = Integer.valueOf(wounds.getText());
        interactionI = Integer.valueOf(interaction.getText());
        feelingI = Integer.valueOf(feeling.getText());
        hobbyI = Integer.valueOf(hobby.getText());
        dayMissionI = Integer.valueOf(dayMission.getText());

        Astronaut astronaut = new Astronaut("holo", exerciseI, nutritionI, sleepI, hidratationI, feelingI, woundsI, interactionI, hobbyI);


    }

}
