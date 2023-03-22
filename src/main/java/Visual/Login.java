package Visual;

import Clases.Sucursal;
import Clases.SucursalDao;
import Clases.Usuarios;
import Clases.UsuariosDao;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Login extends javax.swing.JFrame {
    int xMouse, yMouse;   
    Usuarios l = new Usuarios();
    UsuariosDao usuarios = new UsuariosDao();
    Sucursal sucu = new Sucursal();
    SucursalDao sucursal = new SucursalDao();
    /**
     * Creates new form Login
     */
    public Login() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jbIngresar = new javax.swing.JButton();
        jtPass = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jbExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ingrese Contraseña");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingrese Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        jtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jtUsuario.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jtUsuario.setForeground(new java.awt.Color(0, 0, 102));
        jtUsuario.setText("Ingrese usuario");
        jtUsuario.setBorder(null);
        jtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtUsuarioMousePressed(evt);
            }
        });
        jPanel1.add(jtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 230, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 230, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 230, 10));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("LOGIN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        jbIngresar.setBackground(new java.awt.Color(51, 102, 255));
        jbIngresar.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jbIngresar.setForeground(new java.awt.Color(255, 255, 255));
        jbIngresar.setText("INGRESAR");
        jbIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(jbIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 120, 40));

        jtPass.setBackground(new java.awt.Color(255, 255, 255));
        jtPass.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jtPass.setForeground(new java.awt.Color(0, 0, 102));
        jtPass.setText("********");
        jtPass.setBorder(null);
        jtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtPassMousePressed(evt);
            }
        });
        jPanel1.add(jtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 230, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 33, 740, 460));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbExit.setBackground(new java.awt.Color(204, 0, 0));
        jbExit.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jbExit.setForeground(new java.awt.Color(255, 255, 255));
        jbExit.setText("X");
        jbExit.setBorder(null);
        jbExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitActionPerformed(evt);
            }
        });
        jPanel2.add(jbExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 40, 33));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 32));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jbExitActionPerformed

    private void jtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtUsuarioMousePressed
        // TODO add your handling code here:
        if (jtUsuario.getText().equals("Ingrese usuario")){
            jtUsuario.setText("");
            jtUsuario.setForeground(new Color(0,0,102));
        }
        if (String.valueOf(jtPass.getPassword()).isEmpty()){
            jtPass.setText("********");
            jtPass.setForeground(new Color(0,0,102));   
        }
    }//GEN-LAST:event_jtUsuarioMousePressed

    private void jtPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPassMousePressed
        // TODO add your handling code here:
        
        if (String.valueOf(jtPass.getPassword()).equals("********")){
        jtPass.setText("");
        jtPass.setForeground(new Color(0,0,102));   
        }
        if (jtUsuario.getText().isEmpty()){
        jtUsuario.setText("Ingrese usuario");
        jtUsuario.setForeground(new Color(0,0,102));   
        }
    }//GEN-LAST:event_jtPassMousePressed

//Codigo para validar la entrada del Usuario
    public void validar(){
        String user = jtUsuario.getText();
        String pass = String.valueOf(jtPass.getPassword());
        
        if (!"".equals(user) || !"".equals(pass)) {
          l = usuarios.log(user);
            if (pass.equals(l.getContras())) {
                if(l.getCargo().equals("administrador")){
                    Inicio inicio = new Inicio();
                    inicio.setVisible(true);
                    this.setVisible(false);   
                }else if(l.getCargo().equals("vendedor")){
                    Empleados inicio = new Empleados();
                    inicio.jlApellido.setText(l.getApellido());
                    inicio.jlNombre.setText(l.getNombre());
                    inicio.txtCargo.setText(l.getCargo());
                    inicio.jlNumSucursal.setText(String.valueOf(l.getSucuriduser()));
                        sucu = sucursal.BuscarSucId(l.getSucuriduser());
                        inicio.jlSucursal.setText(sucu.getUbicacion());
                    inicio.setVisible(true);
                    this.setVisible(false);   
                }          
            }else {
               JOptionPane.showMessageDialog(null, "Correo o la Contraseña incorrecta");   
                  }
        }
    }
        
    
    private void jbIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIngresarActionPerformed
        // TODO add your handling code here:
        validar();        
    }//GEN-LAST:event_jbIngresarActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x- xMouse,y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbExit;
    private javax.swing.JButton jbIngresar;
    private javax.swing.JPasswordField jtPass;
    private javax.swing.JTextField jtUsuario;
    // End of variables declaration//GEN-END:variables

    private void Swicht() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
