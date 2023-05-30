import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class Window extends JFrame implements MouseListener {
    private final JRadioButton lbKol1;
    private final JRadioButton lbKol2;
    private final JRadioButton lbKol3;
    private final JRadioButton rbLinia;
    private final JRadioButton rbProstokat;
    private final JRadioButton rbElipsa;
    private JPanel obszar ;
    private JTextField tfImie;
    private final JButton bCzysc;
    int x0;
    int y0;
    int x1;
    int y1;
    int wybor = 2;
    int kolor = 1;

    public Window() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLayout(new FlowLayout());
        obszar = new JPanel();
        obszar.setSize(400,400);

        add(lbKol1 = new JRadioButton("Czerwony"));
        add(lbKol2 = new JRadioButton("Niebieski"));
        add(lbKol3 = new JRadioButton("Czarny"));
        add(rbLinia = new JRadioButton("Linia"));
        add(rbProstokat = new JRadioButton("Prostokat"));
        add(rbElipsa = new JRadioButton("Elipsa"));
        add(obszar);

        add(bCzysc = new JButton("Czysc"));
        addMouseListener(this);
bCzysc.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
});
        setVisible(true);
    }



    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        x0 = e.getX();
        y0 = e.getY();
        System.out.println("x"+ x0);
        System.out.println("y"+ y0);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();

        if(rbLinia.isSelected()){wybor = 1; };
        if(rbProstokat.isSelected()){wybor = 2; };
        if(rbElipsa.isSelected()){wybor = 3; };

        if(lbKol1.isSelected()){wybor = 1; };
        if(lbKol2.isSelected()){wybor = 2; };
        if(lbKol3.isSelected()){wybor = 3; };

    if(wybor == 2){prostokat(getGraphics());}
    if(wybor == 3){elipsa(getGraphics());}
    if(wybor == 1){linia(getGraphics());}


    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


    public void elipsa(Graphics g){
        System.out.println("elipsa");

        g.drawOval(x0,y0,x1-x0,y1-y0);
    }
    public void prostokat(Graphics g){
        System.out.println("prostokat");

        g.drawRect(x0,y0,x1-x0,y1-y0);
    }
    public void linia(Graphics g){
        System.out.println("linia");

        g.drawLine(x0,y0,x1,y1);
    }


}
