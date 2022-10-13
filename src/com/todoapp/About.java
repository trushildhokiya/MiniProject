package com.todoapp;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.font.TextAttribute;

public class About extends JFrame {
    JFrame about_frame;
    JPanel about_panel;
    JPanel title_panel;
    String path="Images/person.png";
    ImageIcon persona = new ImageIcon(path);
    JLabel title_label;
    JLabel person_1_label;
    JLabel person_2_label;
    JLabel person_3_label;
    JLabel person_4_label;
    JButton arya_btn;
    JButton aniket_btn;
    JButton bhavsar_btn;
    JButton trushil_btn;
    JLabel placeholder;
    About()
    {
        this.setTitle("About Page"); //set title of about page
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //close frame when (x) button is clicket
        this.setSize(920,850); //set frame size
        this.setResizable(false); //set resizable to false
        this.setLayout(null);  //set Flow Layout

        about_panel = new JPanel();
        about_panel.setSize(920,850);
        about_panel.setBackground(new Color(255, 251, 207));
        about_panel.setLayout(null);

        title_panel = new JPanel();
        title_panel.setBounds(300,10,300,50);
        title_panel.setBackground(new Color(255,251,207));
        title_panel.setLayout(null);

        title_label=new JLabel("Digital Diary",SwingConstants.CENTER);
        title_label.setBounds(0,0,300,50);
        title_label.setFont(new Font("Arial",Font.BOLD,45));
        title_label.setForeground(Color.CYAN);

        placeholder = new JLabel("Developed by ~");
        placeholder.setFont(new Font("Arial",Font.ITALIC,22));
        placeholder.setBounds(380,40,200,100);
        placeholder.setSize(200,100);

        arya_btn = new JButton();
        arya_btn.setBorderPainted(false);
        arya_btn.setBorder(null);
        arya_btn.setBounds(100,100,150,150);
        arya_btn.setBackground(new Color(255,251,207));
        arya_btn.setIcon(persona);

        person_1_label = new JLabel("ARYA MADAN");
        person_1_label.setBounds(300,100,150,150);
        person_1_label.setSize(490,150);
        person_1_label.setFont(new Font("Arial",Font.BOLD,30));

        bhavsar_btn = new JButton();
        bhavsar_btn.setBorderPainted(false);
        bhavsar_btn.setBorder(null);
        bhavsar_btn.setBounds(100,250,150,150);
        bhavsar_btn.setBackground(new Color(255,251,207));
        bhavsar_btn.setIcon(persona);

        person_2_label = new JLabel("ADITYA BHAVSAR");
        person_2_label.setBounds(300,250,150,150);
        person_2_label.setSize(new Dimension(490,150));
        person_2_label.setFont(new Font("Arial",Font.BOLD,30));

        trushil_btn = new JButton();
        trushil_btn.setBorderPainted(false);
        trushil_btn.setBorder(null);
        trushil_btn.setBounds(100,400,150,150);
        trushil_btn.setBackground(new Color(255,251,207));
        trushil_btn.setIcon(persona);

        person_3_label = new JLabel("TRUSHIL DHOKIYA");
        person_3_label.setBounds(300,400,150,150);
        person_3_label.setSize(new Dimension(490,150));
        person_3_label.setFont(new Font("Arial",Font.BOLD,30));

        aniket_btn = new JButton();
        aniket_btn.setBorderPainted(false);
        aniket_btn.setBorder(null);
        aniket_btn.setBounds(100,550,150,150);
        aniket_btn.setBackground(new Color(255,251,207));
        aniket_btn.setIcon(persona);

        person_4_label = new JLabel("ANIKET KULKARNI");
        person_4_label.setBounds(300,550,150,150);
        person_4_label.setSize(new Dimension(490,150));
        person_4_label.setFont(new Font("Arial",Font.BOLD,30));

        about_panel.add(placeholder);

        about_panel.add(person_2_label);
        about_panel.add(person_1_label);
        about_panel.add(person_3_label);
        about_panel.add(person_4_label);

        about_panel.add(arya_btn);
        about_panel.add(bhavsar_btn);
        about_panel.add(trushil_btn);
        about_panel.add(aniket_btn);
        about_panel.add(title_panel);
        title_panel.add(title_label);

        this.add(about_panel); //add panel to frame
        this.setVisible(true); //set frame visibility to true
    }
}
