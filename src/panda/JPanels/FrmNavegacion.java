/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panda.JPanels;

/**
 *
 * @author Paperkoops
 */
public class FrmNavegacion extends javax.swing.JPanel {

    /**
     * Creates new form FrmNavegacion
     */
    public FrmNavegacion() {
        initComponents();
        jLabel2.setVisible(false);

    }

    public void EsconderPaneles(){
        frmAdministracion1.setVisible(false);
        frmMiCuenta1.setVisible(false);
    }
    public void CambiarPanel(int papa){
        
        EsconderPaneles();
        
        switch(papa){
            case 1:
                frmAdministracion1.setVisible(true);
                break;
                
            case 2:
                frmMiCuenta1.setVisible(true);
                
        }
    }
    
    public void PanelAMostrar(int papa){
        EsconderPaneles();
        switch(papa){
            case 4:
                frmAdministracion1.setVisible(true);
                break;
                
            
                
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

        jLabel2 = new javax.swing.JLabel();
        sideNav1 = new panda.JPanels.SideNav();
        frmMiCuenta1 = new panda.JPanels.FrmMiCuenta();
        frmAdministracion1 = new panda.JPanels.FrmAdministracion();

        setPreferredSize(new java.awt.Dimension(1000, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/panda/Imagenes/MenuPrincipal/trans2.gif"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));
        add(sideNav1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        add(frmMiCuenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));
        add(frmAdministracion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private panda.JPanels.FrmAdministracion frmAdministracion1;
    private panda.JPanels.FrmMiCuenta frmMiCuenta1;
    private javax.swing.JLabel jLabel2;
    private panda.JPanels.SideNav sideNav1;
    // End of variables declaration//GEN-END:variables
}
