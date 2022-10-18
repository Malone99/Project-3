
package za.ac.cput.project3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author draybulambo
 */
public class LoadingScreen extends Frame implements ActionListener{
    

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
    public LoadingScreen()
    {
        
        main= new JFrame("");
        panelNorth = new JPanel();
        panelNorth.setBackground(Color.WHITE);
        panelSouth = new JPanel(); 

        panelCenter = new JPanel();
        panelenter = new JPanel();

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
        ImageIcon icons = new ImageIcon(new ImageIcon("dray.gif").getImage().getScaledInstance(20, 80, Image.SCALE_AREA_AVERAGING));
        
         lblEmail = new JLabel(new ImageIcon("dray.gif"));
        timelabel.setHorizontalAlignment(JLabel.LEFT);
        
       // lblEmail = new JLabel();
        //lblEmail.setIcon(icons);
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
        
        
        
        Surname = new JLabel();
        Surname.setIcon(icons);
        txtSurname = new JLabel("");
        lblErrorSurname = new JLabel();

        
        
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
{ 
        
        main.add(panelCenter, BorderLayout.CENTER);
        panelCenter.add(lblEmail);

        
       
        main.addWindowListener(new WindowAdapter() {
            
        });
         
        main.pack();
        main.setLocationRelativeTo(null);
        main.setVisible(true);
        
}
   

     @Override
    public void actionPerformed(ActionEvent e) {

       
    }
    public static void main(String[] args) {
     new LoadingScreen ().SendEmail();
    }
}