package com.todoapp;

import javax.swing.*;
import java.awt.*;

public class JavaFrame extends JFrame {
    JFrame frame; //variable declaration
    String path = "Images/icon.png";
    String add_path = "Images/plus.png";
    String delete_path = "Images/delete.jpg";
    String badges_path = "Images/badges.jpg";
    ImageIcon logo = new ImageIcon(path);
    ImageIcon add_logo = new ImageIcon(add_path);
    ImageIcon delete_logo = new ImageIcon(delete_path);
    ImageIcon badges_logo = new ImageIcon(badges_path);
    JPanel title_panel;
    JPanel option_panel;
    JLabel title_label;

    JButton add_button;
    JButton delete_button;
    JButton badges_button;

    JavaFrame() //constructor of class Java Frame
    {
        this.setSize(920, 850);  //set size of Java Frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Default close Operation (x) button
        this.setTitle("Diary Intelligence"); //set title to JFrame
        this.getContentPane().setBackground(new Color(210, 218, 255)); //set background color
        this.setIconImage(logo.getImage()); // set icon as Image in Images (.getImage() to load image)
        this.setLayout(null); // set Layout Manager to null(to set bounds)

        title_panel = new JPanel(); // create instance of JPanel
        title_panel.setBounds(0, 0, 920, 100); //set Panel on JFrame
        title_panel.setBackground(new Color(177, 178, 255)); //set background color of title_panel

        option_panel = new JPanel();
        option_panel.setLayout(null);
        option_panel.setBounds(770, 100, 150, 750);
        option_panel.setBackground(new Color(237, 240, 255));

        add_button = new JButton(add_logo);
        add_button.setBounds(20,20,70,70);

        delete_button = new JButton(delete_logo);
        delete_button.setBounds(20,110,70,70);

        badges_button= new JButton(badges_logo);
        badges_button.setBounds(20,200,70,70);

        title_label = new JLabel(); //create instance of JLabel
        title_label.setText("Get More Done with Digital Intelligence!"); //set text to JLabel
        title_label.setFont(new Font("Sans serif", Font.BOLD, 25)); // set font of Jlabel

        title_panel.add(title_label); //add title_label to title_panel

        option_panel.add(add_button);
        option_panel.add(delete_button);
        option_panel.add(badges_button);
        this.add(option_panel);
        this.add(title_panel); //adding title_panel to JFrame

        this.setResizable(false); //don't allow to expand screen
        this.setVisible(true); //actually display JFrame on device
    }
}
