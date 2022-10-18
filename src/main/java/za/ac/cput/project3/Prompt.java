/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package za.ac.cput.project3;

/**
 *
 * @author methysmacbookpro32
 */
public class Prompt extends javax.swing.JFrame {

    public Prompt() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ONLINE = new javax.swing.JRadioButton();
        PERSON = new javax.swing.JRadioButton();
        OTHERSS = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        number = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        course = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(685, 443));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Which platmorm are you most comfortable with?");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0)));

        ONLINE.setBackground(new java.awt.Color(0, 0, 0));
        ONLINE.setForeground(new java.awt.Color(255, 255, 255));
        ONLINE.setText("Online");
        ONLINE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ONLINEActionPerformed(evt);
            }
        });

        PERSON.setBackground(new java.awt.Color(0, 0, 0));
        PERSON.setForeground(new java.awt.Color(255, 255, 255));
        PERSON.setText("In Person");
        PERSON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PERSONActionPerformed(evt);
            }
        });

        OTHERSS.setBackground(new java.awt.Color(0, 0, 0));
        OTHERSS.setForeground(new java.awt.Color(255, 255, 255));
        OTHERSS.setText("Other");
        OTHERSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OTHERSSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
            .addComponent(ONLINE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PERSON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(OTHERSS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ONLINE, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PERSON, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OTHERSS, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setIcon(new javax.swing.ImageIcon("/Users/methysmacbookpro32/NetBeansProjects/Project3/image resorces/contact us icons/icons8-back-arrow-50.png")); // NOI18N
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 60, 30));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon("/Users/methysmacbookpro32/NetBeansProjects/Project3/image resorces/contact us icons/icons8-forward-button-50.png")); // NOI18N
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 50, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/methysmacbookpro32/NetBeansProjects/Project3/image resorces/-background-study-99060294.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMinimumSize(new java.awt.Dimension(685, 443));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 340, 420));

        number.setIcon(new javax.swing.ImageIcon("/Users/methysmacbookpro32/NetBeansProjects/Project3/image resorces/giphy.gif")); // NOI18N
        number.setText("jLabel2");
        number.setMinimumSize(new java.awt.Dimension(685, 443));
        getContentPane().add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 340, 420));

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 100, -1));

        course.setText("jLabel3");
        getContentPane().add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));

        jMenu2.setText("Find A tutor");

        jMenuItem1.setIcon(new javax.swing.ImageIcon("/Users/methysmacbookpro32/Desktop/tutorial_System/src/image resorces/icons8-ibooks-48.png")); // NOI18N
        jMenuItem1.setText("Search for Tutor");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Resources");

        jMenuItem2.setIcon(new javax.swing.ImageIcon("/Users/methysmacbookpro32/Desktop/tutorial_System/src/image resorces/book images/icons8-stack-of-paper-24.png")); // NOI18N
        jMenuItem2.setText("Free eBooks");
        jMenu3.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon("/Users/methysmacbookpro32/Desktop/tutorial_System/src/image resorces/book images/icons8-storytelling-24.png")); // NOI18N
        jMenuItem3.setText("Search For eBooks");
        jMenu3.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon("/Users/methysmacbookpro32/Desktop/tutorial_System/src/image resorces/book images/icons8-storytelling-24.png")); // NOI18N
        jMenuItem4.setText("Search for Past Exam papers");
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ONLINEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ONLINEActionPerformed
            
        dispose();
        
       Prompt2 d=new Prompt2(); 
       d.num1.setText(number.getText());
       d.couse.setText(course.getText());
       d.avai.setText(ONLINE.getText());
      
       System.out.println(number.getText());
       System.out.println(course.getText());
       System.out.println(ONLINE.getText());
       
       d.show();
    }//GEN-LAST:event_ONLINEActionPerformed

    private void PERSONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PERSONActionPerformed
       
        dispose();
       Prompt2 d=new Prompt2(); 
       
      
       d.num1.setText(number.getText());
       d.couse.setText(course.getText());
       d.avai.setText( PERSON.getText());
       
       d.show();
    }//GEN-LAST:event_PERSONActionPerformed

    private void OTHERSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OTHERSSActionPerformed
                   dispose();
       Prompt2 d=new Prompt2(); 
       d.num1.setText(number.getText());
       d.couse.setText(course.getText());
       d.avai.setText( OTHERSS.getText());
       d.show();
    }//GEN-LAST:event_OTHERSSActionPerformed

   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ONLINE;
    private javax.swing.JRadioButton OTHERSS;
    private javax.swing.JRadioButton PERSON;
    public javax.swing.JLabel course;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel number;
    // End of variables declaration//GEN-END:variables
}
