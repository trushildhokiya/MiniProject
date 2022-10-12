package com.todoapp;

import javax.swing.*;
import java.awt.*;

public class UserBadges extends JFrame {
    JFrame badgesframe ;

    JPanel badges_panel ;
    static JLabel novice_badge_label;
    static JLabel amateur_badge_label;
    static JLabel master_badge_Label;

    ImageIcon novice_badge = new ImageIcon("Images/novice_badge.png");
    ImageIcon amateur_badge = new ImageIcon("Images/amateur_badge.png");
    ImageIcon master_badge = new ImageIcon("Images/masterbadge.png");
    UserBadges()
    {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,800);
        this.setLayout(null);

        badges_panel= new JPanel();
        badges_panel.setLayout(null);
        badges_panel.setBounds(0,0,800,200);

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

        badges_panel.add(master_badge_Label);
        badges_panel.add(amateur_badge_label);
        badges_panel.add(novice_badge_label);
        this.add(badges_panel);

        this.setVisible(true);
        displaybadge_10();
    }

     static public void displaybadge_10()
    {
        if(JavaFrame.tasks_done == 10)
        {
            novice_badge_label.setVisible(true);
        }
        if(JavaFrame.tasks_done==25)
        {
            amateur_badge_label.setVisible(true);
        }
        if(JavaFrame.tasks_done==50)
        {
            master_badge_Label.setVisible(true);
        }
    }
}
