/*
mainFrame.java is part of a separate independent package that demonstrates basic GUI prototype with
transitions (but no real data processing). They are not the actual project, but rather an early concept of
basic frames.

Run this class (mainFrame.java) to test out the multiple frames and their buttons.

Completed: 1/22/18

Created by:
    Alec Barker
    Jarrod Luca
    Cierra Roller
*/

package guiPrototypeFrames;

import javax.swing.JFrame;

public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    private frameOne f1;
    private frameTwo f2;
    
    
    public mainFrame() {
        initComponents();
        
        f1 = new frameOne(this);
        f1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        f1.setVisible(false);
//        
        f2 = new frameTwo(this);
        f2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        f2.setVisible(false);
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameOneButton = new javax.swing.JButton();
        frameTwoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        frameOneButton.setText("open frame one");
        frameOneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frameOneButtonActionPerformed(evt);
            }
        });

        frameTwoButton.setText("open frame two");
        frameTwoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frameTwoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(frameTwoButton)
                    .addComponent(frameOneButton))
                .addGap(142, 142, 142))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(frameOneButton)
                .addGap(56, 56, 56)
                .addComponent(frameTwoButton)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void frameOneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frameOneButtonActionPerformed
        f1.setLocation(this.getLocation());
        f1.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_frameOneButtonActionPerformed

    private void frameTwoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frameTwoButtonActionPerformed
        f2.setLocation(this.getLocation());
        f2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_frameTwoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton frameOneButton;
    private javax.swing.JButton frameTwoButton;
    // End of variables declaration//GEN-END:variables
}
