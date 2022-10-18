/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.project3;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author FARAI SKOOL
 */
public class Payment extends javax.swing.JFrame {

    int cardPin = 1234;
    String email="tutor@gmail.com";
    
    

    /**
     * Creates new form Payment
     */
    public Payment() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        lblValidation2.setVisible(false);
        lblValidation1.setVisible(false);
        load.setVisible(false);
        dateComb.setEnabled(false);
        cboDate();
        buttonActions(btnPay);
        buttonActions(btnReset);
        
        
    }

    public void cboDate() {
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        dateComb.addItem(+year + "-" + (month + 1) + "-" + day);
        dateComb.addItem(+year + "-" + (month + 1) + "-" + (day + 1));
        dateComb.addItem(+year + "-" + (month + 1) + "-" + (day + 2));
        dateComb.addItem(+year + "-" + (month + 1) + "-" + (day + 3));
        dateComb.addItem(+year + "-" + (month + 1) + "-" + (day + 4));
        dateComb.addItem(+year + "-" + (month + 1) + "-" + (day + 5));
        dateComb.addItem(+year + "-" + (month + 1) + "-" + (day + 6));
        dateComb.addItem(+year + "-" + (month + 1) + "-" + (day + 7));
        dateComb.addItem(+year + "-" + (month + 1) + "-" + (day + 8));
        dateComb.addItem(+year + "-" + (month + 1) + "-" + (day + 9));
        dateComb.addItem(+year + "-" + (month + 1) + "-" + (day + 10));
        dateComb.addItem(+year + "-" + (month + 1) + "-" + (day + 11));


    }

    public void startUserGUI() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    public void CardNumValidation() {
        if (txtFdCardNum1.getText().isEmpty()) {

            lblValidation1.setVisible(true);
        } 
        else if (!txtFdCardNum1.getText().isEmpty()){
            lblValidation1.setVisible(false);
        }
         if (jPasswordField1.getText().isEmpty()) {

            lblValidation2.setVisible(true);
        } else if (!jPasswordField1.getText().isEmpty())  {
            lblValidation2.setVisible(false);
        }
        else if  (txtFdCardNum1.getText().length() != 12) {
            JOptionPane.showMessageDialog(null, "Card Number INCOMPLETE");
        }
        
    }

    public void CardNumValidationLength() {
         btnPay.setVisible(true);
    }

    public void ccvValidation() {
       

    }

    public void onlinePayment(){
    
    String input;
            String verifyPin;
            input = JOptionPane.showInputDialog("Enter Email for Receits ");
            verifyPin = input;

            if (email.equals(verifyPin)) {
                JOptionPane.showMessageDialog(null, "Email valid");
                JOptionPane.showMessageDialog(null, "Payment SuccessFull");
                Resources opn = new Resources();
                    
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Pin Incorrect");
            }
    
    }
        public void insert()
     {
         
        boolean valid = true;
         String insert = "insert into APP.DETAILS (StudentNumber, COURSE, STUDENT_Availabilities,time,lecture_Name,amountByHours,status) " + " VALUES (?,?,?,?,?,?,?)";
         try
         {
             String stats="Approved";
            String url="jdbc:derby://localhost:1527/Tutorial";
            String user = "Tutorial";
            String pass = "Tutorial";
         Connection con= DriverManager.getConnection(url, user, pass);
         PreparedStatement ps= con.prepareStatement(insert);
         ps.setString(1,StudentNumber.getText() );
         ps.setString(2,courseP.getText());
         ps.setString(3,avaible.getText() );
         ps.setString(4,times.getText() );
         ps.setString(5,lecturename.getText());
         ps.setString(6,payamout.getText() );
         ps.setString(7,stats );

         
       
             int  push=ps.executeUpdate();
             if(push>0){
               
             JOptionPane.showMessageDialog(this," Payment Successfully");
               dispose();
              Sign_In a= new Sign_In();
               a.show();
           }
          
         
          }
         catch(SQLException e)
         {
             System.out.println(""+e.getMessage());
         }
     }
   private void buttonActions(final JButton button) {
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(Color.WHITE);
                button.setForeground(Color.GRAY);
                button.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(Color.GRAY);
                button.setForeground(Color.WHITE);
                button.setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
            }
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRadioBtnCard = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtFdCardNum1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblValidation2 = new javax.swing.JLabel();
        dateComb = new javax.swing.JComboBox<>();
        lblValidation1 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        lblPP = new javax.swing.JLabel();
        btnPay = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        load = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        StudentNumber = new javax.swing.JLabel();
        courseP = new javax.swing.JLabel();
        times = new javax.swing.JLabel();
        avaible = new javax.swing.JLabel();
        lecturename = new javax.swing.JLabel();
        payamout = new javax.swing.JLabel();
        status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioBtnCard.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioBtnCard.setText("Online");
        jRadioBtnCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBtnCardActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioBtnCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 30));

        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 12)); // NOI18N
        jLabel1.setText("Card Number");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 100, 30));

        txtFdCardNum1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtFdCardNum1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFdCardNum1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        txtFdCardNum1.setEnabled(false);
        txtFdCardNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFdCardNum1ActionPerformed(evt);
            }
        });
        txtFdCardNum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFdCardNum1KeyTyped(evt);
            }
        });
        jPanel1.add(txtFdCardNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 265, 30));

        jLabel2.setFont(new java.awt.Font("Sitka Display", 1, 12)); // NOI18N
        jLabel2.setText("CCV Code");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 85, -1));

        lblValidation2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblValidation2.setForeground(new java.awt.Color(204, 0, 0));
        lblValidation2.setText("required*");
        lblValidation2.setEnabled(false);
        jPanel1.add(lblValidation2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 111, 23));

        dateComb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dateComb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "yy/mm" }));
        jPanel1.add(dateComb, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 100, 30));

        lblValidation1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblValidation1.setForeground(new java.awt.Color(204, 0, 0));
        lblValidation1.setText("required*");
        lblValidation1.setEnabled(false);
        jPanel1.add(lblValidation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 70, 43));

        btnReset.setText("jButton1");
        jPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(1168, 290, 89, 31));
        jPanel1.add(lblPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 124, 111, 23));

        btnPay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPay.setText("Pay");
        btnPay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });
        jPanel1.add(btnPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 240, 30));

        jLabel3.setFont(new java.awt.Font("Kailasa", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Payment");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 100, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/methysmacbookpro32/NetBeansProjects/Project3/image resorces/contact us icons/payment.png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 340, 390));

        jLabel6.setFont(new java.awt.Font("Kailasa", 1, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon("/Users/methysmacbookpro32/NetBeansProjects/Project3/image resorces/contact us icons/icons8-payment-64.png")); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 60));

        jPasswordField1.setText("1231");
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyTyped(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 90, -1));

        load.setIcon(new javax.swing.ImageIcon("/Users/methysmacbookpro32/NetBeansProjects/Project3/Spinner-5.gif")); // NOI18N
        jPanel1.add(load, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 740, 390));

        lblIcon.setBackground(new java.awt.Color(255, 255, 255));
        lblIcon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 90, 58));

        StudentNumber.setIcon(new javax.swing.ImageIcon("/Users/methysmacbookpro32/NetBeansProjects/Project3/back.jpg")); // NOI18N
        getContentPane().add(StudentNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 530));

        courseP.setText("jLabel7");
        getContentPane().add(courseP, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        times.setText("jLabel8");
        getContentPane().add(times, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));
        getContentPane().add(avaible, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        lecturename.setText("jLabel5");
        getContentPane().add(lecturename, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, -1, -1));

        payamout.setText("jLabel5");
        getContentPane().add(payamout, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, -1, -1));

        status.setText("jLabel5");
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioBtnCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBtnCardActionPerformed
        // TODO add your handling code here:
        if (jRadioBtnCard.isContentAreaFilled()) {
            txtFdCardNum1.setEnabled(true);
            jPasswordField1.setEnabled(true);
//            btnClearReset.setEnabled(true);
            dateComb.setEnabled(true);
//            btnClearReset.setEnabled(true);

        }
        if (!jRadioBtnCard.isSelected()) {
            txtFdCardNum1.setEnabled(false);
            jPasswordField1.setEnabled(false);
//            btnClearReset.setEnabled(false);
            btnPay.setEnabled(false);
            dateComb.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioBtnCardActionPerformed

    private void txtFdCardNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFdCardNum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFdCardNum1ActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
      
        if (txtFdCardNum1.getText().isEmpty()){
             JOptionPane.showMessageDialog(null, "Fill The Card Number "); 
        }
        else if  (txtFdCardNum1.getText().length() <12) {
            JOptionPane.showMessageDialog(null, "Card Number INCOMPLETE");
            
           
        }else if (jPasswordField1.getText().isEmpty() )  {
            JOptionPane.showMessageDialog(null, "Fill The CCV "); 
        }else if  (jPasswordField1.getText().length() <4){
        JOptionPane.showMessageDialog(null, "Fill The Correct CCV "); 
        
        }else{
             final Thread thread = new Thread(new Runnable() {
         public void run() {
        
          try {
                                
            load.setVisible(true);  
            
            Thread.sleep(3000);
            load.setVisible(false); 
//             JOptionPane.showMessageDialog(null, "Payment succefully "); 
             
              insert();
             
           
            } catch (InterruptedException e1) {}
           
            
                    }
                });
                thread.start();
            
            
          
        }
        
    }//GEN-LAST:event_btnPayActionPerformed

    private void txtFdCardNum1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFdCardNum1KeyTyped
         
        String cardnumber=txtFdCardNum1.getText();
        int length=cardnumber.length();
        char c=evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9' ){
          
           if(length<12){
             txtFdCardNum1.setEditable(true);
           }else{
             txtFdCardNum1.setEditable(false);
           }
           
        }else{
            
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
            txtFdCardNum1.setEditable(true);
            }else{
            txtFdCardNum1.setEditable(false);
            }
        }
    }//GEN-LAST:event_txtFdCardNum1KeyTyped

    private void jPasswordField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyTyped
       String cardnumber=jPasswordField1.getText();
        int length=cardnumber.length();
        char c=evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9' ){
          
           if(length<4){
             jPasswordField1.setEditable(true);
           }else{
             jPasswordField1.setEditable(false);
           }
           
        }else{
            
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE||evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
            jPasswordField1.setEditable(true);
            }else{
            jPasswordField1.setEditable(false);
            }
        }
    }//GEN-LAST:event_jPasswordField1KeyTyped
 public void LoadingLogin()
  {
       
        
        final Thread thread = new Thread(new Runnable() {
         public void run() {
         for (int t = 1; t <= 10; t++) {
          try {
                                
            load.setEnabled(true);  
            Thread.sleep(1000);
            System.out.print(t + " ");
            } catch (InterruptedException e1) {}
            }
            
                    }
                });
                thread.start();
            
            
      
  }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel StudentNumber;
    public javax.swing.JLabel avaible;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnReset;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JLabel courseP;
    private javax.swing.JComboBox<String> dateComb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioBtnCard;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblPP;
    private javax.swing.JLabel lblValidation1;
    private javax.swing.JLabel lblValidation2;
    public javax.swing.JLabel lecturename;
    private javax.swing.JLabel load;
    public javax.swing.JLabel payamout;
    public javax.swing.JLabel status;
    public javax.swing.JLabel times;
    private javax.swing.JTextField txtFdCardNum1;
    // End of variables declaration//GEN-END:variables
}
