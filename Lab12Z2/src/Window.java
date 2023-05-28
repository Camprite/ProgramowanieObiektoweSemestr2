import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class Window extends JFrame {
    private final JLabel lbImie;
    private JTextField tfImie;
    private JTextField tfNazwisko;
    private JTextField tfWzrost;
    private JTextField tfWaga;
    private final JButton bWaga;
    private final JButton bWzrost;
    private final JButton bClose;

    public Window(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLayout(new FlowLayout());

        add(lbImie = new JLabel("Imie"));
        add(tfImie = new JTextField("Imie"));
        add(tfNazwisko = new JTextField("Nazwisko"));
        add(tfWzrost = new JTextField("Wzrost"));
        add(tfWaga = new JTextField("Waga"));
        add(bWaga = new JButton("Przelicz Wage"));
        add(bWzrost = new JButton("Przelicz Wzrost"));
        add(bClose = new JButton("Zamknij"));

        bWaga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Osoba o = new Osoba(tfImie.getText(),tfNazwisko.getText(),Double.parseDouble(tfWzrost.getText()), Double.parseDouble(tfWaga.getText()));
                JOptionPane.showMessageDialog(null,"Waga w funtach wynosi: "+String.format("%.2f",o.wagaNaFunty()));
            }
        });
        bWzrost.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Osoba o = new Osoba(tfImie.getText(),tfNazwisko.getText(),Double.parseDouble(tfWzrost.getText()), Double.parseDouble(tfWaga.getText()));
                JOptionPane.showMessageDialog(null,"Wzrost w calach wynosi: "+String.format("%.2f",o.wzrostNaCale()));
            }
        });
        bClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

}
