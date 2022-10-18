package za.ac.cput.project3;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import static java.awt.Color.white;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.apache.commons.validator.EmailValidator;


public final class RegistrationGUI  implements ActionListener {

    private JLabel lblImage;

    JFrame RegistrationGUI = new JFrame();
    JLabel Register = new JLabel();
    private JLabel lblFill;
    private String c1 = "#485460";
    private String c2 = "#ff6348";
    private JLabel lblFirstName;
    private JTextField txtFirstName;


    private JLabel lblLastName;
    private JLabel lblemaName;
    private JTextField txtLastName;
    private JLabel lblStudent;
    private JTextField txtStudent;
    private JLabel lblphone;
    private JTextField txtphone;
    private JLabel phone;

    private JLabel lblGender;
    private JPanel panelGender;
    private JRadioButton radMale;
    private JRadioButton radFemale;
    private JLabel lblBlank5;
    private ButtonGroup genderButtonGroup;

    private JLabel lblEvent;
    private JComboBox cboEvent;

    private JComboBox cboHours;
    private JLabel lblHours;

    private JComboBox cboMinutes;
    private JLabel lblMinutes;

    private JComboBox cbopm;
    private JLabel lblpm;

    private JLabel lblNumbers;
    private JComboBox cboNumbers;

    private JLabel lblcomment;
    private JTextField txtcomment;


    private JLabel lblCountry;
    private JComboBox cboCountry;
    private JLabel lblTurtor;
    private JComboBox cboTurtor;

    private JLabel lblFullWeekend;
    private JCheckBox chkterm;
    private JLabel lErrorPensioner;
    private JTextArea output;
    private JTextArea output1;
    private JButton btnNext;
    private JButton btnExit;
    private JButton btnE;
    private JLabel lblMeals;
    DB db=new DB();
    
    private JLabel idame;
    private JLabel psame;
    public RegistrationGUI() {

        BuildGUI();

    }

