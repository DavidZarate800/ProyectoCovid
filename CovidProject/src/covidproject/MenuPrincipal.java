/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidproject;

/**
 *
 * @author David
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author francisco
 */
public class MenuPrincipal {
    private JFrame frame;
    private JPanel panel;
    private  JLabel label;
    private JButton b1, b2;
    
    MenuPrincipal(){
        frame = new JFrame("Cliente Windows");
        frame.setSize(650, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.CYAN);
        frame.add(panel);
        
        label = new JLabel("Alerta Covid-19");
        Font font = new Font("Agency FB", Font.BOLD, 48);
        label.setFont(font);
        panel.add(label);
        label.setBounds(205, 25, 550, 350);
        
        b1 = new JButton("Usuario");
        b1.setBounds(175, 300, 95, 50);
        b2 = new JButton("Lugar");
        b2.setBounds(400, 300, 95, 50);
        panel.add(b1);
        panel.add(b2);
        
        frame.setVisible(true);
        
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Cliente cli = new Cliente();
                frame.setVisible(false);
            }
        });
        
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Lugar l = new Lugar();
                //frame.setVisible(false);
            }
        });
    }
}
