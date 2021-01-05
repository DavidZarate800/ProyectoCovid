/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidproject;

import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Notificacion {
    
    public Notificacion(String title, String msg) {
        send(title, msg);
    }
    
    public void send(String title, String msg) {
        JOptionPane.showMessageDialog(null, msg, title, 0);
    }
    
}
