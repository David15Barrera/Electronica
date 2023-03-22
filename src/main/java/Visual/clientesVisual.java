package Visual;

import Clases.Clientes;
import Clases.ClientesDao;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class clientesVisual extends javax.swing.JPanel {
    Clientes clie = new Clientes();
    ClientesDao clientes = new ClientesDao();
    DefaultTableModel modelo = new DefaultTableModel();
    /**
     * Creates new form clientesVisual
     */
    public clientesVisual() {
        initComponents();
        listarClie();
        eventoTableClie();
    }
     public void eventoTableClie(){
                jtClientes.addMouseListener(new MouseAdapter()
                {
                 public void mousePressed(MouseEvent Mouse_evt){
                    
                    JTable table = (JTable) Mouse_evt.getSource();
                    Point point = Mouse_evt.getPoint();
                    int row = table.rowAtPoint(point);
                    if (Mouse_evt.getClickCount()==1){
                       txtNomClie.setText(jtClientes.getValueAt(jtClientes.getSelectedRow(), 2).toString());
                       txtApeClie.setText(jtClientes.getValueAt(jtClientes.getSelectedRow(), 3).toString());
                       txtDireClie.setText(jtClientes.getValueAt(jtClientes.getSelectedRow(), 4).toString());                     
                       txtDpiCli.setText(jtClientes.getValueAt(jtClientes.getSelectedRow(), 0).toString());
                       txtNitClie.setText(jtClientes.getValueAt(jtClientes.getSelectedRow(), 1).toString());
                       txtTelClie.setText(jtClientes.getValueAt(jtClientes.getSelectedRow(), 5).toString());
                    }
                }
    });
    }
     
    public void listarClie(){
        List<Clientes> ListarUser = clientes.ListarClientes();
        modelo = (DefaultTableModel) jtClientes.getModel();
        Object[] ob = new Object[6];
        for (int i = 0; i < ListarUser.size(); i++) {
            ob[0] = ListarUser.get(i).getDpi();
            ob[1] = ListarUser.get(i).getNit();
            ob[2] = ListarUser.get(i).getNombre();
            ob[3] = ListarUser.get(i).getApellido();
            ob[4] = ListarUser.get(i).getDireccion();
            ob[5] = ListarUser.get(i).getTelefono();
            modelo.addRow(ob);
        }
        jtClientes.setModel(modelo);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtClientes = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNomClie = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtApeClie = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtDireClie = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtDpiCli = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtNitClie = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jbModClie = new javax.swing.JButton();
        jbAgreClie = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtTelClie = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        txtBuscClie = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jblimpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Clientes");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DPI", "NIT", "Nombre", "Apellido", "Direccion", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtClientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 720, 290));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 760, 310));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Nombre");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Apellido");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("NIT");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, 20));

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Dirección");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("DPI");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        txtNomClie.setBackground(new java.awt.Color(255, 255, 255));
        txtNomClie.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txtNomClie.setForeground(new java.awt.Color(0, 0, 0));
        txtNomClie.setBorder(null);
        add(txtNomClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 180, 20));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 180, 10));

        txtApeClie.setBackground(new java.awt.Color(255, 255, 255));
        txtApeClie.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txtApeClie.setForeground(new java.awt.Color(0, 0, 0));
        txtApeClie.setBorder(null);
        add(txtApeClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 180, 20));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 180, 10));

        txtDireClie.setBackground(new java.awt.Color(255, 255, 255));
        txtDireClie.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txtDireClie.setForeground(new java.awt.Color(0, 0, 0));
        txtDireClie.setBorder(null);
        add(txtDireClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 240, 20));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 240, 10));

        txtDpiCli.setBackground(new java.awt.Color(255, 255, 255));
        txtDpiCli.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txtDpiCli.setForeground(new java.awt.Color(0, 0, 0));
        txtDpiCli.setBorder(null);
        add(txtDpiCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 180, 20));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 180, 10));

        txtNitClie.setBackground(new java.awt.Color(255, 255, 255));
        txtNitClie.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txtNitClie.setForeground(new java.awt.Color(0, 0, 0));
        txtNitClie.setBorder(null);
        add(txtNitClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 120, 20));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 120, 10));

        jbModClie.setText("Modificar");
        jbModClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModClieActionPerformed(evt);
            }
        });
        add(jbModClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 100, 30));

        jbAgreClie.setText("Agregar");
        jbAgreClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgreClieActionPerformed(evt);
            }
        });
        add(jbAgreClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 100, 30));

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Telefono");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, -1, 20));

        txtTelClie.setBackground(new java.awt.Color(255, 255, 255));
        txtTelClie.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txtTelClie.setForeground(new java.awt.Color(0, 0, 0));
        txtTelClie.setBorder(null);
        add(txtTelClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 160, 20));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 160, 10));

        txtBuscClie.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txtBuscClie.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscClie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBuscClie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscClieMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtBuscClieMouseReleased(evt);
            }
        });
        txtBuscClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscClieActionPerformed(evt);
            }
        });
        add(txtBuscClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 210, 30));

        jButton1.setBackground(new java.awt.Color(13, 71, 161));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buscar");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 90, 30));

        jblimpiar.setText("Limpiar");
        jblimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblimpiarActionPerformed(evt);
            }
        });
        add(jblimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 90, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgreClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgreClieActionPerformed
        // TODO add your handling code here:
         if(txtNomClie.getText().equals("") || txtApeClie.getText().equals("") || txtDpiCli.getText().equals("") || txtNitClie.getText().equals("") || txtDireClie.getText().equals("") || txtTelClie.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Todo los campos son requeridos");
            }else{
                                 String[] opciones = {"SI","NO"};

                    int n = JOptionPane.showOptionDialog(this,"¿Todo Correcto?","AGREGAR",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,"");

                    if (n == JOptionPane.YES_OPTION) {
                        //TU CODIGO SI SI
                            String dpi = txtDpiCli.getText();
                            String nit = txtNitClie.getText();
                            String nom = txtNomClie.getText();
                            String ape = txtApeClie.getText();
                            String dire = txtDireClie.getText();
                            int tel = Integer.valueOf(txtTelClie.getText());
                            clie.setDpi(dpi);
                            clie.setNit(nit);
                            clie.setNombre(nom);
                            clie.setApellido(ape);
                            clie.setDireccion(dire);
                            clie.setTelefono(tel);
                            
                            clientes.insertarClie(clie);
                            JOptionPane.showMessageDialog(null, "Cliente Registrado");
                            limTable();
                            listarClie();
                            limpDatostxt();
                            System.out.println("Agregado");
                    }else if (n == JOptionPane.NO_OPTION) {
                        //TU CODIGO SI NO
                          JOptionPane.showMessageDialog(null, "Registrado Cancelado");
                    }
                    
         }
    }//GEN-LAST:event_jbAgreClieActionPerformed

    private void jbModClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModClieActionPerformed
        // TODO add your handling code here:
       String[] opciones = {"SI","NO"};
      if ("".equals(txtDpiCli.getText())) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        } else{
            int n = JOptionPane.showOptionDialog(this,"¿Que Desea Hacer?","Modificar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,"");

             if (n == JOptionPane.YES_OPTION) {
             if (!"".equals(txtNomClie.getText()) || !"".equals(txtApeClie.getText()) || !"".equals(txtNitClie.getText()) || !"".equals(txtTelClie.getText()) || !"".equals(txtDireClie.getText())) {
                
                
                clie.setDpi(txtDpiCli.getText());
                clie.setNit(txtNitClie.getText());
                clie.setNombre(txtNomClie.getText());
                clie.setApellido(txtApeClie.getText());
                clie.setDireccion(txtDireClie.getText());
                clie.setTelefono(Integer.valueOf(txtTelClie.getText()));
                clientes.ModificarCliente(clie);
                JOptionPane.showMessageDialog(null, "Cliente Modificado");
                
                limTable();
                listarClie();
                limpDatostxt();
                

            }
             }else if (n == JOptionPane.NO_OPTION) {
             //TU CODIGO SI NO
         JOptionPane.showMessageDialog(null, "Operacion Cancelada");

        } 
        }    
    }//GEN-LAST:event_jbModClieActionPerformed

    private void txtBuscClieMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscClieMousePressed
        if(txtBuscClie.getText().equals("Ingrese el nombre de usuario a buscar"))
        txtBuscClie.setText("");
    }//GEN-LAST:event_txtBuscClieMousePressed

    private void txtBuscClieMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscClieMouseReleased
        //nothing
    }//GEN-LAST:event_txtBuscClieMouseReleased

    private void txtBuscClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscClieActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtBuscClieActionPerformed

    private void jblimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblimpiarActionPerformed
        // TODO add your handling code here:
         limpDatostxt();
    }//GEN-LAST:event_jblimpiarActionPerformed
   public void limpDatostxt(){
       txtNomClie.setText("");
       txtApeClie.setText("");
       txtDireClie.setText("");
       txtDpiCli.setText("");
       txtNitClie.setText("");
       txtTelClie.setText("");
   }
    public void limTable(){
         DefaultTableModel temp = (DefaultTableModel) jtClientes.getModel();
    int filas = jtClientes.getRowCount();

        for (int a = 0; filas > a; a++) {
            temp.removeRow(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton jbAgreClie;
    private javax.swing.JButton jbModClie;
    private javax.swing.JButton jblimpiar;
    private javax.swing.JTable jtClientes;
    private javax.swing.JTextField txtApeClie;
    private javax.swing.JTextField txtBuscClie;
    private javax.swing.JTextField txtDireClie;
    private javax.swing.JTextField txtDpiCli;
    private javax.swing.JTextField txtNitClie;
    private javax.swing.JTextField txtNomClie;
    private javax.swing.JTextField txtTelClie;
    // End of variables declaration//GEN-END:variables
}
