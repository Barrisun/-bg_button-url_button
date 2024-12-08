package org.example;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("234");
        frame.setSize(new Dimension(400,400));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton button = new JButton("Переход на наш веб сайт");
        button.setBounds(40,200,300,20);
        frame.getContentPane().add(button);

        JButton bg_button = new JButton("Поменять цвет на черный");
        frame.getContentPane().add(bg_button);
        bg_button.setBounds(50,150,200,20);
        bg_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.BLACK);
            }
        });
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    Desktop.getDesktop().browse(new URI("https://github.com/Barrisun/CX47RUS/tree/main"));
                } catch (URISyntaxException ex) {
                    throw new RuntimeException(ex);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
}
