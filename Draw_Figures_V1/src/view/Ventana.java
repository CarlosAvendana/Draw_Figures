package view;

import controller.Controller;
import java.awt.Graphics;
import java.awt.event.AdjustmentEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import model.Figure;
import java.io.File;
import javax.swing.JFileChooser;
import model.ReadFile;

public class Ventana extends javax.swing.JFrame {

    private final Controller control;

    public Ventana() {
        initComponents();
        control = new Controller();
        this.addScrollListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        ArrayList<Figure> lf = this.control.getFiguras();
        lf.forEach((f) -> f.dibujar(VentanaDibujo.getGraphics()));
    }

    private void addScrollListener(Ventana aux) {
        panelDeDibujo.getVerticalScrollBar().addAdjustmentListener((AdjustmentEvent e) -> {
            aux.repaint();
        });

        panelDeDibujo.getHorizontalScrollBar().addAdjustmentListener((AdjustmentEvent e) -> {
            aux.repaint();
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDeDibujo = new javax.swing.JScrollPane();
        VentanaDibujo = new javax.swing.JPanel();
        PanelTextoScroll = new javax.swing.JScrollPane();
        panelTexto = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        muestraMensajePantalla = new javax.swing.JTextArea();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        loadFileOption = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        VentanaDibujo.setPreferredSize(new java.awt.Dimension(2000, 2000));

        javax.swing.GroupLayout VentanaDibujoLayout = new javax.swing.GroupLayout(VentanaDibujo);
        VentanaDibujo.setLayout(VentanaDibujoLayout);
        VentanaDibujoLayout.setHorizontalGroup(
            VentanaDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2000, Short.MAX_VALUE)
        );
        VentanaDibujoLayout.setVerticalGroup(
            VentanaDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2000, Short.MAX_VALUE)
        );

        panelDeDibujo.setViewportView(VentanaDibujo);

        panelTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                panelTextoKeyReleased(evt);
            }
        });
        PanelTextoScroll.setViewportView(panelTexto);

        muestraMensajePantalla.setEditable(false);
        muestraMensajePantalla.setColumns(20);
        muestraMensajePantalla.setRows(5);
        jScrollPane1.setViewportView(muestraMensajePantalla);

        fileMenu.setText("File");

        loadFileOption.setText("Load");
        loadFileOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFileOptionActionPerformed(evt);
            }
        });
        fileMenu.add(loadFileOption);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDeDibujo, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelTextoScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelDeDibujo, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(PanelTextoScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextPane1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPane1KeyReleased

    }//GEN-LAST:event_jTextPane1KeyReleased

    private void panelTextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelTextoKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String comando = panelTexto.getText();
            comando = comando.concat(" ");
            control.dibujarFigura(comando, muestraMensajePantalla);
            panelTexto.setText("");
            this.repaint();
        }
    }//GEN-LAST:event_panelTextoKeyReleased

    private void loadFileOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFileOptionActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fc.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fc.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            ReadFile r = new ReadFile(selectedFile.getAbsolutePath());
            control.setListaFiguras(r.getListaFiguras());
            this.repaint();
        }
    }//GEN-LAST:event_loadFileOptionActionPerformed

    /**
     * @param args the command line arguments
     */
//    public void paint(Graphics g){
//        super.paint(g);
//        Graphics2D pg = (Graphics2D) g;
//        pg.drawOval(30, 30, 15, 15);
//    }
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
            @Override
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane PanelTextoScroll;
    private javax.swing.JPanel VentanaDibujo;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem loadFileOption;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextArea muestraMensajePantalla;
    private javax.swing.JScrollPane panelDeDibujo;
    private javax.swing.JTextPane panelTexto;
    // End of variables declaration//GEN-END:variables
}
