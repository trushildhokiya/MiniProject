package com.todoapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaFrame extends JFrame implements ActionListener {
    static int y_coordinate=0;
    String task;
    public static int tasks_done =0;

    JFrame frame; //variable declaration
    String path = "Images/icon.png";
    String add_path = "Images/add.png";
    String delete_path = "Images/delete.jpg";
    String badges_path = "Images/badges.jpg";
    String about_path = "Images/about.png";
    ImageIcon logo = new ImageIcon(path);
    ImageIcon add_logo = new ImageIcon(add_path);
    ImageIcon delete_logo = new ImageIcon(delete_path);
    ImageIcon badges_logo = new ImageIcon(badges_path);
    ImageIcon about_logo = new ImageIcon(about_path);
    JPanel title_panel;
    JPanel option_panel;
    JLabel title_label;

    JButton add_button;
    JButton delete_button;
    JButton badges_button;
    JButton newbutton;
    JButton about_page;
    JPanel add_panel;
    JLabel add_label;
    JLabel delete_label;
    JLabel badges_label;
    JLabel about_label;
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
        add_button.setBackground(Color.white);
        add_button.setOpaque(true);

        add_label= new JLabel("Add task",SwingConstants.CENTER);
        add_label.setBounds(20,93,70,20);
        add_label.setFont(new Font("Arial",Font.BOLD,15));

        delete_button = new JButton(delete_logo); //creating new JButton
        delete_button.setBounds(20,130,70,70); //placing button on option panel
        delete_button.addActionListener(this); //adding action listener to button

        delete_label= new JLabel("Delete task",SwingConstants.CENTER);
        delete_label.setBounds(13,207,83,15);
        delete_label.setFont(new Font("Arial",Font.BOLD,15));

        badges_button= new JButton(badges_logo); //creating new JButton
        badges_button.setBounds(20,250,70,70); // placing button on option panel
        badges_button.addActionListener(this); // adding action listener to button

        badges_label= new JLabel("Badges",SwingConstants.CENTER);
        badges_label.setBounds(20,330,80,15);
        badges_label.setFont(new Font("Arial",Font.BOLD,15));

        about_page = new JButton("About Page");
        about_page.setIcon(about_logo);
        about_page.setBounds(20,360,70,70);
        about_page.setBackground(Color.white);
        about_page.addActionListener(this);

        title_label = new JLabel(); //create instance of JLabel
        title_label.setText("Get More Done with Digital Intelligence!"); //set text to JLabel
        title_label.setFont(new Font("Sans serif", Font.BOLD, 25)); // set font of JLabel

        title_panel.add(title_label); //add title_label to title_panel

        option_panel.add(add_label); //adding add_label to option_panel
        option_panel.add(delete_label); //adding delete label to option panel
        option_panel.add(badges_label);
        option_panel.add(add_button); //adding add button to option panel
        option_panel.add(delete_button); //adding delete button to option panel
        option_panel.add(badges_button); //adding badges button to option panel
        option_panel.add(about_page); //adding about page to option panel

        add_panel = new JPanel();
        add_panel.setBounds(0,100,770,750);
        add_panel.setBackground(new Color(100,110,220));
        add_panel.setLayout(null);

        this.add(add_panel);
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
            task=JOptionPane.showInputDialog("Enter task to enter: ");
            add_task();
            JavaFrame.tasks_done= JavaFrame.tasks_done +1;
            if(JavaFrame.tasks_done>=10)
            {
                UserBadges.displaybadge_10();
            }
        }
        else if (e.getSource()==delete_button)  //if delete button is selected
        {
            newbutton.setVisible(false);
        }
        else if(e.getSource()==badges_button) //if badges button is selected
        {
            new UserBadges();
        }
        else if(e.getSource()==about_page)
        {
            About about = new About();
        }
    }

    public void add_task()
    {
        newbutton = new JButton(task);
        newbutton.setBounds(0,JavaFrame.y_coordinate,770,100);
        newbutton.setFont(new Font("Arial",Font.PLAIN,25));
        JavaFrame.y_coordinate=JavaFrame.y_coordinate+100;
        add_panel.add(newbutton);
        add_panel.revalidate();
        add_panel.repaint();
    }
}
