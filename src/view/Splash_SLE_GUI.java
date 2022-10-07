
package view;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Splash_SLE_GUI extends javax.swing.JFrame {

    public Splash_SLE_GUI() {
        initComponents();
        
        new Thread(){
            public void run(){
                for(int i=0;i<101;i++){
                    try {
                        sleep(8);
                        LoadBar.setValue(i);
                        
                        if (LoadBar.getValue() == 50){
                            LoadTXT.setText("Carregando sistema");
                        }
                        
                        else if (LoadBar.getValue() == 80){
                            LoadTXT.setText("Sistema inicializado");
                        }
                        
                        else if (LoadBar.getValue() == 99){
                            LoadTXT.setText("Sistema inicializado");
                            
                            new Home_GUI().setVisible(true);
                            dispose();
                        }
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Splash_SLE_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
            }
            
        }.start();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FundoSplash = new javax.swing.JPanel();
        LogoImage = new org.edisoncor.gui.panel.PanelImage();
        LoadBar = new javax.swing.JProgressBar();
        LoadTXT = new javax.swing.JLabel();
        SLECopyright = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        FundoSplash.setLayout(null);

        LogoImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logo_Compressed.png"))); // NOI18N

        javax.swing.GroupLayout LogoImageLayout = new javax.swing.GroupLayout(LogoImage);
        LogoImage.setLayout(LogoImageLayout);
        LogoImageLayout.setHorizontalGroup(
            LogoImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        LogoImageLayout.setVerticalGroup(
            LogoImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        FundoSplash.add(LogoImage);
        LogoImage.setBounds(120, 20, 180, 110);
        FundoSplash.add(LoadBar);
        LoadBar.setBounds(30, 154, 360, 10);

        LoadTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoadTXT.setText("Iniciando Sistema");
        FundoSplash.add(LoadTXT);
        LoadTXT.setBounds(30, 140, 360, 14);

        SLECopyright.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SLECopyright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SLECopyright.setText("SLE (c)");
        FundoSplash.add(SLECopyright);
        SLECopyright.setBounds(354, 10, 50, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FundoSplash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FundoSplash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(410, 186));
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(Splash_SLE_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash_SLE_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash_SLE_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash_SLE_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash_SLE_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FundoSplash;
    private javax.swing.JProgressBar LoadBar;
    private javax.swing.JLabel LoadTXT;
    private org.edisoncor.gui.panel.PanelImage LogoImage;
    private javax.swing.JLabel SLECopyright;
    // End of variables declaration//GEN-END:variables
}
