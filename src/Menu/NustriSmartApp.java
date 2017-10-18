/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Vista.VistaLogin;
import java.awt.Dimension;

/**
 *
 * @author danielardila
 */
public class NustriSmartApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       VistaLogin frm = new VistaLogin();
       frm.setLocationRelativeTo(null);
       //frm.setExtendedState(JFrame.MAXIMIZED_BOTH);   
       frm.setVisible(true);
    }
    
}
