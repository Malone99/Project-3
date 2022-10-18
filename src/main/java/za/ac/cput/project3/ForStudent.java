
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
public class ForStudent extends JFrame implements ActionListener {
   private JFrame mainFrame;
    private JPanel panelNorth,panelCenter,panelSouth,panelWest,panelEmpty,
            panelEmpty2,panel,panel1,panel2,panel3,panelSouthWest,panelSouthEast,panelsouD,panelw,panelOustN,panelOustD;
    private JMenu menu,menu1,menu2,menu3,menu4;
    public JMenuBar menuBar,menuBar1,menuBar2,menuBar3,menuBar4;
    private JMenuItem item1,item2,item3,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13;
    private JLabel Icon,icon1,text1,text2,text3,text4,text5,name,nametext,nametext1,nametext2,nametext3
            ,nameEmpty,nameEmpty1,nameEmpty2,nameEmpty3,nameEmpty4,nameEmpty5, textName1,textName2,textName3,textName4
            ,textName5,textName6,textName7,textName8;
    private JLabel labelEmpty1,labelEmpty2,labelEmpty3,labelEmpty4,labelEmpty5,labelEmpty6,text;
    private JTextField txtfirstName;
    private  JList list,y;
    private  JScrollPane scrollPane;
    JButton b1;
    JLabel l1;
    JTextField Search;
    DefaultListModel tableModel;
    private Font ft1, ft2, ft3, ft4;
     Thread th;
    public ForStudent()
    {
        ImageIcon ico = new ImageIcon(new ImageIcon("video-tutorial.png").getImage().getScaledInstance(900, 700, Image.SCALE_AREA_AVERAGING));

        mainFrame = new JFrame();
        mainFrame.setPreferredSize(new Dimension(900, 1000));
        
        panelNorth= new JPanel();
        panelCenter= new JPanel();
        panelSouth= new JPanel();
        panelsouD= new JPanel();
        panelw= new JPanel();
        panelSouthWest= new JPanel();
        panelSouthEast= new JPanel();
        panel= new JPanel();
        panel1= new JPanel();
        panel2= new JPanel();
        panel3= new JPanel();
        
        panelOustN= new JPanel();
        panelOustD= new JPanel();
        
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
        ImageIcon icos = new ImageIcon(new ImageIcon("chimi.jpeg").getImage().getScaledInstance(900, 300, Image.SCALE_AREA_AVERAGING));
        
        
        
        ImageIcon icon2 = new ImageIcon(new ImageIcon("lecturerr.jpg").getImage().getScaledInstance(300, 200, Image.SCALE_AREA_AVERAGING));
        
        b1= new JButton();
        b1.setBounds(20,50, 50,20);
        b1.setHorizontalAlignment(JLabel.RIGHT);
        b1.setIcon(icons);
        ft1 = new Font("Arial", Font.BOLD, 32);
        ft2 = new Font("Arial", Font.BOLD, 22);
        ft3 = new Font("Arial", Font.PLAIN, 24);
        ft4 = new Font("Arial", Font.PLAIN, 16);
        text1= new JLabel("CPUT is the best way to learn anything. No matter what you’re interested in");
        text2= new JLabel("we’ll help you find, book lessons and stay in touch with the perfect instructor.");
        text3= new JLabel("You can spend more time learning, and we’ll handle the rest. Here’s how it works:");
        text4=new JLabel(" to know with the experts that can teach them. And we’ve changed the way people think about education in the process.");
        scrollPane = new JScrollPane();
        scrollPane.setVisible(false);
        scrollPane.setViewportView(list);
        panel2.add(text1);
        panel2.add(text2);
        panel2.add(text3);
        //panel2.add(text4);
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
        
        textName1=new JLabel("Pick Your Instructor");
        textName1.setForeground(new Color( 245, 176, 65 ));
        textName2=new JLabel("Use CPUT's tutor search tools to find ");
        textName3=new JLabel("the tutors that best meet your unique");
        textName4=new JLabel("needs. We’ve vetted eachof your options and");
        textName5=new JLabel("only show you the best instructors for your search.");
        textName6=new JLabel("From there, check their credentials,");
        textName7=new JLabel(" read what other students are saying about them ");
        textName8=new JLabel("see if they’ve had a background check or request one");
        nameEmpty=new JLabel("Description");
        nameEmpty1=new JLabel("While It's not my full time job");
        nameEmpty2=new JLabel();
        nameEmpty3=new JLabel("");
        nameEmpty4=new JLabel();
        nameEmpty5=new JLabel();
        text1.setFont(ft4);
        text2.setFont(ft4);
        text3.setFont(ft4);
        text4.setFont(ft4);
        nameEmpty.setFont(ft2);
        textName1.setFont(ft2);
        text=new JLabel("Three Steps. One Perfect Instructor.");
        text.setHorizontalAlignment(JLabel.CENTER);
        
        text.setFont(ft1);
        text.setForeground(new Color(243, 156, 18));
        Icon.setIcon(icons);
        panel1.add(text);
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
         nametext= new JLabel("I spent three years in college");
         nametext1= new JLabel("working as a TA for a few");
         nametext2= new JLabel("Chemistry professors.");
         nametext3= new JLabel("I love tutoring people");
        name = new JLabel();
        name.setIcon(icon2);
        th= new Thread(rr);
        th.start();
        panelw.add(nameEmpty);
        panelw.add(nametext);
        panelw.add(nametext1);
        panelw.add(nametext2);
        panelw.add(nameEmpty1);
        panelw.add(nametext2);
        panelw.add(nameEmpty3);
        panelw.add(nameEmpty4);
        panelw.add(nameEmpty5);
        panelSouthWest.add(name);
        panelSouthWest.add(panelw);
        panelOustN.add(textName1);
        panelOustD.add(textName2);
        panelOustD.add(textName3);
        panelOustD.add(textName4);
        panelOustD.add(textName5);
        panelOustD.add(textName6);
        panelOustD.add(textName7);
        panelOustD.add(textName8);
        panelSouthEast.add(panelOustN);
        panelSouthEast.add(panelOustD);
        panelsouD.add(panelSouthWest);
        panelsouD.add(panelSouthEast);
        menuBar.add(menu);
        menuBar1.add(menu1);
        menuBar2.add(menu2);
        menuBar3.add(menu3);
        menuBar4.add(menu4);
         txtfirstName.addActionListener(this);
        item4.addActionListener(this);
        item5.addActionListener(this);
        item1.addActionListener(this);
        item8.addActionListener(this);
         list.addListSelectionListener((ListSelectionEvent e) -> {
           txtfirstName.setText((String) list.getSelectedValue());
           // panelEmpty2.setVisible(true);
        });
       
    }
     Runnable rr=()->{
       try{
           while(true){
           ImageIcon icon5 = new ImageIcon(new ImageIcon("lecture3.jpg").getImage().getScaledInstance(300, 200, Image.SCALE_AREA_AVERAGING));
               th.sleep(3000);
                name.setIcon(icon5);
                nametext.setText(" Full time lab researcher who loves");
                nametext1.setText(" to tutor students of all ages.");
                nametext2.setText("Qualified to tutor many levels of");
                nameEmpty1.setText("  Maths including Math 1 and 2");
                nametext2.setText(" I love seeing others experience");
                nameEmpty3.setText(" the joy of understanding Maths");
                nameEmpty4.setText("");
               ImageIcon icon3= new ImageIcon(new ImageIcon("lecture2.jpg").getImage().getScaledInstance(300, 200, Image.SCALE_AREA_AVERAGING));
               th.sleep(3000);
               name.setIcon(icon3);
                nametext.setText("I am a creative professional and");
                nametext1.setText("I specialize in digital design.");
                nametext2.setText("My process begins with concept");
                nameEmpty1.setText("the problem and provides a unique");
                nametext2.setText("approach to solving it.The “aspire”");
                nameEmpty3.setText("about creating purpose, setting goals,");
                nameEmpty4.setText("and finding what fuels you from the inside.");
                nameEmpty5.setText("This thought allows me to tackle ");
                ImageIcon icon4= new ImageIcon(new ImageIcon("stefan-stefancik.jpg").getImage().getScaledInstance(300, 200, Image.SCALE_AREA_AVERAGING));
               th.sleep(3000);
               name.setIcon(icon4);
                nametext.setText("Walt Ritscher is a programmer,UI designer");
                nametext1.setText("and staff author at LinkedIn Learning.");
                nametext2.setText("Walt's enthusiasm for crafting software interfaces");
                nameEmpty1.setText("started early. Shortly after discovering");
                nametext2.setText("how to move pixels around on a computer ”");
                nameEmpty3.setText("screen, he began devouring books on computer");
                nameEmpty4.setText("graphics and UI design. Before long, he was sharing");
                nameEmpty5.setText("his discoveries with other technology buffs, a lifelong pursuit");
                
                
                
           }
           
           
       }catch(Exception x){
       
       
       }
   };
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
        panelCenter.setLayout(new GridLayout(3,1));
        panelsouD.setLayout(new GridLayout(1,2));
        panelEmpty.setLayout(new FlowLayout());
        panel3.setLayout(new GridLayout(2,1));
        scrollPane = new JScrollPane();
        scrollPane.setViewportView(list);
        list.setLayoutOrientation(JList.VERTICAL);
        panelSouth.setLayout(new FlowLayout());
        panelSouthWest.setLayout(new GridLayout(1,2));
        panelOustD.setLayout(new GridLayout(8,1));
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
        panel3.add(text);
        panel3.add(panel2);
        panelCenter.add(panel);
        panelCenter.add(panel3);
        panelCenter.add(panelsouD);
        
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
       if (e.getSource() == item8) 
        {
               mainFrame.setVisible(false); 
               new AskQuestion ().SendEmail();
               
        } 
    }
 
 public static void main(String[] args)
    {
        new ForStudent().setGUII();
    }
}

