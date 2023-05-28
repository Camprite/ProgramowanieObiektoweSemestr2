import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {

    private final JLabel input;
    private JTextField text;
    private final JButton bOK;
    private final JButton bClose;

    public Window() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new FlowLayout());
        add(input = new JLabel("Imie"));
        add(text = new JTextField(10));
        add(bOK = new JButton("Ok"));
        add(bClose = new JButton("Zamknij"));

        getContentPane().setBackground(new Color(0, 0, 0));

        bOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tekst = text.getText();
                for (char c : tekst.toCharArray()) {

                }
                JOptionPane.showMessageDialog(null, "Podane imie to \t " + text.getText());
            }
        });
        bClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }
}
