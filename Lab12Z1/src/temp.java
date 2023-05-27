//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//public class Okienko extends Frame {
//    private final JLabel lbImie;
//    private JTextField tfImie;
//    private final JButton bOK;
//    private final JButton bClose;
//
//    Okienko() {
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(400, 100);
//        setLayout(new FlowLayout());
//        add(lbImie = new JLabel("Imie"));
//        add(tfImie = new JTextField(10));
//        add(bOK = new JButton("OK"));
//        add(bClose = new JButton("Zamknij"));
//        bOK.addActionListener(new ActionListener() {
//              public void actionPerformed(ActionEvent e) {
//                  JOptionPane.showMessageDialog(null, "Podane imie to: \t" + t fImie.getText());
//              }
//          }
//        );
//        bClose.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                System.exit(0);
//            }
//        });
//        setVisible(true);
//    }
//
//    public static void main(String args[]) {
//        JFrame f;
//        f = new Okienko();
//    }
//}