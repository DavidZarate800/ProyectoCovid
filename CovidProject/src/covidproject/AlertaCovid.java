/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidproject;


import static java.lang.System.out;
import me.rmaafs.mysql.SelectBD;

/**
 *
 * @author David
 */
public class AlertaCovid {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MenuPrincipal obj = new MenuPrincipal();
        out.println("p");
        SelectBD o = new SelectBD("select * from Usuario;");
        out.println("p1");
        String error = o.execute();
        //if(o.size() > 0){
          //  out.println("ok");
            
         //}
         out.println(o.getRegistros());
         out.println("1");
        //new Opciones();
//        new Notificacion("Alerta", "Usted está contagiado");
    }
    
}
