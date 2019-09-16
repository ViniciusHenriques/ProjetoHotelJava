/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.UIManager;

/**
 *
 * @author Vinicius
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        
        setExtendedState(MAXIMIZED_BOTH);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jAreaTrabalho = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiCadFun = new javax.swing.JMenuItem();
        jmiCadReserva = new javax.swing.JMenuItem();
        jmiCadQuarto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiManFun = new javax.swing.JMenuItem();
        jmiManHospede = new javax.swing.JMenuItem();
        jmiManQuarto = new javax.swing.JMenuItem();
        jmiManReserva = new javax.swing.JMenuItem();
        jmSAir = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("Cadastro");

        jmiCadFun.setText("Funcionário");
        jmiCadFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadFunActionPerformed(evt);
            }
        });
        jMenu1.add(jmiCadFun);

        jmiCadReserva.setText("Hospede/Reserva");
        jmiCadReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadReservaActionPerformed(evt);
            }
        });
        jMenu1.add(jmiCadReserva);

        jmiCadQuarto.setText("Quarto");
        jmiCadQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadQuartoActionPerformed(evt);
            }
        });
        jMenu1.add(jmiCadQuarto);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Manutenção");

        jmiManFun.setText("Funcionário");
        jmiManFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManFunActionPerformed(evt);
            }
        });
        jMenu2.add(jmiManFun);

        jmiManHospede.setText("Hospede");
        jmiManHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManHospedeActionPerformed(evt);
            }
        });
        jMenu2.add(jmiManHospede);

        jmiManQuarto.setText("Quarto");
        jmiManQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManQuartoActionPerformed(evt);
            }
        });
        jMenu2.add(jmiManQuarto);

        jmiManReserva.setText("Reserva");
        jmiManReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiManReservaActionPerformed(evt);
            }
        });
        jMenu2.add(jmiManReserva);

        jMenuBar1.add(jMenu2);

        jmSAir.setText("Sair");
        jmSAir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSAirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmSAir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jAreaTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jAreaTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void abrirCadFun(){
        UICadFuncionario gcp = new UICadFuncionario();
        jAreaTrabalho.add(gcp);
        gcp.setVisible(true);
    }//fecha método
    private void abrirCadHos(){
        UICadHospede gcp = new UICadHospede();
        jAreaTrabalho.add(gcp);
        gcp.setVisible(true);
    }//fecha método
    
    private void abrirManFun(){
        UIManFuncionario gmp = new UIManFuncionario();
        jAreaTrabalho.add(gmp);
        gmp.setVisible(true);
    }//fecha método
    private void abrirManHos(){
        UIManHospede gmp = new UIManHospede();
        jAreaTrabalho.add(gmp);
        gmp.setVisible(true);
    }//fecha método
    private void abrirManRes(){
        UIManRes gmp = new UIManRes();
        jAreaTrabalho.add(gmp);
        gmp.setVisible(true);
    }//fecha método
    
    private void abrirCadQua(){
        UICadQuarto gmp = new UICadQuarto();
        jAreaTrabalho.add(gmp);
        gmp.setVisible(true);
    }//fecha método
    private void abrirManQua(){
        UIManQuarto gmp = new UIManQuarto();
        jAreaTrabalho.add(gmp);
        gmp.setVisible(true);
    }//fecha método
    private void jmiCadFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadFunActionPerformed
        abrirCadFun();
    }//GEN-LAST:event_jmiCadFunActionPerformed

    private void jmiCadReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadReservaActionPerformed
        abrirCadHos();
    }//GEN-LAST:event_jmiCadReservaActionPerformed

    private void jmiManFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManFunActionPerformed
        abrirManFun();
    }//GEN-LAST:event_jmiManFunActionPerformed

    private void jmiManHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManHospedeActionPerformed
        abrirManHos();
    }//GEN-LAST:event_jmiManHospedeActionPerformed

    private void jmSAirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSAirActionPerformed
         System.exit(EXIT_ON_CLOSE);
    }//GEN-LAST:event_jmSAirActionPerformed

    private void jmiCadQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadQuartoActionPerformed
        abrirCadQua();
    }//GEN-LAST:event_jmiCadQuartoActionPerformed

    private void jmiManQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManQuartoActionPerformed
        abrirManQua();
    }//GEN-LAST:event_jmiManQuartoActionPerformed

    private void jmiManReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiManReservaActionPerformed
       abrirManRes();
    }//GEN-LAST:event_jmiManReservaActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
             com.jtattoo.plaf.acryl.AcrylLookAndFeel.setTheme("Red", "INSERT YOUR LICENSE KEY HERE", "my company");
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAreaTrabalho;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jmSAir;
    private javax.swing.JMenuItem jmiCadFun;
    private javax.swing.JMenuItem jmiCadQuarto;
    private javax.swing.JMenuItem jmiCadReserva;
    private javax.swing.JMenuItem jmiManFun;
    private javax.swing.JMenuItem jmiManHospede;
    private javax.swing.JMenuItem jmiManQuarto;
    private javax.swing.JMenuItem jmiManReserva;
    // End of variables declaration//GEN-END:variables
}
