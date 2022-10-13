package com.todoapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPage extends JFrame implements ActionListener {
    public JFrame firstPage;
    JPanel panel_1;
    JLabel label_1;
    JButton goToMain;
    JPanel proceed_panel;
    String text="Weclome" + "<br>" + "<br>" + "<br>" +
            "To use our Software please click on below Button" + "<br>" + "<br>" + "<br>" +"<br>" +
            "Developer's: BESTOF4";
    FirstPage()
    {
        this.setTitle("Welcome to Digital Diary");
        this.setSize(920,850);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        panel_1 = new JPanel();
        panel_1.setPreferredSize(new Dimension(920,850));
        panel_1.setBackground(new Color(255, 247, 233));
        panel_1.setLayout(new FlowLayout());

        label_1= new JLabel();
        label_1.setSize(500,500);
        label_1.setFont(new Font("Arial",Font.BOLD,25));
        label_1.setBackground(new Color(255, 247, 233));
        label_1.setForeground(Color.BLACK);
        label_1.setText("<html><div style='text-align: center;'>" + text + "</div></html>");
        label_1.setOpaque(true); //display background color of JLabel

        goToMain = new JButton();
        goToMain.setText("Click to Proceed");
        goToMain.addActionListener(this);
        goToMain.setFont(new Font("Arial",Font.BOLD,25));

        proceed_panel = new JPanel();
        proceed_panel.setSize(100,100);
        proceed_panel.setBackground(Color.GREEN);

        panel_1.add(proceed_panel);
        panel_1.add(label_1);
        panel_1.add(goToMain);
        this.add(panel_1);
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
            dispose();
        }
    }
}
