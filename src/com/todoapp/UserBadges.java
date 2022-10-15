package com.todoapp;

import javax.swing.*;
import java.awt.*;

public class UserBadges extends JFrame {
    JFrame badgesframe ;

    JPanel badges_panel ;
    static JLabel novice_badge_label;
    static JLabel amateur_badge_label;
    static JLabel master_badge_Label;
    static JLabel victory_badge_label ;

    ImageIcon novice_badge = new ImageIcon("Images/novice_badge.png");
    ImageIcon amateur_badge = new ImageIcon("Images/amateur_badge.png");
    ImageIcon master_badge = new ImageIcon("Images/masterbadge.png");
    ImageIcon victory_badge= new ImageIcon("Images/victoryBadge.png");
    UserBadges()
    {

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(800,800);
        this.setTitle("Your Badges");
        this.setLayout(null);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(250, 242, 222));

        badges_panel= new JPanel();
        badges_panel.setLayout(null);
        badges_panel.setBounds(0,0,800,200);
        badges_panel.setBackground(new Color(250, 242, 222));

        novice_badge_label = new JLabel();
        novice_badge_label.setBounds(50,50,130,120);
        novice_badge_label.setIcon(novice_badge);
        novice_badge_label.setVisible(false);


        amateur_badge_label=new JLabel();
        amateur_badge_label.setBounds(190,50,130,120);
        amateur_badge_label.setIcon(amateur_badge);
        amateur_badge_label.setVisible(false);

        master_badge_Label=new JLabel();
        master_badge_Label.setBounds(320,50,130,120);
        master_badge_Label.setIcon(master_badge);
        master_badge_Label.setVisible(false);

        victory_badge_label= new JLabel();
        victory_badge_label.setBounds(450,50,130,120);
        victory_badge_label.setIcon(victory_badge);
        victory_badge_label.setVisible(false);

        badges_panel.add(victory_badge_label);
        badges_panel.add(master_badge_Label);
        badges_panel.add(amateur_badge_label);
        badges_panel.add(novice_badge_label);
        this.add(badges_panel);

        this.setVisible(true);
        displaybadge_10();
    }

     static public void displaybadge_10()
    {

        if(JavaFrame.tasks_done >= 10)
        {
            novice_badge_label.setVisible(true);
        }
        if(JavaFrame.tasks_done>=25)
        {
            amateur_badge_label.setVisible(true);
        }
        if(JavaFrame.tasks_done>=50)
        {
            master_badge_Label.setVisible(true);
        }
        if(JavaFrame.tasks_done>=75)
        {
            victory_badge_label.setVisible(true);
        }
    }
}
