package proyectocovidwin;

import javax.swing.JOptionPane;

public class Notificacion {
    
    public Notificacion(String title, String msg) {
        send(title, msg);
    }
    
    public void send(String title, String msg) {
        JOptionPane.showMessageDialog(null, msg, title, 0);
    }
    
}
