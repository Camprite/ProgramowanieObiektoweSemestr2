import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    private final JRadioButton jrb1;
    private final JRadioButton jrb2;
    private final JRadioButton jrb3;
    private JSlider jSl;
    private final JButton jbt1;
    private final JButton jbt2;


    public Window(){
        setLayout(new FlowLayout());
        setSize(300,600);
        jrb1 = new JRadioButton("Czerwony");
        jrb2 = new JRadioButton("Niebieski");
        jrb3 = new JRadioButton("Zielony");
        jSl = new JSlider(JSlider.HORIZONTAL,0,100,50);
        jbt1 = new JButton("Czysc");
        jbt2 = new JButton("Rysuj");

        add(jrb1);
        add(jrb2);
        add(jrb3);
        add(jSl);
        add(jbt1);
        add(jbt2);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jbt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });

        jbt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedCounter=0;
                if(jrb1.isSelected()){selectedCounter++;}
                if(jrb2.isSelected()){selectedCounter++;}
                if(jrb3.isSelected()){selectedCounter++;}
                try { if(selectedCounter!=1) {
                    throw new Exception("Too many/less Radio Buttons selected");
                }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex);
                }

//Czerwony
                if(jrb1.isSelected()){
                    trojkat(getGraphics());
                }
//Niebieski
                if(jrb2.isSelected()){
                    okrag(getGraphics());
                }
//Zielony
                if(jrb3.isSelected()){
                    kwadrat(getGraphics());
                }




            }
        });


    }

    public void kwadrat(Graphics g) {
        Kwadrat kw = new Kwadrat();
        kw.setDlugosc(jSl.getValue());
        g.setColor(new Color(0,255,0));
        g.drawRect(50,150,kw.getDlugosc(),kw.getDlugosc());

        };
    public void okrag(Graphics g) {
        Kolo kw = new Kolo();
        kw.setDlugosc(jSl.getValue());
        g.setColor(new Color(0,0,255));
        g.drawOval(50,150,kw.getDlugosc(),kw.getDlugosc());

        };
    public void trojkat(Graphics g) {
        Trojkat kw = new Trojkat();
        kw.setDlugosc(jSl.getValue());
        g.setColor(new Color(255,0,0));

        int tabX [ ] = { 50, 50, 100+kw.getDlugosc() }; int tabY [ ] = { 150, 150+kw.getDlugosc(), 150 }; int n = tabX.length;
        g.drawPolygon(tabX,tabY,n);
    };
}
