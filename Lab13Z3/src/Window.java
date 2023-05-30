import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Window extends JFrame{
    private final JLabel lbImie;
    private final JLabel lbNazwisko;
    private JTextField tfImie;
    private JTextField tfNazwisko;
    private JTextField tfOcena;
    private JTextField tfOcena1;
    private JTextField tfOcena2;
    private JTextField tfOcena3;
    private JTextField tfOcena4;
    private final JRadioButton bEgzamin1;
    private final JRadioButton bEgzamin2;
    private final JRadioButton bEgzamin3;
    private final JRadioButton bEgzamin4;
    private final JButton bRysuj;
    private final JButton bCzysc;
//    private final JButton bDodajOcene;
    private final JButton bDodajStudenta;
    private JMenuBar menu;
    private JMenuItem  mitem;
    private JMenu  m;
    private Student stud;
    private ArrayList<Student> studenci = new ArrayList<>();

    public Window(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(800,800);
    setLayout(new FlowLayout());
    add(lbImie = new JLabel("Imie"));
    add(tfImie = new JTextField("",10));
    add(lbNazwisko = new JLabel("Nazwisko"));
    add(tfNazwisko = new JTextField("",10));
    add(bEgzamin1 = new JRadioButton("Matematyka"));
    add(tfOcena1 = new JTextField("",10));
    add(bEgzamin2 = new JRadioButton("Polski"));
    add(tfOcena2 = new JTextField("",10));
    add(bEgzamin3 = new JRadioButton("Angielski"));
    add(tfOcena3 = new JTextField("",10));
    add(bEgzamin4 = new JRadioButton("Historia"));
    add(tfOcena4 = new JTextField("",10));
    add(bRysuj = new JButton("Rysuj"));
//    add(bDodajOcene = new JButton("Dodaj ocene"));
    add(bDodajStudenta = new JButton("Dodaj studenta"));
    add(bCzysc = new JButton("Czysc"));
//    add(lbWaga = new JLabel("Waga"));
//    add(tfWaga = new JTextField("",10));
//    add(bClose = new JButton("Zamknij"));

    JMenuBar mb = new JMenuBar();

    JMenu menu = new JMenu("Przeliczanie");
    JMenuItem mi1 = new JMenuItem("Przelicz Wage");
    JMenuItem mi2 = new JMenuItem("Przelicz Wzrost");
        menu.add(mi1);
        menu.add(mi2);
        mb.add(menu);
        setVisible(true);

        bDodajStudenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Student s = new Student(tfImie.getText(),tfNazwisko.getText());
                int ocena = 0;
                if(bEgzamin1.isSelected()){

                     ocena = Integer.parseInt(tfOcena1.getText());
                    try {
                        s.addOcena(new Egzamin(ocena,"Matematyka"));
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
                if(bEgzamin2.isSelected()){

                     ocena = Integer.parseInt(tfOcena2.getText());
                    try {
                        s.addOcena(new Egzamin(ocena,"Polski"));
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
                if(bEgzamin3.isSelected()){

                     ocena = Integer.parseInt(tfOcena3.getText());
                    try {
                        s.addOcena(new Egzamin(ocena,"Angielski"));
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
                if(bEgzamin4.isSelected()){

                     ocena = Integer.parseInt(tfOcena4.getText());
                    try {
                        s.addOcena(new Egzamin(ocena,"Historia"));
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
                JOptionPane.showMessageDialog(null,"Pomyslnie dodano studenta");
                studenci.add(s);
            }
        });

    }

}
