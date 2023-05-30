import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//Grupa radio buttonów;
//
public class Window extends JFrame {
    private final JLabel jL1;
    private JTextField jTx1;
    private  JButton Rysuj;
    private  JButton Dodaj;
    private  JButton Czysc;
    private  ArrayList<Integer> lista = new ArrayList<>();

    public Window(){
            setLayout(new FlowLayout());
            setSize(600,600);
            add(jL1 = new JLabel("Podaj kurs waluty"));
            add(jTx1 = new JTextField("",10));
            add(Dodaj = new JButton("Dodaj"));
            add(Czysc = new JButton("Czyść"));
            add(Rysuj = new JButton("Rysuj"));


            Dodaj.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    lista.add(Integer.parseInt(jTx1.getText()));
//                    JOptionPane.showMessageDialog(null,jTx1.getText());
                }
            });

            Rysuj.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    rysuj(getGraphics());






                }
            });

            Czysc.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    repaint();
                }
            });


            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
    }
    public void rysuj(Graphics g) {

        int dol = 550;
        int gora = 100;
        int lewo = 50;
        int prawo = 550;

        int pktx = 50; //lewo
        int pkty = 550; //dol max


        int n = lista.size();

        int skok = (prawo - lewo) / n;
        int valX = 50;
        int valX1 = 0;
        int valY = 550;
        int valY1 = 0;
        for (int i : lista
        ) {
            System.out.println(i);
            valX1 = valX + skok;
            valY1 = valY - i;
            g.drawLine(valX, valY, valX1, valY1);
            valX = valX1;
            valY = valY1;

        }
        ;
    };

}
