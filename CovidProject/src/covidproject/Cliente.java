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
import static java.lang.System.out;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Cliente {
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton b1, b2;
    
    Cliente(){
        out.println("CLi");
        frame = new JFrame("Menu para usuarios");
        frame.setSize(750, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.CYAN);
        frame.add(panel);
        
        label = new JLabel("Menu para usuarios");
        Font font = new Font("Agency FB", Font.BOLD, 48);
        label.setFont(font);
        panel.add(label);
        label.setBounds(125, 25, 550, 350);
        
        b1 = new JButton("Iniciar sesión");
        b1.setBounds(175, 300, 195, 50);
        b2 = new JButton("Crear un usuario");
        b2.setBounds(400, 300, 195, 50);
        panel.add(b1);
        panel.add(b2);
        
        frame.setVisible(true);
        
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                IniciarCli iu = new IniciarCli();
                frame.setVisible(false);
            }
        });
        
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                AltaCliente au = new AltaCliente();
                //frame.setVisible(false);
            }
        });
    }
}
