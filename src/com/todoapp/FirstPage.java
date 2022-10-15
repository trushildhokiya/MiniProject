package com.todoapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPage extends JFrame implements ActionListener {
    public JFrame firstPage;
    String path="Images/somaiya-logo.png";
    ImageIcon slogo=new ImageIcon(path);
    JPanel First_page_panel;
    JLabel title_label;
    JLabel guided;
    JButton logo_btn ;
    JButton goToMain;
    FirstPage()
    {
        this.setTitle("Welcome Page");
        this.setSize(920,850);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        First_page_panel = new JPanel();
        First_page_panel.setSize(920,850);
        First_page_panel.setBackground(new Color(252, 247, 232));
        First_page_panel.setLayout(null);

        logo_btn=new JButton(slogo);
        logo_btn.setBounds(0,0,300,86);
        logo_btn.setBackground(new Color(252,247,232));
        logo_btn.setBorder(null);
        logo_btn.setBorderPainted(false);

        title_label= new JLabel("DIGITAL DIARY");
        title_label.setFont(new Font("Verdana",Font.BOLD,40));
        title_label.setBounds(350,0,300,100);
        title_label.setSize(600,100);

        guided = new JLabel("<html><center>Guided by<br>Prof. Shubdha Labde</center></html>");
        guided.setBounds(400,600,150,150);
        guided.setFont(new Font("Sans Serif",Font.PLAIN,15));

        goToMain = new JButton("Start using Software");
        goToMain.setBounds(345,500,250,100);
        goToMain.setBackground(new Color(235, 198, 178));
        goToMain.setBorder(null);
        goToMain.addActionListener(this);
        goToMain.setFont(new Font("Arial",Font.PLAIN,20));

        First_page_panel.add(goToMain);
        First_page_panel.add(guided);
        First_page_panel.add(logo_btn);
        First_page_panel.add(title_label);

        this.add(First_page_panel);
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
