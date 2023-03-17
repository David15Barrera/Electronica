package Visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Inicio extends javax.swing.JFrame {
   //Variables de la posición
        int xMouse, yMouse;     
    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();


   // Codigo para la fecha    
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre"
            ,"Octubre","Noviembre","Diciembre"};
        txtfecha.setText("Fecha: "+dia+" de "+meses[month - 1]+" de "+year);
   
    //Codigo para la hora
            DateTimeFormatter formateador = DateTimeFormatter.ofPattern("HH:mm:ss");
        Runnable runnable = new Runnable() {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(500);
                    txthora.setText(formateador.format(LocalDateTime.now()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };
    Thread hilo = new Thread(runnable);
    hilo.start();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbCerrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txthora = new javax.swing.JLabel();
        txtfecha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtCargo = new javax.swing.JLabel();
        jpPrincipal = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jpUsuarios = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jpreportes = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(13, 71, 161));
        panel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelMouseDragged(evt);
            }
        });
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMousePressed(evt);
            }
        });
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Usuario");
        panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 60, 30));

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre");
        panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 190, 30));

        jbCerrar.setBackground(new java.awt.Color(204, 0, 0));
        jbCerrar.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jbCerrar.setForeground(new java.awt.Color(255, 255, 255));
        jbCerrar.setText("X");
        jbCerrar.setBorder(null);
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });
        panel.add(jbCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 30, 30));

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 30));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txthora.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txthora.setForeground(new java.awt.Color(255, 255, 255));
        txthora.setText("Hora");
        jPanel2.add(txthora, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 120, 30));

        txtfecha.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txtfecha.setForeground(new java.awt.Color(255, 255, 255));
        txtfecha.setText("Fecha:");
        jPanel2.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 290, 30));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 190, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 800, 30));

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setAutoscrolls(true);

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 800, 540));

        jPanel1.setBackground(new java.awt.Color(13, 71, 161));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 140, 20));

        txtCargo.setBackground(new java.awt.Color(255, 255, 255));
        txtCargo.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txtCargo.setForeground(new java.awt.Color(255, 255, 255));
        txtCargo.setText("Cargo");
        jPanel1.add(txtCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 140, 20));

        jpPrincipal.setBackground(new java.awt.Color(51, 102, 255));
        jpPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpPrincipalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpPrincipalMousePressed(evt);
            }
        });
        jpPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Principal");
        jpPrincipal.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 80, 50));

        jPanel1.add(jpPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 160, 50));

        jpUsuarios.setBackground(new java.awt.Color(0, 102, 204));
        jpUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpUsuariosMouseExited(evt);
            }
        });
        jpUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Usuarios");
        jpUsuarios.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 80, 50));

        jPanel1.add(jpUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 160, 50));

        jpreportes.setBackground(new java.awt.Color(0, 102, 204));
        jpreportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpreportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpreportesMouseExited(evt);
            }
        });
        jpreportes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Reportes");
        jpreportes.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 80, 50));

        jPanel1.add(jpreportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 160, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jpPrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPrincipalMousePressed
        // TODO add your handling code here:
       principal p1 = new principal();
       p1.setSize(810, 530);
       p1.setLocation(0,0);
        
       content.removeAll();
       content.add(p1, BorderLayout.CENTER);
       content.revalidate();
       content.repaint();
    }//GEN-LAST:event_jpPrincipalMousePressed

    private void jpPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPrincipalMouseEntered
        // TODO add your handling code here:[13,71,161]
        jpPrincipal.setBackground(new Color(13, 71, 161));
    }//GEN-LAST:event_jpPrincipalMouseEntered

    private void jpPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpPrincipalMouseExited
        // TODO add your handling code here:
        jpPrincipal.setBackground(new Color(51,102,255));
    }//GEN-LAST:event_jpPrincipalMouseExited

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        // TODO add your handling code here:
                          String[] opciones = {"SI","NO"};
          int n = JOptionPane.showOptionDialog(this,"¿Desea Cerrar Sesión?","CONFIRMAR",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,"");

                    if (n == JOptionPane.YES_OPTION) {
                        //TU CODIGO SI SI
                        Login cerrar = new Login();
                        cerrar.setVisible(true);
                        this.setVisible(false);
                        
                    }else if (n == JOptionPane.NO_OPTION) {
                        //TU CODIGO SI NO
                          JOptionPane.showMessageDialog(null, "Abortando Proceso");
                    }
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelMousePressed

    private void panelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x- xMouse,y - yMouse);
    }//GEN-LAST:event_panelMouseDragged

    private void jpUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpUsuariosMouseEntered
        // TODO add your handling code here:[51,153,255]
      jpUsuarios.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_jpUsuariosMouseEntered

    private void jpUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpUsuariosMouseExited
        // TODO add your handling code here:[0,102,204]
      jpUsuarios.setBackground(new Color(0, 102, 204));
    }//GEN-LAST:event_jpUsuariosMouseExited

    private void jpreportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpreportesMouseEntered
        // TODO add your handling code here:
      jpreportes.setBackground(new Color(51, 153, 255));
    }//GEN-LAST:event_jpreportesMouseEntered

    private void jpreportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpreportesMouseExited
        // TODO add your handling code here:
      jpreportes.setBackground(new Color(0, 102, 204));
    }//GEN-LAST:event_jpreportesMouseExited

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JPanel jpUsuarios;
    private javax.swing.JPanel jpreportes;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel txtCargo;
    private javax.swing.JLabel txtfecha;
    private javax.swing.JLabel txthora;
    // End of variables declaration//GEN-END:variables
}
