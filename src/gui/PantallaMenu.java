package gui;

import conexionBD.Conexion;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Anthony
 */
public class PantallaMenu extends javax.swing.JFrame {

    PantallaDeposito pd = new PantallaDeposito();
    PantallaRetiro pr = new PantallaRetiro();
    PantallaTransferencia pt = new PantallaTransferencia();
    PantallaTransacciones ptransacciones = new PantallaTransacciones();
    Conexion conexion = new Conexion();
    int xMouse, yMouse;
    
    /**
     * Creates new form PantallaMenu
     */
    public PantallaMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnTransacciones = new javax.swing.JLabel();
        btnDeposito = new javax.swing.JLabel();
        btnRetiro = new javax.swing.JLabel();
        btnTransferencia = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JLabel();
        btnFondos = new javax.swing.JLabel();
        btnMover = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTransacciones.setBackground(new java.awt.Color(255, 255, 255));
        btnTransacciones.setFont(new java.awt.Font("Roboto", 0, 25)); // NOI18N
        btnTransacciones.setForeground(new java.awt.Color(0, 0, 0));
        btnTransacciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTransacciones.setText("Historial de Transacciones");
        btnTransacciones.setOpaque(true);
        btnTransacciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTransaccionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTransaccionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTransaccionesMouseExited(evt);
            }
        });
        jPanel1.add(btnTransacciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 510, 50));

        btnDeposito.setBackground(new java.awt.Color(255, 255, 255));
        btnDeposito.setFont(new java.awt.Font("Roboto", 0, 25)); // NOI18N
        btnDeposito.setForeground(new java.awt.Color(0, 0, 0));
        btnDeposito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDeposito.setText("Depósito");
        btnDeposito.setOpaque(true);
        btnDeposito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDepositoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDepositoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDepositoMouseExited(evt);
            }
        });
        jPanel1.add(btnDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 510, 50));

        btnRetiro.setBackground(new java.awt.Color(255, 255, 255));
        btnRetiro.setFont(new java.awt.Font("Roboto", 0, 25)); // NOI18N
        btnRetiro.setForeground(new java.awt.Color(0, 0, 0));
        btnRetiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRetiro.setText("Retiro");
        btnRetiro.setOpaque(true);
        btnRetiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRetiroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRetiroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRetiroMouseExited(evt);
            }
        });
        jPanel1.add(btnRetiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 510, 50));

        btnTransferencia.setBackground(new java.awt.Color(255, 255, 255));
        btnTransferencia.setFont(new java.awt.Font("Roboto", 0, 25)); // NOI18N
        btnTransferencia.setForeground(new java.awt.Color(0, 0, 0));
        btnTransferencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTransferencia.setText("Transferencia");
        btnTransferencia.setOpaque(true);
        btnTransferencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTransferenciaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTransferenciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTransferenciaMouseExited(evt);
            }
        });
        jPanel1.add(btnTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 510, 50));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Menú Principal");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 500, 50));

        btnCerrarSesion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(102, 102, 102));
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
        });
        jPanel1.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, -1, -1));

        btnFondos.setBackground(new java.awt.Color(255, 255, 255));
        btnFondos.setFont(new java.awt.Font("Roboto", 0, 25)); // NOI18N
        btnFondos.setForeground(new java.awt.Color(0, 0, 0));
        btnFondos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFondos.setText("Fondos");
        btnFondos.setOpaque(true);
        btnFondos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFondosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFondosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFondosMouseExited(evt);
            }
        });
        jPanel1.add(btnFondos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 510, 50));

        btnMover.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btnMoverMouseDragged(evt);
            }
        });
        btnMover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMoverMousePressed(evt);
            }
        });
        jPanel1.add(btnMover, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 470, 30));

        btnSalir.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(173, 193, 137));
        btnSalir.setText("x");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 30));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(173, 193, 137));
        jLabel6.setText("x");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDepositoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepositoMouseEntered
        btnDeposito.setBackground(Color.decode("#BCCC9E"));
    }//GEN-LAST:event_btnDepositoMouseEntered

    private void btnDepositoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepositoMouseExited
        btnDeposito.setBackground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_btnDepositoMouseExited

    private void btnRetiroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetiroMouseEntered
        btnRetiro.setBackground(Color.decode("#BCCC9E"));
    }//GEN-LAST:event_btnRetiroMouseEntered

    private void btnRetiroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetiroMouseExited
        btnRetiro.setBackground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_btnRetiroMouseExited

    private void btnTransferenciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransferenciaMouseEntered
        btnTransferencia.setBackground(Color.decode("#BCCC9E"));
    }//GEN-LAST:event_btnTransferenciaMouseEntered

    private void btnTransferenciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransferenciaMouseExited
        btnTransferencia.setBackground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_btnTransferenciaMouseExited

    private void btnTransaccionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransaccionesMouseEntered
        btnTransacciones.setBackground(Color.decode("#BCCC9E"));
    }//GEN-LAST:event_btnTransaccionesMouseEntered

    private void btnTransaccionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransaccionesMouseExited
        btnTransacciones.setBackground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_btnTransaccionesMouseExited

    private void btnDepositoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepositoMouseClicked
        pd.show();
        this.hide();
    }//GEN-LAST:event_btnDepositoMouseClicked

    private void btnRetiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetiroMouseClicked
        pr.show();
        this.hide();
    }//GEN-LAST:event_btnRetiroMouseClicked

    private void btnTransferenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransferenciaMouseClicked
        pt.show();
        this.hide();
    }//GEN-LAST:event_btnTransferenciaMouseClicked

    private void btnTransaccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransaccionesMouseClicked
        ptransacciones.show();
        this.hide();
    }//GEN-LAST:event_btnTransaccionesMouseClicked

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        PantallaLogeo pl = new PantallaLogeo();
        pl.show();
        this.hide();
        JOptionPane.showMessageDialog(null, "Sesión cerrada correctamente.");
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    private void btnFondosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFondosMouseClicked
        PantallaLogeo pl = new PantallaLogeo();
        String sql = "select fondos from cuentas where cedula_cliente='"+pl.cedula+"'";
        boolean encontrado = false;
        
        //Proceso de conexion con la base de datos para mostrar fondos del usuario.
        try{
            conexion.conectar();
            Statement st = conexion.cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if(rs.next()){
                JOptionPane.showMessageDialog(null, rs.getString("fondos"), "Fondos:",-1);
                encontrado = true;
            }
        }catch(SQLException ex){
            System.out.println("");
        }
        if(encontrado ==false){
            JOptionPane.showMessageDialog(null, "Su cuenta no posee fondos.", "Fondos:",-1);
        }
        
    }//GEN-LAST:event_btnFondosMouseClicked

    private void btnFondosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFondosMouseEntered
        btnFondos.setBackground(Color.decode("#BCCC9E"));
    }//GEN-LAST:event_btnFondosMouseEntered

    private void btnFondosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFondosMouseExited
        btnFondos.setBackground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_btnFondosMouseExited

    private void btnMoverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMoverMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_btnMoverMousePressed

    private void btnMoverMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMoverMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_btnMoverMouseDragged

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        Object [] opciones = {"Sí","No"};
        int salir = JOptionPane.showOptionDialog(null, "¿Desea salir?", null, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, null);
        if(salir == JOptionPane.YES_OPTION){
            System.exit(0);
        }    
    }//GEN-LAST:event_btnSalirMouseClicked

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
            java.util.logging.Logger.getLogger(PantallaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCerrarSesion;
    private javax.swing.JLabel btnDeposito;
    private javax.swing.JLabel btnFondos;
    private javax.swing.JLabel btnMover;
    private javax.swing.JLabel btnRetiro;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel btnTransacciones;
    private javax.swing.JLabel btnTransferencia;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}