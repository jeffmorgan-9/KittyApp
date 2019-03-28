import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class KittyApplet extends java.applet.Applet{

public void init() {}


    public static String fileName;

    public static int Rand() {
        Random rndm = new Random();
        int rndmnum = rndm.nextInt(5);
        return rndmnum;

    }

    public static String Selectkitty(){


        String[] kitties = new String[5];

        kitties[0] = ("C:\\Users\\Jeff\\IdeaProjects\\Lol Kitty2\\src\\Files.jfif");
        kitties[1] = ("C:\\Users\\Jeff\\IdeaProjects\\Lol Kitty2\\src\\Airplane.jfif");
        kitties[2] = ("C:\\Users\\Jeff\\IdeaProjects\\Lol Kitty2\\src\\Cloud.jfif");
        kitties[3] = ("C:\\Users\\Jeff\\IdeaProjects\\Lol Kitty2\\src\\Jaba.jfif");
        kitties[4] = ("C:\\Users\\Jeff\\IdeaProjects\\Lol Kitty2\\src\\Winks.jfif");

        String kitty = new String();
        kitty = kitties[Rand()];

        while(kitty.equals (fileName)) {
            kitty = kitties[Rand()];
        }


        fileName = kitty;


        return kitty;
    }

    public void paint() {
        JFrame frame = new JFrame();
        frame.setTitle("Lol Cats");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel north = new JPanel(new BorderLayout());
        JPanel south = new JPanel(new FlowLayout());

        frame.add(north, BorderLayout.NORTH);
        frame.add(south, BorderLayout.SOUTH);

        ImageIcon imageIcon = new ImageIcon(Selectkitty());
        JLabel label = new JLabel(imageIcon);
        label.setSize(300,300);
        north.add(label);

        frame.setSize(300, 300);
        frame.setVisible(true);

        JButton b1 = new JButton();
        south.add(b1);
        b1.setSize(300, 75);
        b1.setVisible(true);
        b1.setText("Change Kitty");



        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                label.setIcon(new ImageIcon(Selectkitty()));
            }

        });


    }}


