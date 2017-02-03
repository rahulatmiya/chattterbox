/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divyesh;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;

/**
 *
 * @author Rahul Yadav
 */
public class das {

    /**
     * @param args the command line arguments
     */
    static JButton button;
    static JTextField field;
    static JRadioButton rbutton;
    static JTextArea area;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Client");
        JTextArea area = new JTextArea(100, 100);
        JButton button = new JButton("Click");
        JTextField field = new JTextField(10);
        JRadioButton rbutton = new JRadioButton("male");
        JRadioButton rbutton1 = new JRadioButton("female");
        JPanel panel = new JPanel();
        frame.add(area, BorderLayout.WEST);
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        panel2.add(field);
        panel.add(panel2,BorderLayout.NORTH);
        panel.add(button, BorderLayout.CENTER);
        
        panel1.add(rbutton);
        panel1.add(rbutton1);
        
        panel.add(panel1);
        frame.add(panel, BorderLayout.NORTH);

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        clickevent l1 = new clickevent();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
            JButton Button = (JButton) ae.getSource();
            System.out.println("Button Is Pressed");
            area.setText("Button Is Pressed");
            
            }});

        field.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                System.out.println("key is typed");
                area.setText("key is typed");
                
            }

            @Override
            public void keyPressed(KeyEvent ke) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent ke) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        rbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JRadioButton rButton = (JRadioButton) ae.getSource();
                System.out.println("RadioButton A Is Presssed");
                area.setText("RadioButton A Is Presssed");
               
                
            }
        });
        rbutton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JRadioButton rButton1 = (JRadioButton) ae.getSource();
                System.out.println("RadioButton B is Pressed");
                area.setText("RadioButton B Is Presssed");
            }
        });
    }

//    static class clickevent implements KeyListener {

        
//
//        @Override
//        public void keyTyped(KeyEvent ke) {
//            JTextField field=(JTextField)ke.getSource();
//            System.out.println("Key is Typed");
//            area.setText("Key is Typed");
//            
//
//        }
//
//        @Override
//        public void keyPressed(KeyEvent ke) {
////            System.out.println("Key is Presssed");
//        }
//
//        @Override
//        public void keyReleased(KeyEvent ke) {
////            System.out.println("key is Released");
//        }
//
//    }
}
