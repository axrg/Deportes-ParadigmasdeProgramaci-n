/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sisdeportes;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author XCARET
 */
public class SisColegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //modelo
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            Ingreso f = new Ingreso();
            //que aparezca maximizado
            f.setLocationRelativeTo(null);
            f.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
}
