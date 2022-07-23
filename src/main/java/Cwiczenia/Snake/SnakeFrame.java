package Cwiczenia.Snake;

import javax.swing.*;

public class SnakeFrame extends JFrame {

    SnakeFrame() {

        add(new SnakePanel());
        setTitle("Snake");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);

    }
}