    private void BuildGUI() {


        RegistrationGUI = new JFrame("REGISTRATION");

        lblImage = new JLabel(new ImageIcon("bo.jpg"));

        JLabel n = new JLabel();

        n.setText("Tutoring  System");
        n.setBounds(45, 200, 900, 22);
        n.setFont(new Font("Serif", Font.BOLD, 28));
        n.setForeground(Color.orange);

        JPanel g = new JPanel();
        g.setBounds(0, 0, 900, 140);
        g.setBackground(Color.GRAY);
        g.add(n);
        g.add(lblImage);

        JLabel lblFill = new JLabel();
        lblFill.setText("Fill out the form carefully.");
        lblFill.setBounds(40, 140, 455, 50);
        lblFill.setFont(new Font("Serif", Font.BOLD, 18));
        lblFill.setForeground(Color.ORANGE);

        lblFirstName = new JLabel("First Name: ");
        lblFirstName.setFont(new Font("Arial", Font.PLAIN, 14));
        lblFirstName.setForeground(Color.white);
        lblFirstName.setBounds(40, 190, 107, 37);

        RegistrationGUI.getContentPane().add(lblFirstName);


        txtFirstName = new JTextField(10);
        txtFirstName.setFont(new Font("Arial", Font.PLAIN, 14));
        txtFirstName.setBounds(187, 190, 270, 37);

        RegistrationGUI.getContentPane().add(txtFirstName);
        
        lblemaName= new JLabel();
        lblLastName = new JLabel("Last Name: ");
        lblLastName.setFont(new Font("Arial", Font.PLAIN, 14));
        lblLastName.setForeground(Color.white);
        lblLastName.setBounds(40, 230, 107, 37);
        RegistrationGUI.getContentPane().add(lblLastName);
        txtLastName = new JTextField(15);
        txtLastName.setFont(new Font("Arial", Font.PLAIN, 14));

        txtLastName.setBounds(187, 230, 270, 37);
        RegistrationGUI.getContentPane().add(txtLastName);

        lblStudent = new JLabel("Email: ");
        lblStudent.setFont(new Font("Arial", Font.PLAIN, 14));
        lblStudent.setForeground(Color.white);
        lblStudent.setBounds(40, 270, 107, 37);
        RegistrationGUI.getContentPane().add(lblStudent);
        txtStudent = new JTextField(15);
        txtStudent.setFont(new Font("Arial", Font.PLAIN, 14));

        txtStudent.setBounds(187, 270, 270, 37);
        RegistrationGUI.getContentPane().add(txtStudent);

        lblphone = new JLabel("Phone Number: ");
        lblphone.setFont(new Font("Arial", Font.PLAIN, 14));
        lblphone.setForeground(Color.white);
        lblphone.setBounds(40, 310, 107, 37);
        RegistrationGUI.getContentPane().add(lblphone);
        phone = new JLabel();
        txtphone = new JTextField(15);
        txtphone.setFont(new Font("Arial", Font.PLAIN, 14));

        txtphone.setBounds(187, 310, 270, 37);
        RegistrationGUI.getContentPane().add(txtphone);

        lblGender = new JLabel("Gender: ");
        lblGender.setFont(new Font("Arial", Font.PLAIN, 14));
        lblGender.setForeground(Color.white);
        lblGender.setBounds(40, 350, 107, 37);
        RegistrationGUI.getContentPane().add(lblGender);
        panelGender = new JPanel();

        idame= new JLabel();
        psame= new JLabel();
        radMale = new JRadioButton("Male");
        radMale.setFont(new Font("Arial", Font.PLAIN, 14));
        radMale.setForeground(Color.white);
        radMale.setBackground(Color.decode(c1));
        radMale.setBounds(187, 350, 270, 37);
        RegistrationGUI.getContentPane().add(radMale);
        radFemale = new JRadioButton("Female");
        radFemale.setFont(new Font("Arial", Font.PLAIN, 14));
        radFemale.setForeground(Color.white);
        radFemale.setBackground(Color.decode(c1));
        radFemale.setBounds(187, 350, 270, 37);
        RegistrationGUI.getContentPane().add(radFemale);
        genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(radMale);
        genderButtonGroup.add(radFemale);
        panelGender.setLayout(new GridLayout(1, 2));
        panelGender.setBounds(187, 350, 270, 37);
        RegistrationGUI.getContentPane().add(panelGender);
        panelGender.add(radMale);
        panelGender.add(radFemale);


        lblcomment = new JLabel("Address: ");
        lblcomment.setFont(new Font("Arial", Font.PLAIN, 14));
        lblcomment.setForeground(Color.white);
        lblcomment.setBounds(40, 390, 270, 37);
        RegistrationGUI.getContentPane().add(lblcomment);
        txtcomment = new JTextField(10);
        txtcomment.setFont(new Font("Arial", Font.PLAIN, 14));
        txtcomment.setBounds(187, 390, 270, 37);
        RegistrationGUI.getContentPane().add(txtcomment);

        lblCountry = new JLabel("Country: ");
        lblCountry.setFont(new Font("Arial", Font.PLAIN, 14));
        lblCountry.setForeground(Color.white);
        lblCountry.setBounds(40, 430, 270, 37);
        RegistrationGUI.getContentPane().add(lblCountry);
        String listOfpayment[] = {"Zimbabwe", "Ghana", "DR Congo", "South Africa",
                "Nigeria", "Canada", "Mexico", "Spain", "France", "Australia",
                "India", "United Kingdom", "South Korea", "China", "Italy", "Colombia", "New zealand",
                "Brazil"};
        cboCountry = new JComboBox(listOfpayment);
        cboCountry.setFont(new Font("Arial", Font.PLAIN, 14));
        cboCountry.setBounds(187, 430, 270, 37);
        RegistrationGUI.getContentPane().add(cboCountry);

        chkterm = new JCheckBox("Accept Terms And Conditons");
        chkterm.setFont(new Font("Arial", Font.PLAIN, 14));
        chkterm.setForeground(Color.white);
        chkterm.setBackground(Color.decode(c1));
        chkterm.setBounds(40, 480, 300, 37);
        RegistrationGUI.getContentPane().add(chkterm);


        btnNext = new JButton("CLEAR FIELDS");
        btnNext.addActionListener(this);
        btnNext.setFont(new Font("Arial", Font.BOLD, 14));
        btnNext.setBackground(Color.DARK_GRAY);
        btnNext.setForeground(Color.BLACK);
        btnNext.setBounds(40, 520, 150, 37);

        btnExit = new JButton("SUBMIT APPLICATION");
        btnExit.addActionListener(this);
        btnExit.setFont(new Font("Arial", Font.BOLD, 14));
        btnExit.setBackground(Color.orange);
        btnExit.setForeground(Color.BLACK);
        btnExit.setBounds(200, 520, 190, 37);

        btnE = new JButton("Back");
        btnE.addActionListener(this);
        btnE.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnE.setBackground(Color.BLACK);
        btnE.setForeground(Color.YELLOW);
        btnE.setBounds(400, 520, 100, 37);

        lblMeals = new JLabel("");
        lblMeals.setFont(new Font("Arial", Font.PLAIN, 14));
        lblMeals.setForeground(Color.white);
        lblMeals.setBounds(40, 550, 400, 37);
        RegistrationGUI.getContentPane().add(lblMeals);

        output = new JTextArea(10, 10);
        output.setFont(new Font("Arial", Font.PLAIN, 14));
        output.setForeground(Color.BLACK);
        output.setBounds(550, 170, 300, 450);
        output.setLineWrap(true);
        output.setEditable(false);
        RegistrationGUI.getContentPane().add(output);

        output1 = new JTextArea(10, 10);
        output1.setFont(new Font("Arial", Font.PLAIN, 14));
        output1.setForeground(Color.BLACK);
        output1.setBounds(550, 170, 300, 400);
        output1.setLineWrap(true);
        RegistrationGUI.getContentPane().add(output1);

        RegistrationGUI.getContentPane().add(lblLastName);
        RegistrationGUI.getContentPane().add(lblStudent);
        RegistrationGUI.getContentPane().add(lblphone);
        RegistrationGUI.getContentPane().add(lblGender);

        RegistrationGUI.getContentPane().add(lblcomment);
        RegistrationGUI.getContentPane().add(btnNext);
        RegistrationGUI.getContentPane().add(btnExit);
        RegistrationGUI.getContentPane().add(btnE);
        RegistrationGUI.getContentPane().add(lblFill);
        RegistrationGUI.getContentPane().add(g);
        RegistrationGUI.getContentPane().setBackground(Color.decode(c1));
        RegistrationGUI.setBounds(100, 100, 900, 700);
        RegistrationGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RegistrationGUI.getContentPane().setLayout(null);
        RegistrationGUI.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == btnE) {
          RegistrationGUI.setVisible(false);
          new Home().setVisible(true);
        }
        if (e.getSource() == btnExit) {
             Number();

            txtLastName.setBackground(white);
            txtStudent.setBackground(white);
            txtphone.setBackground(white);
            txtcomment.setBackground(white);
            String a= txtStudent.getText();
            String aa= lblemaName.getText(); 
                    
            String et= txtphone.getText();
            String ee= phone.getText();
            boolean valid=false;
            
             String fN = txtFirstName.getText();
             String lN = txtLastName.getText();
             String mobileNo = txtphone.getText();
             String add = txtcomment.getText();
            if (!fN.matches("^[a-zA-Z]*$") ) {
                 valid=false;
                txtFirstName.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "require valid First name");
            }
            else if (txtFirstName.getText().equals("")){
            
                txtFirstName.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, " First name is empty");
            }
           else if (!lN.matches("^[a-zA-Z]*$") ) {
             valid=false;
                txtLastName.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, " last name error");
            }
          else if ( txtLastName.getText().equals("")){
           txtLastName.setBackground(Color.red);
           JOptionPane.showMessageDialog(null, " last name is empty");
          }
           else if (txtStudent.getText().equals("") ) {
                valid=false;
                 txtStudent.setBackground(Color.RED);
                 JOptionPane.showMessageDialog(null, " email is empty");
            }
           else if(a==aa){
                  txtStudent.setBackground(Color.RED);
                 JOptionPane.showMessageDialog(null, " Email already Exit");
               
           }
         else if (!EmailValidator.getInstance().isValid(txtStudent.getText())) {
                 txtStudent.setBackground(Color.RED);
             JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
            } 

           else  if(txtphone.getText().equals("")){
               valid=false;
               txtphone.setBackground(Color.red);
                 JOptionPane.showMessageDialog(null, " phone n umber is empty");
           }
          
           else  if (!mobileNo.matches("^[0-9]*$") && mobileNo.length() == 10) {
               valid=false;
                txtphone.setBackground(Color.red);
                //
              JOptionPane.showMessageDialog(null, "error");

            }else  if(txtcomment.getText().equals("")){
               valid=false;
               txtcomment.setBackground(Color.red);
                 JOptionPane.showMessageDialog(null, " address is empty");
           }

            
           else if (!add.matches("^[a-zA-Z0-9]*$")) {
              valid=false;
                txtcomment.setBackground(Color.red);
                //JOptionPane.showMessageDialog(null, "error");
            }
            
            else if(fN.matches("^[a-zA-Z]*$") && !txtFirstName.getText().equals("") && lN.matches("^[a-zA-Z]*$")
                    && !txtLastName.getText().equals("")&& !txtStudent.getText().equals("") && 
                    !txtStudent.getText().equals(lblemaName.getText())&& EmailValidator.getInstance().isValid(txtStudent.getText())
                    && !txtphone.getText().equals("") && mobileNo.matches("^[0-9]*$") && mobileNo.length() == 10
                    && !txtcomment.getText().equals("")&& add.matches("^[a-zA-Z0-9]*$") && !txtphone.getText().equals(phone.getText())){
            
             insert();
            String def = "";
             txtFirstName.setText(def);
            txtFirstName.setBackground(white);
            txtLastName.setText(def);
            txtLastName.setBackground(white);
            txtStudent.setText(def);
            txtStudent.setBackground(white);
            txtphone.setText(def);
            txtphone.setBackground(white);
            txtcomment.setText(def);
            txtcomment.setBackground(white);
            chkterm.setSelected(false);
            cboCountry.setSelectedIndex(0);
            output.setText(def);
            output1.setText(def);
             Register.setVisible(false);
            
            }
            




        if (e.getSource() == btnNext) {

            

                String def = ""; 
            txtFirstName.setText(def);
            txtFirstName.setBackground(white);
            txtLastName.setText(def);
            txtLastName.setBackground(white);
            txtStudent.setText(def);
            txtStudent.setBackground(white);
            txtphone.setText(def);
            txtphone.setBackground(white);
            txtcomment.setText(def);
            txtcomment.setBackground(white);
            chkterm.setSelected(false);
            cboCountry.setSelectedIndex(0);
            output.setText(def);
            output1.setText(def);
        }

        }
    }

   void insert(){
   
       try {
               
                String firstname = txtFirstName.getText();
                String lastname = txtLastName.getText();
                String EMAIL = txtStudent.getText();
                String PAS=txtFirstName.getText();
                String PASSWORD=PAS+"@871";
                String MOBILE =txtphone.getText();
                String address = txtcomment.getText();
                String Country = cboCountry.getSelectedItem().toString();
                String gender = " Male";
                if (txtStudent.getText().equals(lblemaName.getText()) ) {
               
                txtStudent.setBackground(Color.RED);
                txtStudent.setForeground(Color.WHITE);
               JOptionPane.showMessageDialog(null, "Email Already Exist");
               txtStudent.setRequestFocusEnabled(true);

            }
                if(radFemale.isSelected()){
                    gender="Male";
                }else{
                   gender="Female"; 
                }
                
                regiserWorker students= new regiserWorker(firstname,lastname,EMAIL,PASSWORD,MOBILE,gender,address,Country);
                db.InsertAnswerQuestion(students);
                JOptionPane.showMessageDialog(null, "Register Sucessfully");
                search();
                RegistrationGUI.setVisible(false);
                new Sign_In().setVisible(true);
             } catch (SQLException ex) {
               System.out.println(ex.getMessage());
           }
             
   
   }
   public void Number()
    {
        
        try {
            String Email=txtStudent.getText();
            String na=txtphone.getText();
                 String query = "select *from APP.STUDENTS where Email ='"+Email+"'";
                 String url="jdbc:derby://localhost:1527/Tutorial";
                 String username = "Tutorial";
                 String password = "Tutorial";
                 Connection con= DriverManager.getConnection(url, username, password);  
            PreparedStatement statmnt = con.prepareStatement(query);
            ResultSet result = statmnt.executeQuery();
           
             if (result.next())
            {  
                txtStudent.setBackground(Color.RED);
                JOptionPane.showMessageDialog(null, " Email already Exit");
              // txtStudent.setText("Email Already Exist");
                lblemaName.setText(Email);
                
               
            }
        } catch (Exception k) {
 
            JOptionPane.showMessageDialog(null, "Email Address not found"+k.getMessage());
        }
                     
    }
   public void sendMain(String toEmail, String code) {
       
        String from ="faithlerato605@gmail.com";
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        String username = "faithlerato605@gmail.com";
        String password = "pfyzlepsjzfolggo";  
        Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject("CPUT Tutoring System");
            message.setText(code);
            Transport.send(message);
            System.out.println("send succesffuly");
        } catch (MessagingException e) {
            if (e.getMessage().equals("Invalid Addresses")) {
                System.out.println("Invalid email");
            } else {
                System.out.println("Error");
            }
        }
       
    }
   
   public void search() throws SQLException
{
              String pid =  txtStudent.getText();
               
        String from  ="faithlerato605@gmail.com";
        String toEmail = txtStudent.getText();
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.ssl.protocols", "TLSv1.2");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        String username = "faithlerato605@gmail.com";
        String password = "pfyzlepsjzfolggo";
        Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
             try
                {
                    String Sear = "select * from APP.STUDENTS where Email = ?";
                 String url="jdbc:derby://localhost:1527/Tutorial";
                 String usrname = "Tutorial";
                 String pssword = "Tutorial";
                    Connection con= DriverManager.getConnection(url, usrname, pssword);
                    PreparedStatement ps= con.prepareStatement(Sear); 
                    ps.setString(1, pid);
                    ResultSet rs = ps.executeQuery();
              
             if ( rs.next() == true )
                {
                 
                
                  String SU=rs.getString( "STUDENTID");
                  String pass=rs.getString( "password");
                 idame.setText(SU);
                 psame.setText(pass);

                 System.out.println(SU);
                 System.out.println(pass);
                 
                 
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress(from));
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
                message.setSubject("CONGRATILATION");
                message.setText("Congratulations Your registration has been recorded. Our Admissions has sent you\n" +SU
                                 +"  has Your student number and "+pass+" has password. Looking forward to seeing you!");
                Transport.send(message);
             System.out.println("ssssss");
            
            }else
            {
                 System.out.println("active less security your email");
            }
        } catch (MessagingException e) {
          
                System.out.println("Invalid email"+e.getMessage());
            
        }
       
    }  

}
      






