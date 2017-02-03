/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divyesh;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.*;

/**
 *
 * @author Rahul Yadav
 */
public class das2 {

//    static String Str1= JOptionPane.showInputDialog("Enter the Name");
    static JTextField field;
    static JTextArea area;
    static PrintWriter write;

    public static void main(String[] args) throws IOException {
        
//int i=Integer.parseInt(JOptionPane.showInputDialog("Enter the User"));
        for(int j=0;j<5;j++){
            
           Socket soc = new Socket("127.0.0.1", 9081);
            String Str1 = JOptionPane.showInputDialog("Enter the Name");
            JFrame frame = new JFrame(Str1);
            JTextArea area = new JTextArea();
            JTextField field = new JTextField(10);
            JButton button = new JButton("Send");
            frame.add(area);
            JPanel panel = new JPanel();
            panel.add(field);
            panel.add(button);
            frame.add(panel, BorderLayout.SOUTH);
            frame.setSize(400, 400);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             BufferedReader read = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            PrintWriter write = new PrintWriter(new BufferedWriter(new OutputStreamWriter(soc.getOutputStream())), true);
//            L1 l1 = new L1(field, area, write);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                     String str = field.getText();
            write.println(str);
            field.setText("");

            if (str.equalsIgnoreCase("end")) {
                System.exit(0);
            }

                }
            });
            String str2 = read.readLine();
            while (!str2.equals("End")) {

                area.append(Str1 + ":" + str2 + "\n");
                System.out.println(Str1 + ":" + str2);
                str2 = read.readLine();
            }
        }

    }

    static class L1 implements ActionListener {

        JTextField field;
        JTextArea area;
        PrintWriter write;

        public L1(JTextField field, JTextArea area, PrintWriter write) {
            this.field = field;
            this.area = area;
            this.write = write;
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
           
        }
    }

}
