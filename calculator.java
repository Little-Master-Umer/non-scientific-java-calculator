import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;


public class calculator extends JFrame {
    String a="";
    double result=0;

    public calculator(){
        setTitle("Non-Scientific Calculator.");
        setBackground(Color.blue);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(100, 100);
        setLayout(null);

        

        JPanel p1=new JPanel();
        p1.setBounds(30, 30, 320, 70);
        p1.setLayout(null);
        p1.setBackground(Color.white);
        add(p1);

        JLabel l1=new JLabel();
        l1.setBounds(30, 0, 320, 70);
        l1.setText(a);
        p1.add(l1);
        

         

        JButton b1=new  JButton("1");
        b1.setBounds(30, 150, 50, 30);
        add(b1);


        JButton b2=new  JButton("2");
        b2.setBounds(120, 150, 50, 30);
        add(b2);

        JButton b3=new  JButton("3");
        b3.setBounds(210, 150, 50, 30);
        add(b3);

        JButton b4=new  JButton("+");
        b4.setBounds(300, 150, 50, 30);
        add(b4);

        JButton b5=new  JButton("4");
        b5.setBounds(30, 200, 50, 30);
        add(b5);

        JButton b6=new  JButton("5");
        b6.setBounds(120, 200, 50, 30);
        add(b6);

        JButton b7=new  JButton("6");
        b7.setBounds(210, 200, 50, 30);
        add(b7);

        JButton b8=new  JButton("-");
        b8.setBounds(300, 200, 50, 30);
        add(b8);

        JButton b9=new  JButton("7");
        b9.setBounds(30,250, 50, 30);
        add(b9);

        JButton b10=new  JButton("8");
        b10.setBounds(120, 250, 50, 30);
        add(b10);

        JButton b11=new  JButton("9");
        b11.setBounds(210, 250, 50, 30);
        add(b11);

        JButton b12=new  JButton("*");
        b12.setBounds(300, 250, 50, 30);
        add(b12);

        JButton b13=new  JButton("0");
        b13.setBounds(30, 300, 50, 30);
        add(b13);

        JButton b14=new  JButton("=");
        b14.setBounds(120, 300, 50, 30);
        add(b14);

        JButton b15=new  JButton(".");
        b15.setBounds(210, 300, 50, 30);
        add(b15);

        JButton b16=new  JButton("/");
        b16.setBounds(300, 300, 50, 30);
        add(b16);

        JButton b17=new JButton("C");
        b17.setBounds(160, 115, 50, 30);
        add(b17);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 a = a + "1"; 
                l1.setText(a); 
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 a = a + "2"; 
                l1.setText(a); 
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 a = a + "3"; 
                l1.setText(a); 
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 a = a + "+"; 
                l1.setText(a); 
            }
        });
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 a = a + "4"; 
                l1.setText(a); 
            }
        });
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 a = a + "5"; 
                l1.setText(a); 
            }
        });
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 a = a + "6"; 
                l1.setText(a); 
            }
        });
         b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 a = a + "-"; 
                l1.setText(a); 
            }
        });
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 a = a + "7"; 
                l1.setText(a); 
            }
        });
        b10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 a = a + "8"; 
                l1.setText(a); 
            }
        });
        b11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 a = a + "9"; 
                l1.setText(a); 
            }
        });
        b12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 a = a + "*"; 
                l1.setText(a); 
            }
        });
        b13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 a = a + "0"; 
                l1.setText(a); 
            }
        });
        b14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                  
                if (a.contains("+")) {
                    String[] parts = a.split("\\+");  // Use double backslash for special regex characters
                    double a1 = Double.parseDouble(parts[0]);
                    double b = Double.parseDouble(parts[1]);
                     a = String.valueOf(a1 + b);
                     l1.setText(a);


                } else if (a.contains("-")) {
                    String[] parts = a.split("-");
                    double a1 = Double.parseDouble(parts[0]);
                    double b = Double.parseDouble(parts[1]);
                    a = String.valueOf(a1 - b);
                    l1.setText(a);

                } else if (a.contains("*")) {
                    String[] parts = a.split("\\*");  // Escape * in regex
                    double a1 = Double.parseDouble(parts[0]);
                    double b = Double.parseDouble(parts[1]);
                    a = String.valueOf(a1 * b);
                    l1.setText(a);

                } else if (a.contains("/")) {
                    String[] parts = a.split("/");
                    double a1 = Double.parseDouble(parts[0]);
                    double b = Double.parseDouble(parts[1]);
                    if (b != 0) {
                        a = String.valueOf(a1 / b);
                        l1.setText(a);
                    } else {
                        a="Error: Division by zero.";
                        l1.setText(a);
                        return;
                    }
                }         
            }
        });
        b15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 a = a + "."; 
                l1.setText(a); 
            }
        });
        b16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 a = a + "/"; 
                l1.setText(a); 
            }
        });
        b17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 a = ""; 
                l1.setText(a); 
            }
        });
        setVisible(true);
    }
    public static void main(String[] args) {
        new calculator();
    }
    
}

