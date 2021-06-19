/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package favoritebooks;

import javax.swing.JOptionPane;

/**
 *
 * @author yarkingazibaba
 */
public class ShowBox {
    
    /**
     *
     * @param infoMessage
     * @param titleBar
     */
    public  void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
}
