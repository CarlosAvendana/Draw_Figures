package view;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDeDibujo = new javax.swing.JScrollPane();
        VentanaDibujo = new javax.swing.JPanel();
        PanelTextoScroll = new javax.swing.JScrollPane();
        panelTexto = new javax.swing.JTextPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        loadFileOption = new javax.swing.JMenuItem();
        informationMenu = new javax.swing.JMenu();
        DeveloperInfoOption = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(755, 486));

        VentanaDibujo.setPreferredSize(new java.awt.Dimension(1000, 1000));

        javax.swing.GroupLayout VentanaDibujoLayout = new javax.swing.GroupLayout(VentanaDibujo);
        VentanaDibujo.setLayout(VentanaDibujoLayout);
        VentanaDibujoLayout.setHorizontalGroup(
            VentanaDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        VentanaDibujoLayout.setVerticalGroup(
            VentanaDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );

        panelDeDibujo.setViewportView(VentanaDibujo);

        PanelTextoScroll.setViewportView(panelTexto);

        fileMenu.setText("File");

        loadFileOption.setText("Load");
        fileMenu.add(loadFileOption);

        menuBar.add(fileMenu);

        informationMenu.setText("Information");

        DeveloperInfoOption.setText("Developers");
        DeveloperInfoOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeveloperInfoOptionActionPerformed(evt);
            }
        });
        informationMenu.add(DeveloperInfoOption);

        menuBar.add(informationMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDeDibujo, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(PanelTextoScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelDeDibujo, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(PanelTextoScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeveloperInfoOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeveloperInfoOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeveloperInfoOptionActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem DeveloperInfoOption;
    private javax.swing.JScrollPane PanelTextoScroll;
    private javax.swing.JPanel VentanaDibujo;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu informationMenu;
    private javax.swing.JMenuItem loadFileOption;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JScrollPane panelDeDibujo;
    private javax.swing.JTextPane panelTexto;
    // End of variables declaration//GEN-END:variables
}
