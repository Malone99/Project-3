
package za.ac.cput.project3;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;

/**
 *
 * @author draybulambo
 */
public class ContactUs extends Frame implements ActionListener {
    private JFrame mainFrame;
    private JPanel panelNorth,panelCenter,panelSouth,panelWest,
            panelEmpty,panelEmpty2,panel,panel1,panel2,panel3,panel4,panelEmail,panelem,panel5,
            panel6,panel7,panel8,panel9,panel10,panelmenu,panel11,
            panel12,panelmenu1,panel13,panel14,panel15;
    
    private JMenu menu,menu1,menu2,menu3,menu4;
    public JMenuBar menuBar,menuBar1,menuBar2,menuBar3,menuBar4;
    private JMenuItem item1,item2,item3,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13;
    private JLabel Icon,icon1,text1,text2,text3,text4,text5,emailad,emailNText,textinsta,
            addreaainsta, tex1,tex2,tex3, tex4,tex5,tex6,tex7,tex8,tex9,tex10,tex11,tex12,tex13;
    private JLabel labelEmpty1,labelEmpty2,labelEmpty3,labelEmpty4,labelEmpty5,labelEmpty6,text,phones,phonen;
    private JTextField txtfirstName;
    private  JList list,y;
    private  JScrollPane scrollPane;
    JButton b1;
    JLabel l1;
    JTextField Search;
    DefaultListModel tableModel;
    private Font ft1, ft2, ft3, ft4;
    public ContactUs()
    {
        ImageIcon ico = new ImageIcon(new ImageIcon("video-tutorial.png").getImage().getScaledInstance(900, 700, Image.SCALE_AREA_AVERAGING));

        mainFrame = new JFrame();
        mainFrame.setPreferredSize(new Dimension(900, 700));
        panelNorth= new JPanel();
        panelCenter= new JPanel();
        panel= new JPanel();
        panel1= new JPanel();
        panel1.setBackground(new Color(245, 176, 65 ));
        panel2= new JPanel();
        panel2.setBackground(new Color(149, 151, 151 ));
        panel3= new JPanel();
        panel4= new JPanel();
        panel4.setBackground(new Color(52, 152, 219  ));
        panel5= new JPanel();
        panel6= new JPanel();
        panel7= new JPanel();
        panel8= new JPanel();
        panel9= new JPanel();
        panel10= new JPanel();
        panel11= new JPanel();
        panel12= new JPanel();
        panel13= new JPanel();
        panel14= new JPanel();
        panel15= new JPanel();
        panel14.setBackground(new Color(52, 152, 219  ));
        panel15.setBackground(new Color(52, 152, 219  ));
        panelmenu1= new JPanel();
        panel12.setBackground(new Color(52, 152, 219  ));
        panel13.setBackground(new Color(52, 152, 219  ));
        panelmenu1.setBackground(new Color(52, 152, 219  ));
        panel11.setBackground(new Color(149, 151, 151));
        panelmenu= new JPanel();
        panelmenu.setBackground(new Color(149, 151, 151  ));
        panel9.setBackground(new Color(149, 151, 151 ));
        panel10.setBackground(new Color(149, 151, 151 ));
        panel8.setBackground(new Color(149, 151, 151 ));
        panel7.setBackground(new Color(245, 176, 65 ));
        panel6.setBackground(new Color(245, 176, 65 ));
        panel5.setBackground(new Color(245, 176, 65 ));
        panelEmail= new JPanel();
        panelem= new JPanel();
        panelEmail.setBackground(new Color(245, 176, 65 ));
        panelem.setBackground(new Color(245, 176, 65 ));
        //panelEmail.setBackground(new Color(46, 134, 193  ));
        panelCenter.setBackground(new Color(97, 179, 131));
        
        panelEmpty= new JPanel();
        panelEmpty2= new JPanel();
        panelEmpty2.setBackground(new Color(97, 179, 131));
        panelEmpty.setBackground(new Color(97, 179, 131));
        txtfirstName=new JTextField(20);
        panelNorth.setBackground(Color.black);
        panelNorth.setBorder(new EmptyBorder(10,20,20,20));
        list = new  JList (); 
        list.setVisible(false);
        y = new  JList ();
        
        tableModel= new DefaultListModel();
        LineBorder lineBorder =new LineBorder(Color.white, 8, true);
        txtfirstName.setBorder(lineBorder );
        txtfirstName.setHorizontalAlignment(JTextField.CENTER);
        ImageIcon icon = new ImageIcon(new ImageIcon("video-tutorial.png").getImage().getScaledInstance(50, 55, Image.SCALE_AREA_AVERAGING));
        ImageIcon icons = new ImageIcon(new ImageIcon("loupe.png").getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING));
        ImageIcon icos = new ImageIcon(new ImageIcon("back.jpg").getImage().getScaledInstance(900, 300, Image.SCALE_AREA_AVERAGING));
        ImageIcon email = new ImageIcon(new ImageIcon("gmail.png").getImage().getScaledInstance(30, 20, Image.SCALE_AREA_AVERAGING));
        ImageIcon phone = new ImageIcon(new ImageIcon("telephone.png").getImage().getScaledInstance(30, 20, Image.SCALE_AREA_AVERAGING));
        ImageIcon insta = new ImageIcon(new ImageIcon("instagram.png").getImage().getScaledInstance(30, 20, Image.SCALE_AREA_AVERAGING));
        
