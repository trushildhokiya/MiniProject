package com.todoapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPage extends JFrame implements ActionListener {
    JFrame firstPage;
    JPanel panel_1;
    JLabel label_1;
    JButton goToMain;
    FirstPage()
    {
        this.setTitle("Welcome to Digital Diary");
        this.setSize(920,850);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        goToMain = new JButton("Enter Digital Diary");
        goToMain.addActionListener(this);

        this.add(goToMain);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FirstPage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==goToMain)
        {
            new JavaFrame();
        }
    }
}
