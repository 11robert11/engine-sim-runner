package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

    public static void main(String[] args) {
        JPanel contentPane = new JPanel(new BorderLayout());
        JFrame jFrame = new JFrame();
        jFrame.add(contentPane);
        jFrame.setSize(400, 400);
        Button button = new Button();
        button.addActionListener(new Main());
        jFrame.add(button);
        button.setVisible(true);
        jFrame.setVisible(true);

        //contentPane.add(someComponent, BorderLayout.CENTER);
        //contentPane.add(anotherComponent, BorderLayout.PAGE_END);

    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("!!!");
    }
}