        tex1= new JLabel();
        tex2= new JLabel();
        tex3= new JLabel();
        
        tex4= new JLabel("tutorialcput@mycput.ac.za");
        tex5= new JLabel("+27 680479987");
        tex6= new JLabel("@cput");
        
        tex7= new JLabel();
        tex8= new JLabel();
        tex9= new JLabel();
        
        tex10= new JLabel("cputtutorial@mycput.ac.za");
        tex11= new JLabel("+27 680479987");
        tex12= new JLabel("@cput");
        ImageIcon email1 = new ImageIcon(new ImageIcon("gmail.png").getImage().getScaledInstance(30, 20, Image.SCALE_AREA_AVERAGING));
        ImageIcon phone1 = new ImageIcon(new ImageIcon("telephone.png").getImage().getScaledInstance(30, 20, Image.SCALE_AREA_AVERAGING));
        ImageIcon insta1 = new ImageIcon(new ImageIcon("instagram.png").getImage().getScaledInstance(30, 20, Image.SCALE_AREA_AVERAGING));
        
        ImageIcon email7 = new ImageIcon(new ImageIcon("gmail.png").getImage().getScaledInstance(30, 20, Image.SCALE_AREA_AVERAGING));
        ImageIcon phone8= new ImageIcon(new ImageIcon("telephone.png").getImage().getScaledInstance(30, 20, Image.SCALE_AREA_AVERAGING));
        ImageIcon insta9= new ImageIcon(new ImageIcon("instagram.png").getImage().getScaledInstance(30, 20, Image.SCALE_AREA_AVERAGING));
       
        tex7.setIcon(email7);
        tex8.setIcon(phone8);
        tex9.setIcon(insta9);
        
        tex1.setIcon(email1);
        tex2.setIcon(phone1);
        tex3.setIcon(insta1);
        
        
        emailad= new JLabel();
        textinsta= new JLabel();
        addreaainsta= new JLabel("@cput");
        textinsta.setIcon(insta);
        phones= new JLabel();
        phonen= new JLabel("+27 81478312");
        emailNText= new JLabel("cput@mycput.ac.za");
        emailad.setIcon(email);
        phones.setIcon(phone);
        panel7.add(textinsta);
        panel7.add(addreaainsta);
        panel8.add(tex1);
        panel8.add(tex4);
        panel9.add(tex2);
        panel9.add(tex5);
        panel10.add(tex3);
        panel10.add(tex6);
        
        panel12.add(tex7);
        panel12.add(tex10);
        
        panel13.add(tex8);
        panel13.add(tex11);
        
