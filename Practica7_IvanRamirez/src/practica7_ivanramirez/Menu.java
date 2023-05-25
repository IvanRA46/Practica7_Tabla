/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7_ivanramirez;

/**
 *
 * @author ivanc
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     * @param usuario
     * @param ing
     */
    
    PilaAlumnos pilaAlumnos = new PilaAlumnos();
    PilaLibros pilaLibros = new PilaLibros();
    PilaPrestamos pilaPrestamos = new PilaPrestamos();
    
    public Menu(String usuario, Ingreso ing) {
        initComponents();
        this.setLocationRelativeTo(null);
        jlblusuario.setText("Usuario:"+usuario);
       
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblusuario = new javax.swing.JLabel();
        jbtnSalir = new javax.swing.JButton();
        jlblBienvenido = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAlumnos = new javax.swing.JMenu();
        itemRegistrarA = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemMostrarA = new javax.swing.JMenuItem();
        menuLibros = new javax.swing.JMenu();
        itemRegistrarL = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        itemMostrarL = new javax.swing.JMenuItem();
        menuPrestamos = new javax.swing.JMenu();
        itemRegistrarP = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itemMostrarP = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlblusuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblusuario.setForeground(new java.awt.Color(255, 0, 51));
        jlblusuario.setText("Usuario: ");
        jlblusuario.setName("jlblusuario"); // NOI18N

        jbtnSalir.setText("Salir");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        jlblBienvenido.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jlblBienvenido.setText("Bienvenido!");

        menuAlumnos.setText("Alumnos");

        itemRegistrarA.setText("Registrar");
        itemRegistrarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistrarAActionPerformed(evt);
            }
        });
        menuAlumnos.add(itemRegistrarA);
        menuAlumnos.add(jSeparator1);

        itemMostrarA.setText("Mostrar");
        itemMostrarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMostrarAActionPerformed(evt);
            }
        });
        menuAlumnos.add(itemMostrarA);

        jMenuBar1.add(menuAlumnos);

        menuLibros.setText("Libros");

        itemRegistrarL.setText("Registrar");
        itemRegistrarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistrarLActionPerformed(evt);
            }
        });
        menuLibros.add(itemRegistrarL);
        menuLibros.add(jSeparator3);

        itemMostrarL.setText("Mostrar");
        itemMostrarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMostrarLActionPerformed(evt);
            }
        });
        menuLibros.add(itemMostrarL);

        jMenuBar1.add(menuLibros);

        menuPrestamos.setText("Prestamos");

        itemRegistrarP.setText("Registrar");
        itemRegistrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistrarPActionPerformed(evt);
            }
        });
        menuPrestamos.add(itemRegistrarP);
        menuPrestamos.add(jSeparator2);

        itemMostrarP.setText("Mostrar");
        itemMostrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMostrarPActionPerformed(evt);
            }
        });
        menuPrestamos.add(itemMostrarP);

        jMenuBar1.add(menuPrestamos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnSalir)
                .addGap(162, 162, 162))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jlblusuario))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jlblBienvenido)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jlblBienvenido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlblusuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jbtnSalir)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemRegistrarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistrarAActionPerformed
       RegistrarAlumno ra = new RegistrarAlumno(this, pilaAlumnos);
       this.setVisible(false);
       ra.setVisible(true);
       ra.setLocationRelativeTo(null);
    }//GEN-LAST:event_itemRegistrarAActionPerformed

    private void itemMostrarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMostrarAActionPerformed
        MostrarAlumnos ma = new MostrarAlumnos(this, pilaAlumnos);
        this.setVisible(false);
        ma.setVisible(true);
        ma.setLocationRelativeTo(null);
    }//GEN-LAST:event_itemMostrarAActionPerformed

    private void itemRegistrarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistrarLActionPerformed
       RegistrarLibro ra = new RegistrarLibro(this, pilaLibros);
       this.setVisible(false);
       ra.setVisible(true);
       ra.setLocationRelativeTo(null);
    }//GEN-LAST:event_itemRegistrarLActionPerformed

    private void itemMostrarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMostrarLActionPerformed
       MostrarLibros ml = new MostrarLibros(this, pilaLibros);
       this.setVisible(false);
       ml.setVisible(true);
       ml.setLocationRelativeTo(null);
    }//GEN-LAST:event_itemMostrarLActionPerformed

    private void itemRegistrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistrarPActionPerformed
        RegistrarPrestamo rp = new RegistrarPrestamo(this, pilaPrestamos);
        this.setVisible(false);
        rp.setVisible(true);
        rp.setLocationRelativeTo(null);
    }//GEN-LAST:event_itemRegistrarPActionPerformed

    private void itemMostrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMostrarPActionPerformed
        MostrarPrestamos mp = new MostrarPrestamos(this, pilaPrestamos);
        this.setVisible(false);
        mp.setVisible(true);
        mp.setLocationRelativeTo(null);
    }//GEN-LAST:event_itemMostrarPActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtnSalirActionPerformed

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
            @Override
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemMostrarA;
    private javax.swing.JMenuItem itemMostrarL;
    private javax.swing.JMenuItem itemMostrarP;
    private javax.swing.JMenuItem itemRegistrarA;
    private javax.swing.JMenuItem itemRegistrarL;
    private javax.swing.JMenuItem itemRegistrarP;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JLabel jlblBienvenido;
    private javax.swing.JLabel jlblusuario;
    private javax.swing.JMenu menuAlumnos;
    private javax.swing.JMenu menuLibros;
    private javax.swing.JMenu menuPrestamos;
    // End of variables declaration//GEN-END:variables
}