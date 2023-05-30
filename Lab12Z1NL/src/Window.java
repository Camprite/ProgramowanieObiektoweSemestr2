import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {

    private JTextField jTx1;
    private JTextField jTx2;
    private JTextField jTx3;
    private JTextField jTx4;
    private final JLabel jL1;
    private final JLabel jL2;
    private final JLabel jL3;
    private final JLabel jL4;
    private JButton Przelicz;
    private JButton Zamknij;
    private JButton Dodajdolisty;
    private JButton SumawUSD ;
    private List jLi;


    public Window(){
        jLi = new List();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLayout(new FlowLayout());

        add(jL1 = new JLabel("Kwota w PLN"));
        add(jTx1 = new JTextField("",10));
        add(jL2 = new JLabel("Kwota w USD"));
        add(jTx2 = new JTextField("",10));
        add(jL3 = new JLabel("Kwota w EURO"));
        add(jTx3 = new JTextField("",10));
        add(Przelicz = new JButton("Przelicz"));
        add(Zamknij = new JButton("Zamknij"));
        add(Dodajdolisty = new JButton("Dodaj do listy"));
        add(SumawUSD = new JButton("Suma w USD"));
        add(jL4 = new JLabel("Suma:"));
        add(jTx4 = new JTextField("",10));
        add(jLi);


        SumawUSD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp;
                Double wynik = 0.0;
                for (int i = 0; i < jLi.getItemCount(); i++) {
                    temp = jLi.getItem(i);
                    wynik += Double.parseDouble(temp);
                }
                jTx4.setText(Double.toString(Math.floor(wynik*100)/100));
            }
        });

        Dodajdolisty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLi.add(jTx2.getText());

            }
        });
    Przelicz.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Waluta  w = null;
            try {
                w = new Waluta(Integer.parseInt(jTx1.getText()));
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }

            String s1 =  Double.toString(Math.floor(w.przeliczNaUSD()*100)/100);
            String s2 = Double.toString(Math.floor(w.przeliczNaEURO()*100)/100);

//            String s3 = String.format("%.2f",s1);
//            String s4 = String.format("%.2f",s2);

            jTx2.setText(s1);
            jTx3.setText(s2);
        }
    });


        Zamknij.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }
}