        panel14.add(tex9);
        panel14.add(tex12);
        panelmenu1.add(panel12);
        panelmenu1.add(panel13);
        panelmenu1.add(panel14);
        panelmenu.add(panel8);
        panelmenu.add(panel9);
        panelmenu.add(panel9);
        panelmenu.add(panel10);
        panel5.add(emailad);
        panel5.add(emailNText);
        panel6.add(phones);
        panel6.add(phonen);
        panelEmail.add(panel5);
        panelEmail.add(panel6);
        panelEmail.add(panel7);
        b1= new JButton();
        b1.setBounds(20,50, 50,20);
        b1.setHorizontalAlignment(JLabel.RIGHT);
        b1.setIcon(icons);
        ft1 = new Font("Arial", Font.BOLD, 42);
        ft2 = new Font("Arial", Font.PLAIN, 22);
        ft3 = new Font("Arial", Font.PLAIN, 24);
        ft4 = new Font("Arial", Font.PLAIN, 30);
        text1= new JLabel(" BellVille");
        panelem.add(text1);
        panel1.add(panelem);
        panel1.add(panelEmail);
        text2= new JLabel("Cape town");
        panel11.add(text2);
        panel2.add(panel11);
        panel2.add(panelmenu);
        text3= new JLabel("Mowbray");
        panel15.add(text3);
        panel4.add(panel15);
        panel4.add(panelmenu1);
        text4=new JLabel(" to know with the experts that can teach them. And we’ve changed the way people think about education in the process.");
        scrollPane = new JScrollPane();
        scrollPane.setVisible(false);
        scrollPane.setViewportView(list);
        Search= new JTextField();
        Search.setBounds(100,150, 200,80);
        Search.setHorizontalAlignment(JLabel.CENTER);
        Icon= new JLabel();
        icon1= new JLabel();
        l1= new JLabel();
        l1.setIcon(ico);
        icon1.setIcon(icos);
        panel.add(icon1);
        labelEmpty1=new JLabel();
        labelEmpty2=new JLabel();
        labelEmpty3=new JLabel();
        labelEmpty4=new JLabel();
        labelEmpty5=new JLabel();
        labelEmpty6=new JLabel();
        text1.setFont(ft4);
        text2.setFont(ft4);
        text3.setFont(ft4);
        text4.setFont(ft4);
        
        text=new JLabel("Learning That Works");
        
        
        text.setFont(ft1);
        text.setForeground(new Color(243, 156, 18));
        Icon.setIcon(icon);
        
        menuBar = new JMenuBar();
        menuBar.setForeground(Color.BLUE);
        menuBar1 = new JMenuBar();
        menuBar1.setForeground(Color.BLUE);
        menuBar2 = new JMenuBar();
        menuBar2.setForeground(Color.BLUE);
        menuBar3 = new JMenuBar();
        menuBar3.setForeground(Color.BLUE);
        menuBar4 = new JMenuBar();
        menuBar4.setForeground(Color.BLUE);
        menu = new JMenu("Find A Tutor");
        menu.setBackground(Color.black);
        menu1 = new JMenu("About Us ");
        menu2 = new JMenu("Resources ");
        menu3 = new JMenu("Start Tutoring  ");
        menu4 = new JMenu("LogOut  ");
        item1= new JMenuItem("How It Works Student");
        item2= new JMenuItem("Request A Tutor");
        item3= new JMenuItem("Online Tutoring");
        item4= new JMenuItem("About Us");
        item5= new JMenuItem("Contact Us");
        item6= new JMenuItem("What Customers Say");
        item7= new JMenuItem("Search Questions");
        item8= new JMenuItem("Ask a Question");
        item9= new JMenuItem("Lessons");
        item10= new JMenuItem("Apply Now");
        item11= new JMenuItem("About Tutors Jobs");
        item12= new JMenuItem("Find Tutoring Jobs");
        menu.add(item1);
        menu.add(new JSeparator()); //Resources
        menu.add(item2);
        menu.add(new JSeparator()); //Start Tutoring
        menu.add(item3);

        menu1.add(item4);
        menu1.add(new JSeparator());
        menu1.add(item5);


        menu2.add(item7);
        menu2.add(new JSeparator());
        menu2.add(item8);
        menu2.add(new JSeparator());
        menu2.add(item9);

        menu3.add(item10);
        menu3.add(new JSeparator());
        menu3.add(item11);
        menu3.add(new JSeparator());
        menu3.add(item12);

