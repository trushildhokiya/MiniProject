package com.todoapp;

import javax.swing.*;
import java.awt.*;

public class UserBadges extends JFrame {
    JFrame badgesframe ;

    JPanel badges_panel ;
    JLabel novice_badge_label;
    JLabel amateur_badge_label;

    ImageIcon novice_badge = new ImageIcon("Images/novice_badge.png");
    ImageIcon amateur_badge = new ImageIcon("Images/amateur_badge.png");
    UserBadges()
    {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,800);
        this.setLayout(null);

        badges_panel= new JPanel();
        badges_panel.setLayout(null);
        badges_panel.setBackground(new Color(100,120,144));
        badges_panel.setBounds(0,0,800,200);

        novice_badge_label = new JLabel();
        novice_badge_label.setBounds(50,50,130,120);
        novice_badge_label.setIcon(novice_badge);

        badges_panel.add(novice_badge_label);
        this.add(badges_panel);

        this.setVisible(true);
        displaybadge_10();
    }

    static public void displaybadge_10()
    {
        if(JavaFrame.tasks_done == 10)
        {
            System.out.println("done");
        }
    }

}
