import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    private final JLabel lbImie;
    private final JLabel lbNazwisko;
    private final JLabel lbWzrost;
    private final JLabel lbWaga;
    private JTextField tfImie;
    private JTextField tfNazwisko;
    private JTextField tfWzrost;
    private JTextField tfWaga;
//    private final JButton bWaga;
//    private final JButton bWzrost;
    private final JButton bClose;
    private JMenuBar menu;
    private JMenuItem  mitem;
    private JMenu  m;
    private Osoba os;

    public Window(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,200);
        setLayout(new FlowLayout());
        add(lbImie = new JLabel("Imie"));
        add(tfImie = new JTextField("",10));
        add(lbNazwisko = new JLabel("Nazwisko"));
        add(tfNazwisko = new JTextField("",10));
        add(lbWzrost = new JLabel("Wzrost"));
        add(tfWzrost = new JTextField("",10));
        add(lbWaga = new JLabel("Waga"));
        add(tfWaga = new JTextField("",10));
//        add(bWaga = new JButton("Przelicz Wage"));
//        add(bWzrost = new JButton("Przelicz Wzrost"));
        add(bClose = new JButton("Zamknij"));

        JMenuBar mb = new JMenuBar();

        JMenu menu = new JMenu("Przeliczanie");
        JMenuItem mi1 = new JMenuItem("Przelicz Wage");
        JMenuItem mi2 = new JMenuItem("Przelicz Wzrost");
        menu.add(mi1);
        menu.add(mi2);
        mb.add(menu);



        mi1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                os = new Osoba(tfImie.getText(),tfNazwisko.getText(),Double.parseDouble(tfWzrost.getText()), Double.parseDouble(tfWaga.getText()));
                JOptionPane.showMessageDialog(null,"Waga w funtach wynosi: "+String.format("%.2f",os.wagaNaFunty()));
            }
        });
        mi2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                os = new Osoba(tfImie.getText(),tfNazwisko.getText(),Double.parseDouble(tfWzrost.getText()), Double.parseDouble(tfWaga.getText()));
                JOptionPane.showMessageDialog(null,"Wzrost w calach wynosi: "+String.format("%.2f",os.wzrostNaCale()));
            }
        });
        bClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        this.setJMenuBar(mb);
        this.setVisible(true);
    }

}
