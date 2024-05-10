package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class login extends JFrame implements  ActionListener{
    JButton  NEXT, back;
    JTextField tfname;

    login(){


        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);


//
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("....icons/login.png"));
//        JLabel image = new JLabel(i1);
//        image.setBounds(0, 0, 600, 500);
//        add(image);




        JLabel heading = new JLabel("Question test");
        heading.setBounds(350, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(410, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(30, 144, 254));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(356, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);

        NEXT = new JButton("Next");
        NEXT.setBounds(335, 270, 120, 25);
        NEXT.setBackground(new Color(30, 144, 254));
        NEXT.setForeground(Color.WHITE);
        NEXT.addActionListener(this);
        add( NEXT);

        back = new JButton("Back");
        back.setBounds(515, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);






    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() ==  NEXT) {
            String name = tfname.getText();
            setVisible(false);
            new Quiz(name);
        } else if (ae.getSource() == back) setVisible(false);
    }
    public static void main(String[] args) {
        new login();
    }

}