        // panelCenter.add(panelEmpty);
        
        
        menuBar.add(menu);
        menuBar1.add(menu1);
        menuBar2.add(menu2);
        menuBar3.add(menu3);
        menuBar4.add(menu4);
         txtfirstName.addActionListener(this);
        item4.addActionListener(this);
        item5.addActionListener(this);
        item8.addActionListener(this);
        item1.addActionListener(this);
        list.addListSelectionListener((ListSelectionEvent e) -> {
           txtfirstName.setText((String) list.getSelectedValue());
           // panelEmpty2.setVisible(true);
        });
       
    }
    private  ArrayList getStars()
    {
        ArrayList star=new  ArrayList();
        star.add("python");
        star.add("Mechanics");
        star.add("Mechanical Engineering Drawing");
        star.add("Computer And Programming Skills");
        star.add("Business Computer Applications");
        star.add("Project Management");
        star.add(" Economics");
        star.add("Financial Management");
        star.add("Business Practice");
        star.add("Applications Development Practice");
        star.add("Information Systems");
        star.add("Professional Communications ");
        star.add(" Multimedia ");
        star.add("Multimedia Technology");
        star.add("History And Theory Of Design");
        star.add("Visualisation");
        star.add("Design Specialisation");
        star.add("Business Skills For Design");
        return star;
        
    }
    
    private void bindata(){
    getStars().stream()
            .forEach((star)->{
                tableModel.addElement(star);
    });
         list.setModel(tableModel);
         list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         
    }
    private void Search (String searchn)
    {
        DefaultListModel filterItems= new DefaultListModel();
        ArrayList stars=getStars();
        stars.stream().forEach((star)->{
        
            String starName=star.toString().toLowerCase();
            if(starName.contains(searchn.toLowerCase()))
            {
            filterItems.addElement(star);
            }
        });
       tableModel=filterItems;
       list.setModel(tableModel);
    }
    public void setGUII()
    {  
        mainFrame.add(panelNorth, BorderLayout.NORTH);
        mainFrame.add(panelCenter, BorderLayout.CENTER);
        panelNorth.setLayout(new GridLayout(1,6));
        panelCenter.setLayout(new GridLayout(2,1));
        panelEmpty.setLayout(new FlowLayout());
        panel3.setLayout(new GridLayout(1,3));
        panel1.setLayout(new GridLayout(2,1));
        panel2.setLayout(new GridLayout(2,1));
        panel4.setLayout(new GridLayout(2,1));
        //panelEmail.setLayout(new GridLayout(2,1));
        scrollPane = new JScrollPane();
        scrollPane.setViewportView(list);
        list.setLayoutOrientation(JList.VERTICAL);
        panelNorth.add(Icon);
        panelNorth.add(menuBar);
        panelNorth.add(menuBar1);
        panelNorth.add(menuBar2);
        panelNorth.add(menuBar3);
        panelNorth.add(menuBar4);
        panelEmpty.add(labelEmpty3);
        panelEmpty.add(txtfirstName);
        panelEmpty.add(b1);
        
        panelEmpty2.add(labelEmpty1);
        panelEmpty2.add(scrollPane);
        panelEmpty2.add(labelEmpty2);
        panelEmpty2.setVerifyInputWhenFocusTarget(false);
        panel3.add(panel1);
        panel3.add(panel2);
        panel3.add(panel4);
        panelCenter.add(panel);
        panelCenter.add(panel3);
        
        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);

            }
        });

        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);

    }

 public void actionPerformed(ActionEvent e) {
 
    if (e.getSource() == txtfirstName) 
        {
            scrollPane.setVisible(true);
            list.setVisible(true);
            Search (txtfirstName.getText());
            
        }
    if (e.getSource() == item4) 
        {
           mainFrame.setVisible(false); 
               new AboutUS().setGUII();
        }
      if (e.getSource() == item5) 
        {
           mainFrame.setVisible(false); 
               new ContactUs().setGUII();
        }
       if (e.getSource() == item1) 
        {
               mainFrame.setVisible(false); 
               new ForStudent().setGUII();
               
        } 
         if (e.getSource() == item8) 
        {
               mainFrame.setVisible(false); 
              new AskQuestion ().SendEmail();
              
        } 
    }
 public static void main(String[] args) {
     new ContactUs ().setGUII();
    }
 
}
