package com.todoapp;

import javax.swing.*;
import java.awt.*;

public class UserBadges extends JFrame {
    JFrame badgesframe ;

    ImageIcon novice_badge = new ImageIcon("Images/novice_badge.png");
    ImageIcon amateur_badge = new ImageIcon("Images/amateur_badge.png");
    UserBadges()
    {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,800);
        this.setVisible(true);
    }
}
