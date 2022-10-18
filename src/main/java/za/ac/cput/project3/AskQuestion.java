
package za.ac.cput.project3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
//import javax.mail.MessagingException;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class AskQuestion extends Frame implements ActionListener{
    

    private JFrame main;
    private JPanel panelNorth,panelCenter,panelSouth,panelWest,PAnelSouth,panelenter;
    
    private JLabel lblCompanyName;
    private JLabel lblProfile;
    
    private JMenuBar MenuBar;
    private JMenu Menu1;
    private JMenu Menu2;
    private JMenu Menu3;
    
    private JMenuItem Item1;
    private JMenuItem Item2;
    private JMenuItem Item3;
    
    
    private Calendar calendar;
    private SimpleDateFormat timeformat;
    private SimpleDateFormat dayformat;
    private SimpleDateFormat Dateformat;
    private JLabel timelabel;
    private JLabel daylabel;
    private JLabel Datelabel;
    
    private JLabel lblPadding0, lblPadding01, lblPadding1, lb1Welcome ,lblPadding03, lblPadding04, lblPadding5;
    private JLabel   lblPadding06, lblPadding07,lblPadding9, lblPadding8;
    
  
     
    private JLabel lblEmail;
    private JLabel Emai;
    private JTextField txtEmail;
    private JLabel Email;
    private JLabel lblErrorEmail;
    private JLabel ErrorEmail;
    
    private JLabel Surname;
    private JLabel txtSurname;
    private JLabel lblErrorSurname;
    
    private JLabel lblAdress;
    private JTextField cboAdress;
    private JLabel lblErrorAdress;
    
    private JLabel lblGender;
    private JTextField cboGender;
    private JLabel lblErrortxtDob;
    
    private JLabel lblAmount;
    private JTextArea Amount;
    private JLabel lAmount;
    
    private JLabel lblPassword;
    private JPasswordField txtPassword;
    private JLabel lblErrorPassword;

    private JRadioButton radYes;
    private JRadioButton radNo;
    private ButtonGroup btnGroup;

    private JFrame MainFrame;
    JLabel label;

   
    private Font ft1, ft2, ft3, ft4;
    private JButton btnLogin, button;
    private JButton btnForgot;
    private JButton btnNext;
    private JButton btnSearchv;
    private JScrollPane jscrollPane;
    private JLabel panelBlank1, panelBlank2, panelBlank3, panelBlank4,panelBlank6,panelBlank7, panelBlank5;
    private JLabel panelBlank8, panelBlank9, panelBlank10, panelBlank11,panelBlank12,panelBlank13, panelBlank15;
    private JLabel panelBlank16, panelBlank17, panelBlank18, panelBlank19,panelBlank20,panelBlank21, panelBlank22;
    private JButton btnBack;
    String time;
    String day;
    String Date;
    String from ,to, host,sub,content;
    public AskQuestion()
    {
        
        main= new JFrame("");
        panelNorth = new JPanel();
        panelNorth.setBackground(Color.WHITE);
        panelSouth = new JPanel(); 
        panelSouth.setBackground(new Color(84, 153, 199));
        panelCenter = new JPanel();
        panelenter = new JPanel();
        panelCenter.setBackground(new Color(84, 153, 199));
        panelenter.setBackground(new Color(84, 153, 199));
        PAnelSouth= new JPanel();
        panelWest = new JPanel();
        panelWest.setBackground(new Color(84, 153, 199));

        main.setPreferredSize(new Dimension(600, 280));
        radYes = new JRadioButton("Email");
        radNo = new JRadioButton("SMS");
        btnGroup = new ButtonGroup();
        MenuBar = new JMenuBar();
        //Menu1=new JMenu("Message");
       // Menu2=new JMenu("Email");
        //Menu3=new JMenu("Meeting");
        Item1=new JMenuItem ("My Grades");
        Item1.setVisible(false);
        
        ft1 = new Font("Arial", Font.BOLD, 15);
        ft2 = new Font("Arial", Font.PLAIN, 22);
        ft3 = new Font("Arial", Font.PLAIN, 24);
        ft4 = new Font("Arial", Font.ITALIC, 16);
        
        Item2=new JMenuItem ("Discussions");
        Item2.setVisible(false);
        Item3=new JMenuItem ("Help");
        Item3.setVisible(false);
        lblCompanyName = new JLabel("EMAIL");
        lblCompanyName.setForeground(Color.LIGHT_GRAY);
        
        Dateformat = new SimpleDateFormat("MMMMM dd, yyyy");
        Datelabel= new JLabel();
        Datelabel.setFont(new Font("Ink Free",Font.PLAIN,10));
        
        timeformat = new SimpleDateFormat("hh:mm:ss a");
        timelabel= new JLabel();
        timelabel.setFont(new Font("Verdana",Font.PLAIN,10));
        timelabel.setForeground(Color.WHITE);
        timelabel.setBackground(Color.black);
        timelabel.setOpaque(true);
        
        dayformat = new SimpleDateFormat("EEEE");
        daylabel= new JLabel();
        daylabel.setFont(new Font("Ink Free",Font.PLAIN,10));
        
         
        timelabel.setHorizontalAlignment(JLabel.LEFT);
        
        lblEmail = new JLabel();
        Emai = new JLabel("to:");
        Emai.setHorizontalAlignment(JLabel.RIGHT);
        Emai.setVisible(false);
        lblEmail.setHorizontalAlignment(JLabel.RIGHT);
        txtEmail = new JTextField();
        txtEmail.setVisible(false);
        Email = new JLabel();
        lblErrorEmail = new JLabel("*Please enter a valid");
        lblErrorEmail.setForeground(Color.red);
        lblErrorEmail.setVisible(false);
        lblEmail.setBackground(Color.WHITE);
        lblEmail.setForeground(Color.BLACK);
        
        ErrorEmail = new JLabel("* Email must be fill");
        ErrorEmail.setForeground(Color.red);
        ErrorEmail.setVisible(false);
        Email.setBackground(Color.WHITE);
        Email.setForeground(Color.BLACK);
        
        lblPassword = new JLabel();
       
        lblPassword.setHorizontalAlignment(JLabel.RIGHT);
        txtPassword= new JPasswordField("Password");
        lblErrorPassword= new JLabel("*Password must be filled");
        lblErrorPassword.setForeground(Color.red);
        lblErrorPassword.setVisible(false);
        

        lblPadding0 = new JLabel("");
        lblPadding01 = new JLabel("");
        lblPadding1 = new JLabel("");
        lblPadding03 = new JLabel("");
        lblPadding04 = new JLabel("");
        lblPadding5 = new JLabel("");
        
        lb1Welcome = new JLabel("");
        lb1Welcome.setForeground(new Color(0, 205, 179));
        lblPadding06 = new JLabel("");
        lblPadding07 = new JLabel("");
        lblPadding8= new JLabel("");
        lblPadding9= new JLabel("");
        button = new JButton("Add picture");
        button.setBounds(300,300,100,40);
        label = new JLabel();
        
        
        
        Surname = new JLabel("Surname:  ");
        txtSurname = new JLabel("");
        lblErrorSurname = new JLabel();

        Surname.setForeground(Color.BLACK);
        
        lblGender = new JLabel("From:");
        cboGender = new JTextField();
        lblGender.setHorizontalAlignment(JLabel.RIGHT);
        lblErrortxtDob = new JLabel("*required");
        lblErrortxtDob.setForeground(Color.red);
        lblErrortxtDob.setVisible(false);
       
        lblAmount = new JLabel("");
        Amount = new JTextArea();
         
        jscrollPane=new JScrollPane(Amount);
        jscrollPane.setPreferredSize(new Dimension(300, 100));
         //Amount.setPreferredSize(new Dimension(250,40));
        lblAmount.setHorizontalAlignment(JLabel.RIGHT);
        lAmount = new JLabel("R");
        lAmount.setForeground(Color.red);
        lAmount.setVisible(false);
        
        
        btnLogin = new JButton("Send");
        btnLogin.setHorizontalAlignment(JLabel.RIGHT);
        btnLogin.setBackground(new Color(26, 188, 156 ));
        btnLogin.setForeground(Color.BLACK);
        btnNext = new JButton("Student");
        btnNext.setBackground(Color.white);
        btnNext.setForeground(Color.BLACK);
        
        lblAdress = new JLabel(" Adress: ");
        cboAdress = new JTextField(15);
        lblErrorAdress = new JLabel("*required");
        lblErrorAdress.setForeground(Color.red);
        lblErrorAdress.setVisible(false);
        lblAdress.setForeground(Color.BLACK);

        btnBack= new JButton("Back");
        btnBack.setBackground(new Color(231, 76, 60 ));
       
        
        panelBlank1 = new JLabel();
        panelBlank6= new JLabel();
        panelBlank2 = new JLabel();
        panelBlank3 = new JLabel();
        panelBlank4 = new JLabel("");
        panelBlank7 = new JLabel();
        panelBlank5 = new JLabel();
        panelBlank8 = new JLabel();
        panelBlank9= new JLabel();
        panelBlank10 = new JLabel();
        panelBlank11 = new JLabel();
        panelBlank12 = new JLabel("");
        panelBlank13 = new JLabel();
        panelBlank15 = new JLabel();
        panelBlank16 = new JLabel();
        panelBlank17 = new JLabel();
        panelBlank18 = new JLabel("");
        panelBlank19 = new JLabel();
        panelBlank20= new JLabel();
        
        btnLogin.addActionListener(this);
        btnNext.addActionListener(this);
        btnBack.addActionListener(this);
        Item1.addActionListener(this);
        Item2.addActionListener(this);
        Item3.addActionListener(this);
        
    }
    
    public void SendEmail() 
{       //panelCenter.setBackground(Color.WHITE);
        panelCenter.setLayout(new GridLayout(3, 3));
        panelenter.setLayout(new GridLayout(1, 2));
        main.add(panelNorth, BorderLayout.NORTH);
        panelSouth.setLayout(new GridLayout(1, 3));
        PAnelSouth.setLayout(new GridLayout(15, 1));
        //panelWest.setLayout(new GridLayout(5, 1));
        main.add(panelCenter, BorderLayout.CENTER);
        main.add(panelSouth, BorderLayout.SOUTH);
        //main.add(panelWest, BorderLayout.WEST);
        main.add(PAnelSouth, BorderLayout.WEST);
        //panelenter.setLayout(new GridLayout(1, 3));
        btnGroup.add(radYes);
        btnGroup.add(radNo);
        MenuBar.add(radNo);
        MenuBar.add(radYes);
        //MenuBar.add(Menu3);
        panelWest.add(Datelabel);
        panelWest.add(timelabel);
        panelCenter.add(lblPadding0);  
        panelCenter.add(lblPadding01);
        panelCenter.add(panelWest);
        
        Datelabel.setFont(ft1);
        Surname.setHorizontalAlignment(JLabel.RIGHT);
        panelCenter.add(Emai);
        panelCenter.add(txtEmail);
        panelCenter.add(lblPadding03);
        Emai.setHorizontalAlignment(JLabel.RIGHT);
        panelenter.add(btnLogin);
        panelenter.add(btnBack);
        panelCenter.add(lblGender);
        panelCenter.add(cboGender);
        panelCenter.add(panelenter);
        
        
        
       
        panelSouth.add(lblAmount);
        panelSouth.add(jscrollPane);
        panelSouth.add(lblPadding9);
        
        
        Date=Dateformat.format(Calendar.getInstance().getTime());
        Datelabel.setText(Date);
        time=timeformat.format(Calendar.getInstance().getTime());
        timelabel.setText(time);
       
        panelNorth.add(MenuBar);
        lblCompanyName.setHorizontalAlignment(JLabel.CENTER);
       
        main.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               main.setVisible(false);
               
            }
        });
         
        main.pack();
        main.setLocationRelativeTo(null);
        main.setVisible(true);
        
}
    public void sendMain() {
        
//        String from = "faithlerato605@gmail.com";
//        String toEmail = cboGender.getText();
//        String mesaages= Amount.getText();
//        String Subject= "Student Queries";
//        Properties prop = new Properties();
//        prop.put("mail.smtp.host", "smtp.gmail.com");
//        prop.put("mail.smtp.port", "587");
//        prop.put("mail.smtp.auth", "true");
//        prop.put("mail.smtp.ssl.protocols", "TLSv1.2");
//        prop.put("mail.smtp.starttls.enable", "true");
//        String username = "faithlerato605@gmail.com";
//        String password = "pfyzlepsjzfolggo";    //  Your email password here
//        Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
//            @Override
//            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
//                return new javax.mail.PasswordAuthentication(username, password);
//            }
//        });
//        try {
//            javax.mail.Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(from));
//            message.addRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(from));
//            message.setSubject(Subject);
//            message.setText("Good day Sir"
//                    + "I hope this email ");
//            Transport.send(message);
//            System.out.println("send successfully");
//            JOptionPane.showMessageDialog(null, "send successfully");
//        } catch (MessagingException e) {
//            if (e.getMessage().equals("Invalid Addresses")) {
//                System.out.println("Invalid email");
//            } else {
//                System.out.println("Error"+e.getMessage());
//            }
//        }
//       
    }
    public void RESET() 
{
    txtEmail.setText("");
    cboGender.setText("");
    Amount.setText("");
    

}
    public void SetTime()
{
    while(true)
    {
        time=timeformat.format(Calendar.getInstance().getTime());
        timelabel.setText(time);
        day=dayformat.format(Calendar.getInstance().getTime());
        daylabel.setText(day);
        Date=Dateformat.format(Calendar.getInstance().getTime());
        Datelabel.setText(Date);
        
         try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
           ex.printStackTrace();
        }
    }
} 
 

     @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnBack) 
        {
           // main.setVisible(false);

            
        }
         if (e.getSource() == btnLogin) 
        {
           
         new AskQuestion ().sendMain() ;
            
        }
    
    }
    public static void main(String[] args) {
     new AskQuestion ().SendEmail();
    }
}