
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import java.awt.Component;
import java.awt.Panel;
import java.awt.event.ActionEvent;

public class runner {

    JTabbedPane tab;
    JFrame main;
    JPanel panel1, panel2;

    JButton calcular;

    String descicionS = "";
    String DescicionB = "";


    final guiAstronauta astronauta = new guiAstronauta();
    final SustainabilityWindow sus = new SustainabilityWindow();
    final Spacecraft space = new Spacecraft();
    final AstroSchedules astro = new AstroSchedules();
    final EVASUIT eva = new EVASUIT();

    public runner(){

        main = new JFrame();

        panel1 = new JPanel();
        panel2 = new JPanel();

        calcular = new JButton(new AbstractAction("calculate"){

			@Override
			public void actionPerformed(ActionEvent arg0) {
                try{
                check();
                JOptionPane.showMessageDialog(null, descicionS + " and " + DescicionB);}
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, "there are unfilled boxes");
                }
                }
				
			}
            
        );

        panel2.add(calcular);

        tab = new JTabbedPane();

        tab.addTab("astronauta", guiAstronauta.dunno);
        tab.add("susteinability", SustainabilityWindow.frame);
        tab.add("final calculation", panel2);
        tab.add("Spacecraft", Spacecraft.frmSpacecraft);
        tab.add("schedules", astro.frame);
        tab.add("EVA Suit", EVASUIT.frmEvaSuit);

        panel1.add(tab);
        panel1.setVisible(true);

        main.add(panel1);
        main.setVisible(true);
        main.setSize(1070,300);

    }

    public void check(){
        guiAstronauta.conversor();
        Sustainability.calculateBaseSustainability(SustainabilityWindow.foodP, SustainabilityWindow.waterP, SustainabilityWindow.oxygenP, SustainabilityWindow.fuelP);


        double astronauta = Astronaut.health;
        double sustento = Sustainability.sustainabilityBase;
      
        if (astronauta >= 80){
            descicionS = "the astronaut is healty";
        } else if (80 > astronauta && astronauta > 60){
            descicionS = "the astronaut is in good physical and mental condition but culd be better";
        } else if (astronauta <= 60){
            descicionS = "the astronaut is in bad condition";
        }

        if (sustento >= 80){
            DescicionB = "the base is well supllied";
        } else if (80 > sustento && sustento > 60){
            DescicionB = "The base has a medium level of supplies";
        } else if (sustento <= 60){
            DescicionB = "the base is in critical condition of supplies";
        }


    }

    public static void main(final String[] args) {
     runner runner = new runner();

    }
}
