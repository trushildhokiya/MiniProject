package com.todoapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaFrame extends JFrame implements ActionListener {

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

        option_panel = new JPanel(); //creating new JPanel
        option_panel.setLayout(null); //set layout to null to place manually
        option_panel.setBounds(770, 100, 150, 750); //placing panel on frame
        option_panel.setBackground(new Color(237, 240, 255)); //changing background color

        add_button = new JButton(add_logo); //creating new JButton
        add_button.setBounds(20,20,70,70); //placing button on option panel
        add_button.addActionListener(this); //adding action listener to button

        delete_button = new JButton(delete_logo); //creating new JButton
        delete_button.setBounds(20,110,70,70); //placing button on option panel
        delete_button.addActionListener(this); //adding action listener to button

        badges_button= new JButton(badges_logo); //creating new JButton
        badges_button.setBounds(20,200,70,70); // placing button on option panel
        badges_button.addActionListener(this); // adding action listener to button

        title_label = new JLabel(); //create instance of JLabel
        title_label.setText("Get More Done with Digital Intelligence!"); //set text to JLabel
        title_label.setFont(new Font("Sans serif", Font.BOLD, 25)); // set font of Jlabel

        title_panel.add(title_label); //add title_label to title_panel

        option_panel.add(add_button); //adding add button to option panel
        option_panel.add(delete_button); //adding delete button to option panel
        option_panel.add(badges_button); //adding badges button to option panel

        this.add(option_panel); //adding option panel to frame
        this.add(title_panel); //adding title_panel to JFrame

        this.setResizable(false); //don't allow to expand screen
        this.setVisible(true); //actually display JFrame on device
    }

    //Action listener unimplemented methods
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add_button) //if add button is selected
        {
            System.out.println("Button is activated");
        }
        else if (e.getSource()==delete_button)  //if delete button is selected
        {
            System.out.println("Delete Button Activated.");
        }
        else if(e.getSource()==badges_button) //if badges button is selected
        {
            new UserBadges();
        }
    }
}
