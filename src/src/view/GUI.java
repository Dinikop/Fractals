package view;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {



    public GUI() {
        this.setSize(300, 300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);



        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new FlowLayout());
        JButton button1 = new JButton("Button1");
        JButton button2 = new JButton("Button2");
        buttonsPanel.add(button1);
        buttonsPanel.add(button2);

        DrawingPanel drawingPanel = new DrawingPanel();


        this.setLayout(new BorderLayout());
        this.add(BorderLayout.SOUTH, buttonsPanel);
        this.add(BorderLayout.NORTH, drawingPanel);
        this.pack();
    }
}
