package za.ac.cput.project3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 public  class Register implements ActionListener {

     JFrame Reg = new JFrame();
     JLabel RegistrationGUI = new JLabel();
     JLabel login= new JLabel();
     JButton Register = new JButton("REGISTER NOW");
     JButton btnE = new JButton("Exit");
     JButton logint = new JButton("Login");
     private String c1 = "#485460";

    public static void main(String args[]) {

        Register real = new Register();
    } public Register() {

         BuildGUI();

     }
    public void BuildGUI() {

        Reg = new JFrame("Register");
       JLabel lblImage = new JLabel(new ImageIcon("bo.jpg"));
        JLabel n = new JLabel();
        n.setText("Tutoring  Student");
        n.setBounds(45, 233, 455, 22);
        n.setFont(new Font("Serif", Font.BOLD, 28));
        n.setForeground(Color.orange);

        JPanel g = new JPanel();
        g.setBounds(0, 0, 600, 140);
        g.setBackground(Color.GRAY);
        g.add(n);
        g.add(lblImage);

        JLabel lblFill = new JLabel();
        lblFill.setText("Are you looking for a tutor?... ");
        lblFill.setBounds(100, 170, 455, 50);
        lblFill.setFont(new Font("Arial",Font.PLAIN, 18));
        lblFill.setForeground(Color.white);

        Register.addActionListener(this);
        Register.setFont(new Font("Tahoma", Font.BOLD, 20));
        Register.setBackground(Color.BLACK);
        Register.setForeground(Color.WHITE);
        Register.setBounds(100,250, 300, 50);

        btnE.addActionListener(this);
        btnE.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnE.setBackground(Color.BLACK);
        btnE.setForeground(Color.YELLOW);
        btnE.setBounds(200, 350, 100, 37);

        logint.addActionListener(this);
        logint.setFont(new Font("Tahoma", Font.BOLD, 20));
        logint.setBackground(Color.decode(c1));
        logint.setForeground(Color.WHITE);
        logint.setBounds(300,415, 100, 30);

        JLabel lblFill1 = new JLabel();
        lblFill1.setText(">>Already Registered? ");
        lblFill1.setBounds(100, 410, 455, 50);
        lblFill1.setFont(new Font("Arial",Font.PLAIN, 18));
        lblFill1.setForeground(Color.white);

        Reg.getContentPane().add(Register);
        Reg.getContentPane().add(btnE);
        Reg.getContentPane().add(logint);
        Reg.getContentPane().add(lblFill);
        Reg.getContentPane().add(lblFill1);
        Reg.getContentPane().add(g);

        Reg.getContentPane().setBackground(Color.decode (c1));
        Reg.setBounds(100, 100, 505, 500);
        Reg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Reg.getContentPane().setLayout(null);
        Reg.setVisible(true);


    }
     public void sendnow()
    {
//       try{
//         SMS sns = new SMS();
//         sns.SendSMS("dray10","Muta@7767", "thank you dray for making so much effort", "2781478325", "http://bulksms.2way.co.za/eapi/submission/send_sms/2/2.0");
//     
//        }catch(Exception e)
//        {
//            System.out.println(""+e.getMessage());
//        }
     
    }
     @Override
     public void actionPerformed(ActionEvent e) {
         Object SRC = e.getSource();
         if (SRC == Register) {
             Register_ACTION();
         }
             if (SRC == logint) {
                 login_ACTION();
             }
         if (SRC == btnE) {
             System.exit(0);
         }
     }
         public void Register_ACTION(){

             Reg.dispose();
             RegistrationGUI REGI = new RegistrationGUI();
             RegistrationGUI.setVisible(true);

         }
     public void login_ACTION(){

//         Reg.dispose();
//         login log = new login();
//         login.setVisible(true);

     }
     }
