/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panda.JFrames;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;
import javax.swing.Timer;

/**
 *
 * @author Paperkoops
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();        
        frmMenuPrincipal2.setVisible(true);

        
        try {
            Image i = ImageIO.read(getClass().getResource("/panda/Imagenes/icon.png"));
setIconImage(i);
        } catch (Exception e) {
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmMenuPrincipal2 = new panda.JPanels.FrmMenuPrincipal();
        frmMenuAdministracion1 = new panda.JPanels.FrmMenuAdministracion();
        frmNavegacion1 = new panda.JPanels.FrmNavegacion();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Project: Panda");
        setPreferredSize(new java.awt.Dimension(1018, 647));
        getContentPane().setLayout(new java.awt.CardLayout());
        getContentPane().add(frmMenuPrincipal2, "card2");
        getContentPane().add(frmMenuAdministracion1, "card3");
        getContentPane().add(frmNavegacion1, "card4");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    public void EsconderPaneles(){
    frmMenuAdministracion1.setVisible(false);
    frmMenuPrincipal2.setVisible(false);
    frmNavegacion1.setVisible(false);
    
    }
    public void CambiarPanel(int papa){
        EsconderPaneles();
        
        switch(papa){
            case 1:
                    frmMenuAdministracion1.setVisible(true);
                    break;
            case 2:
                frmNavegacion1.PanelAMostrar(4);
                frmNavegacion1.setVisible(true);
                break;

        }
        
        
        
        /*
        
    frmMenuAdministracion1.setVisible(true);
    frmMenuPrincipal2.setVisible(false);
    */
    }
    
    
    public void CambiarPanelEnNavegacion(int papa){
        switch (papa){
            case 1:
                        frmNavegacion1.CambiarPanel(1);
                        break;
            case 2:
                frmNavegacion1.CambiarPanel(2);
                break;

        }
        
    }
    
    public void CambiarPanelDeArea(int papa){
        EsconderPaneles();
        switch(papa){
            case 4:
                    frmMenuAdministracion1.setVisible(true);
                    break;
            

        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private panda.JPanels.FrmMenuAdministracion frmMenuAdministracion1;
    private panda.JPanels.FrmMenuPrincipal frmMenuPrincipal2;
    private panda.JPanels.FrmNavegacion frmNavegacion1;
    // End of variables declaration//GEN-END:variables
}
