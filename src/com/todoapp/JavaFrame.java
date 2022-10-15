package com.todoapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class JavaFrame extends JFrame implements ActionListener, ItemListener {
    static int checkbox_counter_add=0;
    static int getCheckbox_counter_delete=0;
    String task;
    public static String[] task_end_time= new String[100];
    static int timer_count=0;
    public static int tasks_done =0;

    JFrame frame; //variable declaration
    String path = "Images/icon.png";
    String add_path = "Images/add.png";
    String delete_path = "Images/delete.png";
    String badges_path = "Images/badges.png";
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
//    JButton newbutton;

    static JCheckBox[] checkbox=new JCheckBox[100];
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
        title_panel.setBackground(new Color(237, 226, 211)); //set background color of title_panel

        option_panel = new JPanel(); //creating new JPanel
        option_panel.setLayout(null); //set layout to null to place manually
        option_panel.setBounds(770, 100, 150, 750); //placing panel on frame
        option_panel.setBackground(new Color(237, 226, 211)); //changing background color

        add_button = new JButton(add_logo); //creating new JButton
        add_button.setBounds(20,20,70,70); //placing button on option panel
        add_button.addActionListener(this); //adding action listener to button
        add_button.setBackground(new Color(237, 226, 211));
        add_button.setBorderPainted(false);
        add_button.setOpaque(true);

        add_label= new JLabel("Add task",SwingConstants.CENTER);
        add_label.setBounds(20,93,70,20);
        add_label.setFont(new Font("Arial",Font.BOLD,15));

        delete_button = new JButton(delete_logo); //creating new JButton
        delete_button.setBounds(20,130,70,70); //placing button on option panel
        delete_button.setBorderPainted(false);
        delete_button.addActionListener(this); //adding action listener to button
        delete_button.setBackground(new Color(237, 226, 211));

        delete_label= new JLabel("Delete task",SwingConstants.CENTER);
        delete_label.setBounds(13,207,83,15);
        delete_label.setFont(new Font("Arial",Font.BOLD,15));

        badges_button= new JButton(badges_logo); //creating new JButton
        badges_button.setBounds(20,250,70,70); // placing button on option panel
        badges_button.addActionListener(this); // adding action listener to button
        badges_button.setBorderPainted(false);
        badges_button.setBackground(new Color(237, 226, 211));

        badges_label= new JLabel("Badges",SwingConstants.CENTER);
        badges_label.setBounds(20,330,80,15);
        badges_label.setFont(new Font("Arial",Font.BOLD,15));

        about_page = new JButton("About Page");
        about_page.setIcon(about_logo);
        about_page.setBounds(28,360,70,70);
        about_page.setBackground(new Color(237, 226, 211));
        about_page.addActionListener(this);
        about_page.setBorderPainted(false);

        about_label= new JLabel("About",SwingConstants.CENTER);
        about_label.setBounds(20,440,70,15);
        about_label.setFont(new Font("Arial",Font.BOLD,15));

        title_label = new JLabel(); //create instance of JLabel
        title_label.setText("Get More Done with Digital Intelligence!"); //set text to JLabel
        title_label.setFont(new Font("Sans serif", Font.BOLD, 25)); // set font of JLabel

        title_panel.add(title_label); //add title_label to title_panel

        option_panel.add(add_label); //adding add_label to option_panel
        option_panel.add(delete_label); //adding delete label to option panel
        option_panel.add(badges_label);
        option_panel.add(about_label);
        option_panel.add(add_button); //adding add button to option panel
        option_panel.add(delete_button); //adding delete button to option panel
        option_panel.add(badges_button); //adding badges button to option panel
        option_panel.add(about_page); //adding about page to option panel

        add_panel = new JPanel();
        add_panel.setBounds(0,100,770,750);
        add_panel.setBackground(new Color(255, 248, 234));
        add_panel.setLayout(new BoxLayout(add_panel,BoxLayout.Y_AXIS));


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
            task=JOptionPane.showInputDialog("Enter your task: ");
            task_end_time[timer_count]=JOptionPane.showInputDialog("Enter end time of task(hh:mm:ss)");
            timer_count=timer_count+1;
            add_task();
            main(null);
            JavaFrame.tasks_done= JavaFrame.tasks_done +1;
            UserBadges.displaybadge_10();
        }
        else if (e.getSource()==delete_button)  //if delete button is selected
        {
            checkbox[getCheckbox_counter_delete].setVisible(false);
            getCheckbox_counter_delete++;
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
        checkbox[checkbox_counter_add] = new JCheckBox();
        //checkbox[checkbox_counter_add].setBounds(0,JavaFrame.y_coordinate,770,100);
        checkbox[checkbox_counter_add].setFont(new Font("Arial",Font.BOLD,25));
        checkbox[checkbox_counter_add].setText(task);
        checkbox[checkbox_counter_add].addItemListener(this);
//        JavaFrame.y_coordinate=JavaFrame.y_coordinate+100;
        add_panel.add(checkbox[checkbox_counter_add]);
        checkbox_counter_add++;
        add_panel.revalidate();
        add_panel.repaint();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        for(int cIs=0;cIs<100;cIs++) //cis stands for CheckIfSelected
        {
            if(checkbox[cIs].isSelected()){
                checkbox[cIs].setBackground(Color.GREEN);
            }
        }
        //end of for loop
    }

    public static void main(String[] args) {
        String hour=task_end_time[0].substring(0,2);
        String minute = task_end_time[0].substring(3,5);
        String seconds = task_end_time[0].substring(6,8);
        int hour_int=Integer.parseInt(hour);
        int minute_int=Integer.parseInt(minute);
        int seconds_int = Integer.parseInt(seconds);
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                JOptionPane.showMessageDialog(null,"You failed to complete your task");
                checkbox[0].setBackground(Color.RED);
            }
        };
        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR,2022);
        date.set(Calendar.MONTH,Calendar.OCTOBER);
        date.set(Calendar.DAY_OF_MONTH,15);
        date.set(Calendar.HOUR_OF_DAY,hour_int);
        date.set(Calendar.MINUTE,minute_int);
        date.set(Calendar.SECOND,seconds_int);

        timer.schedule(task,date.getTime());
    }

}
