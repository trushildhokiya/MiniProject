package com.todoapp;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class About extends JFrame {
    JFrame about_frame;
    JPanel about_panel;
    JLabel about_label;
    About()
    {
        this.setTitle("About Page"); //set title of about page
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close frame when (x) button is clicket
        this.setSize(920,850); //set frame size
        this.setResizable(false); //set resizable to false
        this.setLayout(new FlowLayout());  //set Flow Layout

        about_panel = new JPanel(); //new JPanel
        about_panel.setPreferredSize(new Dimension(920,850)); //set Panel size

        about_label = new JLabel();
        about_label.setPreferredSize(new Dimension(920,850));
        about_label.setBackground(new Color(255, 247, 233));
        about_label.setFont(new Font("Arial",Font.BOLD,25));
        about_label.setBorder(new EmptyBorder(0,10,0,0)); // set border to aboutlabel


        //add text to label (about info)
        about_label.setText("<html> <p>Welcome to Digital Diary</p> </html>");

        this.add(about_label);
        this.add(about_panel); //add panel to frame
        this.setVisible(true); //set frame visibility to true
    }
}
