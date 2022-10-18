package za.ac.cput.project3;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;


public class Content extends Frame implements ActionListener {
    private JFrame mainFrame;
    private JPanel panelNorth,panelCenter,panelSouth,panelWest,panelEmpty,panelEmpty2;
    private JMenu menu,menu1,menu2,menu3,menu4;
    public JMenuBar menuBar,menuBar1,menuBar2,menuBar3,menuBar4;
    private JMenuItem item1,item2,item3,item4,item5,item6,item7,item8,item9,item10,item11,item12,item13;
    private JLabel Icon;
    public JLabel num;
    private JLabel labelEmpty1,labelEmpty2,labelEmpty3,labelEmpty4,labelEmpty5,labelEmpty6;
    private JTextField txtfirstName;
    private  JList list,y;
    private  JScrollPane scrollPane;
    JButton b1;
    JLabel l1;
    JTextField Search;
    DefaultListModel tableModel;
    public Content()
    {
        ImageIcon ico = new ImageIcon(new ImageIcon("video-tutorial.png").getImage().getScaledInstance(900, 700, Image.SCALE_AREA_AVERAGING));

        mainFrame = new JFrame();
        mainFrame.setPreferredSize(new Dimension(900, 1000));
        panelNorth= new JPanel();
        panelCenter= new JPanel();
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
        ImageIcon icons = new ImageIcon(new ImageIcon("icons8-search-bar-24.png").getImage().getScaledInstance(20, 20, Image.SCALE_AREA_AVERAGING));
        
        b1= new JButton();
        b1.setBounds(20,50, 50,20);
        b1.setHorizontalAlignment(JLabel.RIGHT);
        b1.setIcon(icons);
        
        scrollPane = new JScrollPane();
        scrollPane.setVisible(false);
        scrollPane.setViewportView(list);
        
        Search= new JTextField();
        Search.setBounds(100,150, 200,80);
        Search.setHorizontalAlignment(JLabel.CENTER);
        Icon= new JLabel();
        l1= new JLabel();
        l1.setIcon(ico);
        
        labelEmpty1=new JLabel();
        labelEmpty2=new JLabel();
        labelEmpty3=new JLabel();
        
        labelEmpty4=new JLabel();
        labelEmpty5=new JLabel();
        labelEmpty6=new JLabel();
        
        num=new JLabel();
        
       
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
        b1.addActionListener(this);
        item11.addActionListener(this);
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
        panelCenter.setLayout(new GridLayout(4,1));
        panelEmpty.setLayout(new FlowLayout());

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
        panelCenter.add(panelEmpty);
        panelCenter.add(panelEmpty2);
        
        
        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               mainFrame.setVisible(false); 
//              new AskQuestion ().SendEmail();

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
    if (e.getSource() == b1) 
        {
           mainFrame.setVisible(false); 
              Prompt s= new  Prompt();
              s.number.setText(num.getText());
              s.course.setText(txtfirstName.getText());
              s.show();
              
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
       if (e.getSource() == item11) 
        {
         
        } 
    }

    public static void main(String[] args)
    {
        new Content().setGUII();
    }
}
class RoundBorder extends AbstractBorder
{
public void paintBorder(Component c, Graphics g,
int x, int y,
int width, int height) {
Color oldColor = g.getColor();

g.setColor(Color.black);
g.drawRoundRect(x, y, width - 1, height - 1,
20, 20);

g.setColor(oldColor);
}

public Insets getBorderInsets(Component c) {
return new Insets(4, 4, 4, 4);
}

public Insets getBorderInsets(Component c, Insets insets) {
insets.left = insets.top = insets.right = insets.bottom = 4;
return insets;
}
}
