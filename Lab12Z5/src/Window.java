import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Window extends JFrame {
    private JTextField tF;
    private final JLabel jL;
    public List<String> list = new ArrayList<String>();
    private JButton wprowadz;
    private JButton zamknij;
    public Window() {
        this.setSize(400,200);
        jL = new JLabel("Randomowe cyfry");
        tF = new JTextField("",20);
        wprowadz = new JButton("Wprowadz");
        zamknij = new JButton("Zamknij");
        setLayout(new FlowLayout());
        add(jL);
        add(tF);
        add(wprowadz);
        add(zamknij);

        wprowadz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String actual = tF.getText();
                boolean val = false;
                int numWpisany = 0;
                try {
                    numWpisany = Integer.parseInt(actual);
                    val = true;

                }catch (Exception ex){
                    JOptionPane.showMessageDialog(jL,"Nie poprawny input");
                }
                int random = (int) (Math.random()*200)-100;
                String s = Integer.toString(random);
                if(val){
                if(random<numWpisany){
                    list.add(s+" ");
//                    numWpisany = random;
                    JOptionPane.showMessageDialog(jL,"Liczba większa od wylosowanej");

                }
                else {
                    JOptionPane.showMessageDialog(jL,"Liczba mniejsza od wylosowanej");

                }
                }

                jL.setText(s);

//                String tekst = "";
//                for (String str:list
//                     ) {
//                    tekst += str;
//                }
//                tF.setText(tekst);

            }
        });
        zamknij.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setVisible(true);
    }
}
